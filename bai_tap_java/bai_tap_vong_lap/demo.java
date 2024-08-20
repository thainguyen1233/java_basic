package bai_tap_vong_lap;

import java.util.Scanner;

/*viết chương trình nhập vào các số nguyên và tính tỏng  các số đó, nếu tổng 
 * lớn hơn > 100 thì kết thúc vòng lặp và hiển thị thông báo của các số đã nhập 
 * 
 */
public class demo {
     public static void main(String[] args) {
       int number;
       int tong=0;
       Scanner sc=new Scanner(System.in);
       do{
        System.out.println("nhap vao mot so nguyen:");
        number=sc.nextInt();
        tong +=number;//tong=tong +number

       }while( tong<100) ;
        System.out.println("tong la:"+tong);
       
    }    
}    

