package com.example.qlnv.Module;

public class person {
    protected  String hoTen;
    protected  String diaChi;
    protected  String gioiTinh;
    protected  int soCMND;

    // get set

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }

    public String getGioiTinh() {
        return gioiTinh;
    }

    public void setGioiTinh(String gioiTinh) {
        this.gioiTinh = gioiTinh;
    }

    public int getSoCMND() {
        return soCMND;
    }

    public void setSoCMND(int soCMND) {
        this.soCMND = soCMND;
    }
    // phuong thuc khoi tao
    public  person(){

    }

    public person(String hoTen, String diaChi, String gioiTinh, int soCMND) {
        this.hoTen = hoTen;
        this.diaChi = diaChi;
        this.gioiTinh = gioiTinh;
        this.soCMND = soCMND;
    }
}
