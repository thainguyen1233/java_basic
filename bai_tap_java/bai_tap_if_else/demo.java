package bai_tap_if_else;

import java.util.Scanner;

public class demo {
    public static void main(String[] args) {
        /*bài tập tính chiều cao ,cân nặng, tính BMI và xuất ra thông báo 
         * BMI<15: Thân hình quá gày;
         * BMI>=15 and BIM<18.5: Thân hình Hơi gày;
         * BMI>=18.5 and BMI<25: Thân hình Bình thường;
         * BMI>=25 and BMI<30: Thân hình Hơi béo;
         * BMI>=30: Thân hình Béo phì;
         * gợi ý cách tính BMI: BMI =cân nặng/(chiều cao*2)
         * 
         */
        Scanner sc=new Scanner(System.in);
        System.out.println("moi nhap Vao chieu cao :");
        double chieuCao=sc.nextDouble();
        System.out.println("moi nhap vao can  nang:");
        double canNang=sc.nextDouble();
        double BMI=canNang/(chieuCao*2);
        if(BMI<15){
            System.out.println("than hinh qua gay");
        }else if (BMI >=15 && BMI <18.5) {
            System.out.println("than hinh hoi gay");
            
        }else if (BMI >=18.5 && BMI <25) {
            System.out.println("than hinh binh thuong");
            
        }else if (BMI >=25 && BMI <30) {
            System.out.println("than hinh hoi beo");

        }else{
            System.out.println("than hinh beo phi");
        }


        
    }
    
    
}
