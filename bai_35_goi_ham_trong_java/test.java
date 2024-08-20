// //giai phuong trinh bac 2
package bai_35_goi_ham_trong_java;

import java.util.Scanner;

public class test {

    public static void main(String[] args) {
        giaiphuongtrinhbac2(0, 0, 0, 0, 0, 0, 0);
        
    }
    public static void giaiphuongtrinhbac2(double a,double b,double c,double delta,double x1,double x2,double x){
        System.out.println("giai phuong trinh bac 2 bang cach goi ham ");
        Scanner sc=new Scanner(System.in);
        System.out.println("nhap he so cua a:");
        a=sc.nextDouble();
        System.out.println("nhap he so cua b:");
        b=sc.nextDouble();
        System.out.println("nhap he so cua c:");
        c=sc.nextDouble();
        delta=b*b-4*a*c;
        if (delta <0 ) {
            System.out.println("phuong trinh da cho vo nghiem!");
            
        }else if (delta==0) {
            x=-b/(2*a);
            System.out.println("phuong trinh da cho co nghiem kep la:"+x);
            
        }else{
            x1=(-b+Math.sqrt(delta))/2*a;
            x2=(-b-Math.sqrt(delta))/2*a;
            System.out.println("phuong trinh da cho co 2 nghiem phan biet:"+x1 + x2);
        }

    }
}