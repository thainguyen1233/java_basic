package bai_Tap_ve_while_java;

import java.util.Scanner;

public class demo {
    /*đè nhập vào vòng lặp while mật khẩu nếu nhấp đúng thì nhấn enter để kết thúc 
     * mật khẩu là: 123456
     * 
     *nhập sai thì nhập lại 

     */
    public static void main(String[] args) {
      Scanner sc=new Scanner(System.in);
      System.out.println("moi ban nhap so:");
      int n=sc.nextInt();
      while (n!=123456) {
        System.out.println("moi ban nhap lai:");
        n=sc.nextInt();
        
      }
      System.out.println("ban da nhap mat khau dung!");

    }
}
