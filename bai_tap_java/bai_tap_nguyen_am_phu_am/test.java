package bai_tap_nguyen_am_phu_am;

import java.util.Scanner;

public class test {
   public static void main(String[] args) {
    char c=' ';
    Scanner sc=new Scanner(System.in);
    System.out.println("nhap vao ky tu:");
    c=sc.next().charAt(0);
    if (c=='a'|| c=='e'|| c=='i'|| c=='o'|| c=='u') {
        System.out.println(c+": "+"la nguyen am ");
        
    }else{
        System.out.println(c+" :" +"la phu am ");
    }

   } 
}
