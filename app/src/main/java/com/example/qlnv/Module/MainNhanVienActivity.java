package com.example.qlnv.Module;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.example.qlnv.Adapters.ToolAdapters;
import com.example.qlnv.ModuleChucNang.ChamCongActivity;
import com.example.qlnv.ModuleChucNang.NghiPhepActivity;
import com.example.qlnv.R;

import java.util.ArrayList;

public class MainNhanVienActivity extends AppCompatActivity {
    GridView lvTool;
    ArrayList<tool> listTool;
    ToolAdapters adapterTool;

    TextView textName;
    ImageView imageTh,imageChamCong;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        Intent intentChamCong=new Intent(this, ChamCongActivity.class);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_nhan_vien);
        // nhận dữ liệu từ login
        Intent intent=getIntent();

        int i= intent.getIntExtra("id",1);
        nhanVien DuLieuNhanVienNhanVe= (nhanVien) intent.getParcelableExtra("key");

        TextView textName = findViewById(R.id.textName);
        textName.setText(DuLieuNhanVienNhanVe.getHoTen());



        ImageView imageChamCong= findViewById(R.id.imageChamCong);
        imageChamCong.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                intentChamCong.putExtra("ChamCong",DuLieuNhanVienNhanVe);
                intentChamCong.putExtra("id",i);
                startActivity(intentChamCong);
            }
        });







    }
}