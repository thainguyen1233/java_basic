package kiem_nam_nhuan;

import java.util.Scanner;

public class demo {
    public static void main(String[] args) {
        int year;
        Scanner sc=new Scanner(System.in);
        System.out.println("nhap nam:");
        year=sc.nextInt();
        if(year%4==0 && year %100 !=0 || year %400==0){
            System.out.println(year + ": la nam nhuan");

        }else{
            System.out.println(year + ": khong phai la nam nhuan");
        }
    }   
}
