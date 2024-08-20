package bai_tap_tinh_so_ngay;

import java.util.Scanner;

public class test{
    public static void main(String[] args) {
        int thang,nam;
        Scanner sc=new Scanner(System.in);
        System.out.println("nhap vao thang");
        thang=sc.nextInt();
        System.out.println("nhap vao nam ");
        nam=sc.nextInt();
        switch (thang) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
            System.out.println("thang co 31 ngay" +" "+ thang);
            break;
            case 4:
            case 6:
            case 9:
            case 11:
            System.out.println("thang co 30 ngay"+" " +thang);
            break;
            case 2:
            if (nam%4==0 && nam%100!=0|| nam%400==0) {
                System.out.println("thang co 29 ngay"+ " " +thang);

                
            }else{
                System.out.println("thang co 28 nagy "+ " "+ thang);
            }
            break;
        
            default:
            System.out.println("du lieu vao khong hop le");
                break;
        }

    }
}