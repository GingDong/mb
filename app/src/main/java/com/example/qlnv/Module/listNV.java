package com.example.qlnv.Module;

import java.util.ArrayList;

public class listNV {
    private ArrayList<nhanVien> listNhanVien;


// get set
    public ArrayList<nhanVien> getListNhanVien() {
        return listNhanVien;
    }

    public void setListNhanVien(ArrayList<nhanVien> listNhanVien) {
        this.listNhanVien = listNhanVien;
    }
    public listNV(){
        this.listNhanVien = new ArrayList<nhanVien>();
    }

    public void themNV(nhanVien nv) {
        this.listNhanVien.add(nv);
    }
}
