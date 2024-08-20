//giải phương trình bậc 2 
package giai_phuong_trinh_bac_2;

import java.util.Scanner;

public class demo {
 public static void main(String[] args) {
    double a, b,c,delta,x1,x2;
    Scanner SC=new Scanner(System.in);
    System.out.println("nhap he so cua a:");
    a=SC.nextDouble();
    System.out.println("nhap he so cua b:");
    b=SC.nextDouble();
    System.out.println("nhap he so cua c:");
    c=SC.nextDouble();
    delta=b*b-4*a*c;
    if(delta > 0){
        x1=(-b+Math.sqrt(delta))/(2*a);
        x2=(-b-Math.sqrt(delta))/(2*a);
        System.out.println("phuong trinh da cho co 2 nghiem phan biet:" +x1 + " " +x2);

    }else if(delta == 0){
        x1=(-b+Math.sqrt(delta))/(2*a);
        System.out.println("phuong trinh da cho co nghiem duy nhat:" +x1);
    }else{
        System.out.println("phuong trinh vo nghiem");
    }

    
 }
}