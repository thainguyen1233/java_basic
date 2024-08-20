package nhan_2_so_trong_java;

import java.util.Scanner;

public class main {
   public static void main(String[] args) {
    int a, b;
    Scanner sc=new Scanner(System.in);
    System.out.println("nhap vao so a:");
    a=sc.nextInt();
    System.out.println("nhap vao sso b:");
    b=sc.nextInt();
    System.out.println("----ket qua cua bai toan--------");
    System.out.println("ket qua cua phep nhan la:" + a*b);
   }   
}
