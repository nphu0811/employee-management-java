

package Bai1;

import java.util.Scanner;

class NhanVien {
    private String manv;
    private String tennv;
    private String trinhdo;
    private float luongcb;

    public String getManv() {
        return manv;
    }

    public void setManv(String manv) {
        this.manv = manv;
    }

    public String getTennv() {
        return tennv;
    }

    public void setTennv(String tennv) {
        this.tennv = tennv;
    }

    public String getTrinhdo() {
        return trinhdo;
    }

    public void setTrinhdo(String trinhdo) {
        this.trinhdo = trinhdo;
    }

    public float getLuongcb() {
        return luongcb;
    }

    public void setLuongcb(float luongcb) {
        this.luongcb = luongcb;
    }
    public void nhap(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap ma nv : ");
        manv = sc.nextLine();
        System.out.print("Nhap ten nv : ");
        tennv = sc.nextLine();
        System.out.print("Nhap trinh do : ");
        trinhdo = sc.nextLine();
        System.out.print("Nhap luong co ban : ");
        luongcb = sc.nextFloat();
    }
    public void xuat(){
        System.out.println("Ma nv : " + manv);
        System.out.println("ten nv : " + tennv);
        System.out.println("trinh do : " + trinhdo);
        System.out.println("luong co ban : " + luongcb);
    }
}
