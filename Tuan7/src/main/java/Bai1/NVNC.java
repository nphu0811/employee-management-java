package Bai1;

import java.util.Scanner;

class NVNC extends NhanVien{
    private String chuyenmon;
    private float phucapdh;

    public String getChuyenmon() {
        return chuyenmon;
    }

    public void setChuyenmon(String chuyenmon) {
        this.chuyenmon = chuyenmon;
    }

    public float getPhucapdh() {
        return phucapdh;
    }

    public void setPhucapcv(float phucapdh) {
        this.phucapdh = phucapdh;
    }

    public NVNC() {
        super();
    }
    @Override
    public void nhap(){
        Scanner sc=new Scanner(System.in);
        super.nhap();
        System.out.print("Nhap chuyen mon : ");
        chuyenmon = sc.nextLine();
        System.out.print("Nhap phu cap : " );
        phucapdh = sc.nextFloat();
    }
    @Override
    public void xuat(){
        super.xuat();
        System.out.println("Chuyen mon : " + chuyenmon);
        System.out.println("Phu cap : " + phucapdh);
    }
    public float TinhLuong(){
        float tong = this.getLuongcb()+ this.getPhucapdh();
        System.out.println("Luong Thang : " + tong);
        return tong;
    }
}
