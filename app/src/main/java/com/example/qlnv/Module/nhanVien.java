package com.example.qlnv.Module;

import android.os.Parcel;
import android.os.Parcelable;

import androidx.annotation.NonNull;

public  class nhanVien  extends  person implements Parcelable  {

    private String maNV;
    private String maKhau;
    private String maChucVu;
    private String soDT;
    private   String Luong;
    private  String Avt;
    private  int soNgayNghi;
    private   int soNgayChamCong;

    protected nhanVien(Parcel in) {

        hoTen=in.readString();
        diaChi=in.readString();
        gioiTinh=in.readString();
        soCMND=in.readInt();
        maNV = in.readString();
        maKhau = in.readString();
        maChucVu = in.readString();
        soDT = in.readString();
        Luong = in.readString();
        Avt = in.readString();
        soNgayNghi = in.readInt();
        soNgayChamCong = in.readInt();
    }

    public static final Creator<nhanVien> CREATOR = new Creator<nhanVien>() {
        @Override
        public nhanVien createFromParcel(Parcel in) {
            return new nhanVien(in);
        }

        @Override
        public nhanVien[] newArray(int size) {
            return new nhanVien[size];
        }
    };

    public String getMaNV() {
        return maNV;
    }

    public void setMaNV(String maNV) {
        this.maNV = maNV;
    }

    public String getMaKhau() {
        return maKhau;
    }

    public void setMaKhau(String maKhau) {
        this.maKhau = maKhau;
    }

    public String getMaChucVu() {
        return maChucVu;
    }

    public void setMaChucVu(String maChucVu) {
        this.maChucVu = maChucVu;
    }

    public String getSoDT() {
        return soDT;
    }

    public void setSoDT(String soDT) {
        this.soDT = soDT;
    }

    public String getLuong() {
        return Luong;
    }

    public void setLuong(String luong) {
        Luong = luong;
    }

    public String getAvt() {
        return Avt;
    }

    public void setAvt(String avt) {
        Avt = avt;
    }

    public int getSoNgayNghi() {
        return soNgayNghi;
    }

    public void setSoNgayNghi(int soNgayNghi) {
        this.soNgayNghi = soNgayNghi;
    }

    public int getSoNgayChamCong() {
        return soNgayChamCong;
    }

    public void setSoNgayChamCong(int soNgayChamCong) {
        this.soNgayChamCong = soNgayChamCong;
    }

    public nhanVien(){
        super();
    }

    public nhanVien(String maNV, String maKhau, String maChucVu, String soDT, String luong, String avt, int soNgayNghi, int soNgayChamCong) {
        this.maNV = maNV;
        this.maKhau = maKhau;
        this.maChucVu = maChucVu;
        this.soDT = soDT;
        this.Luong = luong;
        this.Avt = avt;
        this.soNgayNghi = soNgayNghi;
        this.soNgayChamCong = soNgayChamCong;
    }

    public nhanVien(String hoTen, String diaChi, String gioiTinh, int soCMND, String maNV, String maKhau, String maChucVu, String soDT, String luong, String avt, int soNgayNghi, int soNgayChamCong) {
        super(hoTen, diaChi, gioiTinh, soCMND);
        this.maNV = maNV;
        this.maKhau = maKhau;
        this.maChucVu = maChucVu;
        this.soDT = soDT;
        Luong = luong;
        Avt = avt;
        this.soNgayNghi = soNgayNghi;
        this.soNgayChamCong = soNgayChamCong;
    }



    public void xuat() {
        System.out.println("nhan vien - Mã: " + this.maNV
                + "\t Tên: " + this.hoTen
                + "\t Địa chỉ: " + this.diaChi
                + "\t gioi tinh: " + this.gioiTinh
                + "\t so cmnc " + this.soCMND
                + "\t ma chuc vu: " + this.maChucVu
                + "\t so dt: " + this.soDT);

    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(@NonNull Parcel dest, int flags) {
//        hoTen=in.readString();
//        diaChi=in.readString();
//        gioiTinh=in.readString();
//        soCMND=in.readInt();
//        maNV = in.readString();
//        maKhau = in.readString();
//        maChucVu = in.readString();
//        soDT = in.readString();
//        Luong = in.readString();
//        Avt = in.readString();
//        soNgayNghi = in.readInt();
//        soNgayChamCong = in.readInt();
        dest.writeString(hoTen);
        dest.writeString(diaChi);
        dest.writeString(gioiTinh);
        dest.writeInt(soCMND);
        dest.writeString(maNV);
        dest.writeString(maKhau);
        dest.writeString(maChucVu);
        dest.writeString(soDT);
        dest.writeString(Luong);
        dest.writeString(Avt);
        dest.writeInt(soNgayNghi);
        dest.writeInt(soNgayChamCong);


    }
}
