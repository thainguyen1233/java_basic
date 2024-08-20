package bai_tap_chuyen_doi_thap_phan;

import java.util.Scanner;

public class demo {
    public static void main(String[] args) {
        int n;
        Scanner sc=new Scanner(System.in);
        System.out.println("nhap so nguyen duong n");
        n=sc.nextInt();
        String nhiphan="";
        while (n>0) {

            nhiphan=n%2+nhiphan;
            n=n/2;
        }
        System.out.println("ket qua "+nhiphan);
    }
}
