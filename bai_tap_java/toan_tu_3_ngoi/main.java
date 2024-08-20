package toan_tu_3_ngoi;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
    /*viết chương tình tính điểm trung bình 
     * và xếp loại của học sinh theo tiêu chuẩn sau 
     * giỏi: điểm trung bình >=8.5
     * khá: điểm trung bình >=7.0
     * trung bình: điểm trung bình >=5.0
     * yếu: điểm trung bình >=3.5
     */
    Scanner sc=new Scanner(System.in);
    System.out.println("nhap diem toan  :");
    double toan=sc.nextDouble();
    System.out.println("nhap  diem ly:");
    double ly=sc.nextDouble();
    System.out.println("nhap diem hoa:");
    double hoa=sc.nextDouble();
    double diemTrungBinh=(toan+ly+hoa)/3;
    System.out.println("diem trung binh la :"+diemTrungBinh);   
    String ketqua=diemTrungBinh>=8.5? "xep loai gioi":diemTrungBinh>=7.0?"xep loai kha":diemTrungBinh>=5.0?"xep loai trung binh":diemTrungBinh>=3.5?"xep loai yeu":"xep loai kem";
   System.out.println(ketqua);
    
}
}