package Bai1;

import java.util.Scanner;

class NVQL extends NhanVien{
    private String chuyenmon;
    private float phucapcv;

    public String getChuyenmon() {
        return chuyenmon;
    }

    public void setChuyenmon(String chuyenmon) {
        this.chuyenmon = chuyenmon;
    }

    public float getPhucapcv() {
        return phucapcv;
    }

    public void setPhucapcv(float phucapcv) {
        this.phucapcv = phucapcv;
    }

    public NVQL() {
        super();
    }
    @Override
    public void nhap(){
        Scanner sc=new Scanner(System.in);
        super.nhap();
        System.out.print("Nhap chuyen mon : ");
        chuyenmon = sc.nextLine();
        System.out.print("Nhap phu cap : " );
        phucapcv = sc.nextFloat();
    }
    @Override
    public void xuat(){
        super.xuat();
        System.out.println("Chuyen mon : " + chuyenmon);
        System.out.println("Phu cap : " + phucapcv);
    }
    public float TinhLuong(){
        float tong = this.getLuongcb()+ this.getPhucapcv();
        System.out.println("Luong Thang : " + tong);
        return tong;
    }
}
