package tinh_phan_nguyen;

import java.util.Scanner;

public class man {
///Đề bài: Viết chương trình Java để tìm phần nguyên và phần dư khi chia hai số.
    public static void main(String[] args) {
        int a,b,chiaNguyen,chiaDu;
        Scanner sc=new Scanner(System.in);
        System.out.println("nhap vao so a:");
        a=sc.nextInt();
        System.out.println("nhap vao so b:");
        b=sc.nextInt();
        chiaNguyen=a/b;
        chiaDu=a%b;
        System.out.println( chiaNguyen + ":"+ "so nguyen cua:" +"a" +"/" + "b");
        System.out.println("chia du la:"+chiaDu);

    }
}
