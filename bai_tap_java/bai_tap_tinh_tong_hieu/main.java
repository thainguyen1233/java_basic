package bai_tap_tinh_tong_hieu;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("moi nhap vao tong 2 so ");
        float tong=sc.nextFloat();
        System.out.println("moi nhap vao hieu 2 so");
        float  hieu=sc.nextFloat();
        //tính toán 
        float so1=(tong+hieu)/2;
        float so2 =tong-so1;
        System.out.println("gia tri cua x can tim la:"+so1);
        System.out.println("giá trị cua y can tim la:"+so2);
    }
    

}
