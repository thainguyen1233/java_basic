package tinh_lai_suat_kep;

import java.util.Scanner;

// đề bài tính lãi xuất kép trong java
//amount = p * (1 + r1) * (1 + r2);
public class demo {
    public static void main(String[] args) {
        double p,r1,r2,amount;
        Scanner sc=new Scanner(System.in);
        System.out.println("nhap vao so tien p:");
        p=sc.nextDouble();
        System.out.println("nhap vao so lai r1:");
        r1=sc.nextDouble();
        System.out.println("nhap vao so lai r2:");
        r2=sc.nextDouble();
        amount=p*(1+r1)*(1+r2);
        System.out.println("so tien lai kep la:"+amount);
        
    }
    
}
