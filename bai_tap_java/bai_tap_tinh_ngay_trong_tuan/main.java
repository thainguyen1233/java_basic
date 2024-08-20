package bai_tap_tinh_ngay_trong_tuan;

import java.util.Scanner;

public class main {
   public static void main(String[] args) {
    int n;
    Scanner sc=new Scanner(System.in);
    System.out.println("nhập n :");
    n=sc.nextInt();
    switch (n) {
        case 2:
        System.out.println("thứ hai");
            
            break;
        case 3:
        System.out.println("thứ ba");
        break;
        case 4:
        System.out.println("thứ tư");
        break;
        case 5:
        System.out.println("thứ năm");
        break;
        case 6:
        System.out.println("thứ sáu");
        break;
        case 7:
        System.out.println("thứ bảy");
        break;
        case 8:
        System.out.println("chủ nhật");

    
        default:
        System.out.println("không có ngày trong tuần");
            break;
    }
   } 
    
}
