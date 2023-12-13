package com.example.qlnv.Adapters;


import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import com.example.qlnv.Module.nhanVien;
import com.example.qlnv.Module.tool;
import com.example.qlnv.ModuleChucNang.ChamCongActivity;
import com.example.qlnv.ModuleChucNang.NghiPhepActivity;
import com.example.qlnv.R;

import java.util.ArrayList;

public class ToolAdapters extends ArrayAdapter{
    Context contextTool =getContext();
    Intent intentNghiPhep = new Intent(contextTool, NghiPhepActivity.class);
    Intent intentChamCong = new Intent(contextTool, ChamCongActivity.class);

    Activity context ;
    int resource;
    ArrayList<tool> listTool ,listToolBackup;

    public ToolAdapters(Activity context, int resource ,ArrayList<tool> listT) {
        super(context, resource);
        this.context=context;
        this.resource=resource;
        this.listTool=this.listToolBackup=listT;
    }

    @Override
    public int getCount() {
        return listTool.size();
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        LayoutInflater inflater=this.context.getLayoutInflater();
        View customView =inflater.inflate(this.resource,null);

        ImageView imgLogo =customView.findViewById(R.id.imgLogo);

        Button btnView =customView.findViewById(R.id.btnView);

        tool tl =this.listTool.get(position);
        imgLogo.setImageResource(tl.getLogoChucNang());
        btnView.setText(tl.getTenChucNang());

        btnView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String kq = tl.getTenChucNang();

                switch (position){
                    case 0:
                        Toast.makeText(context, kq+position,Toast.LENGTH_SHORT).show();
                        context.startActivity(intentNghiPhep);
                        break;
                    case 1:
                        Toast.makeText(context, kq+position,Toast.LENGTH_SHORT).show();
                        context.startActivity(intentChamCong);
                        break;
                    case 2:
                        Toast.makeText(context, kq+position,Toast.LENGTH_SHORT).show();
                        break;
                    case 3:
                        Toast.makeText(context, kq+position,Toast.LENGTH_SHORT).show();
                        break;
                    case 4:
                        Toast.makeText(context, kq+position,Toast.LENGTH_SHORT).show();
                        break;
                    case 5:
                        Toast.makeText(context, kq+position,Toast.LENGTH_SHORT).show();
                        break;
                    case 6:
                        Toast.makeText(context, kq+position,Toast.LENGTH_SHORT).show();
                        break;
                    default:
                        throw new IllegalStateException("Unexpected value: " + position);
                }



            }


        });
        return customView;
    }


}
