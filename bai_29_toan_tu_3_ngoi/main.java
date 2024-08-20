package bai_29_toan_tu_3_ngoi;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        //kiểm tra số chẵn lẻ 
        Scanner sc=new Scanner(System.in);
        System.out.println("nhập vào số cần kiểm tra :");
        int n=sc.nextInt();
        String ketQua=n%2==0? " la số chẵn":" la số lẻ";
        System.out.println(n+ketQua);
    }
}
