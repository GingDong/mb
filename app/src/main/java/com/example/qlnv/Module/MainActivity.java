package com.example.qlnv.Module;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

import com.example.qlnv.R;

import java.util.AbstractCollection;

public class MainActivity extends AppCompatActivity {

    private AbstractCollection<nhanVien> danhSachNV;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Handler handler = new Handler();
        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                nextActivity();
            }
        },1000);

        themDuLieu();
    }
    private void nextActivity() {
        Intent intent=new Intent(this,loginActivity.class);
        startActivity(intent);
    }



   public void  themDuLieu(){
//       nhanVien nv1 =new nhanVien("nguyen van a","ha noi" ,"nam",01212313214,"coder1","nv123","nv","97790006562","0","https://img.lovepik.com/free-png/20211210/lovepik-cartoon-worker-avatar-png-image_401462234_wh1200.png",0,0);
//
//
//            nhanVien nv2 =new nhanVien("nguyen van a","ha noi" ,"nam",01212313214,"coder"+i,"nv123","nv","97790006562","0","https://img.lovepik.com/free-png/20211210/lovepik-cartoon-worker-avatar-png-image_401462234_wh1200.png",0,0);
//            FirebaseDatabase database = FirebaseDatabase.getInstance();
//            DatabaseReference myRef = database.getReference("nhanvien").child("i");
//            myRef.setValue(nv2);
//        }


   }






}