package bai_tap_kiem_tra_so_chan_le;

import java.util.Scanner;

//Đề bài: Viết chương trình Java để kiểm tra một số nhập vào là số chẵn hay số lẻ.
public class main {
        public static void main(String[] args) {
            int n;
            Scanner sc=new Scanner(System.in);
            System.out.println("nhap so n:");
            n=sc.nextInt();
            if (n%2==0) {
                System.out.println( n +" :" +"day la so chan!" );
                
            }else{
                System.out.println(n+":" +  "day la so le!");
            }
        }    
}
