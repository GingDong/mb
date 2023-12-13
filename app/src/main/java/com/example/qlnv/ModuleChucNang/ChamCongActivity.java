package com.example.qlnv.ModuleChucNang;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import com.example.qlnv.Module.nhanVien;
import com.example.qlnv.R;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

import java.util.HashMap;
import java.util.Map;

public class ChamCongActivity extends AppCompatActivity  {
    Button btnChamCong;
   TextView textChamCong;
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cham_cong);

        TextView textChamCong= findViewById(R.id.textChamCong);
        Button btnChamCong=findViewById(R.id.btnChamCong);
        Intent intent=getIntent();
        nhanVien DuLieuNhanVienNhanVe= (nhanVien) intent.getParcelableExtra("ChamCong");
        int i= intent.getIntExtra("id",0);
        textChamCong.setText("số ngày chấm công :"+DuLieuNhanVienNhanVe.getSoNgayChamCong());


        btnChamCong.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String duLieu=String.valueOf(i);
                int soNgayChamCong=DuLieuNhanVienNhanVe.getSoNgayChamCong()+1;
                FirebaseDatabase database = FirebaseDatabase.getInstance();
                DatabaseReference myRef = database.getReference("nhanvien");;
                myRef.child(duLieu).child("soNgayChamCong").setValue(soNgayChamCong);
                textChamCong.setText("số ngày chấm công :"+soNgayChamCong);
            }
        });





    }



}