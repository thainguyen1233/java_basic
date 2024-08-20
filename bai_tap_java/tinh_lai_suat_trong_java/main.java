package tinh_lai_suat_trong_java;

import java.util.Scanner;

//amount = p * (1 + r);
public class main {
    public static void main(String[] args) {
        double p,r,amount;
        Scanner sc=new Scanner(System.in);
        System.out.println("nhap vao so tien p:");
        p=sc.nextDouble();
        System.out.println("nhap vao so lai r:");
        r=sc.nextDouble();
        amount=p*(1+r);
        System.out.println("so tien lai la:"+amount);
    }
    
}
