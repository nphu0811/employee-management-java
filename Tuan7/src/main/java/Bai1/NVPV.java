package Bai1;

import java.util.Scanner;

class NVPV extends NhanVien{
    public NVPV() {
        super();
    }
    @Override
    public void nhap(){
        Scanner sc=new Scanner(System.in);
        super.nhap();
    }
    @Override
    public void xuat(){
        super.xuat();
    }
     public float TinhLuong(){
        float tong = this.getLuongcb();
        System.out.println("Luong Thang : " + tong);
        return tong;
    }
}
