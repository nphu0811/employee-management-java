package Bai1;
import java.util.Scanner;

public class Demo {
     public static void main(String[] args) {
        byte chon;
        Scanner sc=new Scanner(System.in);
        NVQL nvql = new NVQL();
        NVNC nvnc = new NVNC();
        NVPV nvpv = new NVPV();

        do {
            System.out.println("1: Nhap mot nhan vien quan ly");
            System.out.println("2: Nhap mot nhan vien nghien cuu");
            System.out.println("3: Nhap mot nhan vien phuc vu");
            System.out.println("4: Xuat mot nhan vien quan ly");
            System.out.println("5: Xuat nhan vien nghien cuu");
            System.out.println("6: Xuat mot nhan vien phuc vu");
            System.out.println("7: Xuat luong thang cua tung nhan vien");
            System.out.println("0: Thoat");
            System.out.print("Chon chuc nang: "); 
            chon=sc.nextByte();
            
            switch(chon){
                case 1 -> nvql.nhap();
                case 2 -> nvnc.nhap();
                case 3 -> nvpv.nhap();
                case 4 -> nvql.xuat();
                case 5 -> nvnc.xuat();
                case 6 -> nvpv.xuat();
                case 7 -> {
                    System.out.println("======Bang luong======");
                    System.out.println("Ten nhan vien:" + nvql.getTennv());
                    nvql.TinhLuong();
                    System.out.println("\n=======================");
                    System.out.println("Ten nhan vien:" + nvnc.getTennv());
                    nvnc.TinhLuong();
                    System.out.println("\n=======================");
                    System.out.println("Ten nhan vien:" + nvpv.getTennv());
                    nvpv.TinhLuong();
                    System.out.println("\n=======================");
                }
                default -> chon=0;
            }
        } while (chon!=0);
    }
}
