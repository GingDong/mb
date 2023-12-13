package com.example.qlnv.Module;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.qlnv.ModuleChucNang.ChamCongActivity;
import com.example.qlnv.R;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

public class loginActivity extends AppCompatActivity {
    EditText edtPassword ,edtUsername;
    Button BtnDangNhap;
    @Override
    protected void onCreate(Bundle savedInstanceState) {

        Intent intentMainNhanVien=new Intent(this, MainNhanVienActivity.class);
        Intent intentMainQuanLy=new Intent(this,MainQuanLyActivity.class);
       
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        edtUsername =findViewById(R.id.edtUsername);
        edtPassword =findViewById(R.id.edtPassword);
        //lay du lieu nhan vien
        listNV  danhSachNV= new listNV();
        FirebaseDatabase database = FirebaseDatabase.getInstance();
        DatabaseReference myRef = database.getReference();
        myRef.child("nhanvien").addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot snapshot) {
                for (DataSnapshot snap: snapshot.getChildren()){
                    nhanVien nv = snap.getValue(nhanVien.class);
                    danhSachNV.themNV(nv);
                }

            }

            @Override
            public void onCancelled(@NonNull DatabaseError error) {

            }
        });


        //dnag nhap nhan vien
        BtnDangNhap =findViewById(R.id.BtnDangNhap);
        BtnDangNhap.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String username = edtUsername.getText().toString();
                String password = edtPassword.getText().toString();
                String maQl = "ql";
                boolean flag = true;
                nhanVien nv = null;
                for (int i = 0; i < danhSachNV.getListNhanVien().size(); i++) {
                    if (username.equals(danhSachNV.getListNhanVien().get(i).getMaNV().toString()) && password.equals(danhSachNV.getListNhanVien().get(i).getMaKhau().toString())) {
                        nv = danhSachNV.getListNhanVien().get(i);
                        intentMainNhanVien.putExtra("id",i+1);
                        intentMainNhanVien.putExtra("key", nv);
                        flag = false;

                        if (maQl.equals(danhSachNV.getListNhanVien().get(i).getMaChucVu())) {
                            Toast.makeText(loginActivity.this, "chao mừng quan lý", Toast.LENGTH_SHORT).show();
                            startActivity(intentMainQuanLy);
                        } else {

                            Toast.makeText(loginActivity.this, "chao Mừng nhân viên", Toast.LENGTH_SHORT).show();
                            startActivity(intentMainNhanVien);

                        }
                        break;
                    }


                }
                if (flag == true) {
                    Toast.makeText(loginActivity.this, "sai mật khẩu", Toast.LENGTH_SHORT).show();
                }


            }
        });








    }
}