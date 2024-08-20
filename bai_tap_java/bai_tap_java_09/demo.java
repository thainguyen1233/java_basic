package bai_tap_java_09;

import java.util.Scanner;

public class demo {

    public static void main(String[] args) {
    /*bài tập java 09 : viết chương trình nhập vào ngày thasg trong năm 
    cho biết đó  thuộc quý mấy
    gợi ý:
    1 năm có 4 quý:
    quý 1: tháng 1, 2,3
    quý 2: tháng 4,5,6
    quý 3: tháng 7, 8,9
    quý 4: tháng 10,11,12 */
    Scanner sc = new Scanner(System.in);
    System.out.println("moi nhap vao thang trong nam  :");
    int thang= sc.nextInt();
    System.out.println("moi ban nhap vao nam :");
    int nam=sc.nextInt();
    if (thang==1 || thang==2  || thang ==3) {
        System.out.println("thang"+thang +"nam"+nam+"thuoc quy 1");
    
        
    }else if (thang==4 || thang==5 || thang==6) {
        System.out.println("thang"+thang +"nam"+nam+"thuoc quy 2");

    }else if (thang==7 || thang==8 || thang==9) {
        System.out.println("thang"+thang +"nam"+nam+"thuoc quy 3");

    }else if (thang==10 || thang==11 || thang==12) {
        System.out.println("thang"+thang +"nam"+nam+"thuoc quy 4");
        
    }
        
    }
        
    }
