import java.util.Scanner;
public class test {
    public static void main(String[] args) {
        double a, b, x;
        System.out.println("giai phuong trinh bac nhat");
        Scanner sc=new Scanner(System.in);
        System.out.println("nhap a");
        a=sc.nextDouble();
        System.out.println("nhap b");
        b=sc.nextDouble();
        if (a==0) {
            if (b==0) {
                System.out.println("phuong trinh da cho co vo so nghiem");
                
            }else{
                System.out.println("phuong trinh vo nghiem");
            }
            
        }else{
            x=(-b)/a;
            System.out.println("nghiệm của x là:" + x);
        }

        
    }
}