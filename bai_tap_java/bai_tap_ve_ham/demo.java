package bai_tap_ve_ham;

import java.util.Scanner;

public class demo {
    /*viet chương trinh nhap vao tu ban phim 2 so a, b
     * nhap 1 ky tu +,-,*,/
     * 1. nếu nhập + thì : tính a+b và in ra kết quả
     * 2. nếu nhập - thì : tính a-b và in ra kết quả
     * 3. nếu nhập * thì : tính a*b và in ra kết quả
     * 4. nếu nhập / thì : tính a/b và in ra kết quả
     */
    public static void main(String[] args) {
        
        System.out.println("chuong trinh tinh toan");
        Scanner sc=new Scanner(System.in);
        System.out.println("nhap vao he so a:");
        double a=sc.nextDouble();
        System.out.println("nhap vao he so b:");
        double b=sc.nextDouble();
        System.out.println("nhap vao ky tu c:");
        char c=sc.next().charAt(0);
        tinhtoan(a, b, c);
    }
    public static void tinhtoan(double a, double b,char c){
        if (c=='+') {
            System.out.println("a+b="+(a+b));
            
        }else if (c=='-') {
            System.out.println("a-b="+(a-b));
            
        }else if(c=='*'){
            System.out.println("a*b="+(a*b));
        }else if(c=='/'&& b!=0){
            System.out.println("a/b="+(a/b));
        }else{
            System.out.println("khong co du lieu nao dung");
        }
     }
}
