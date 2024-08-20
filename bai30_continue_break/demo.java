// package bai30_continue_break;
// // tính tổng từ 1 _>5  không tính số 3
// public class demo {

//     public static void main(String[] args) {
//         int tong=0;
//         for (int i=0;i<=5;i++){
//             if (i==3) {
//                 continue;
                
//             }else{
//                 tong+=i;

//             }System.out.println("tong la:"+tong);
//         }
//     }
// }
//viết chương trình nhập vào 1 số nguyên n, in ra kết quả n!
//
// package bai30_continue_break;
// //tính giai thừa bằng vòng lặp while
// import java.util.Scanner;

// public class demo{
//     public static void main(String[] args) {
//         int n=0;
//         int giai_thua=1;
//        Scanner sc=new Scanner(System.in);
//        System.out.println("nhap vao so nguyen n:");
//        n=sc.nextInt();
//        while (n>0) {
//             giai_thua*=n;
            
//             System.out.println("giai thua la:"+giai_thua);

            
//         }
//     }
// }
// package bai30_continue_break;

// import java.util.Scanner;

// public class demo {
//     public static void main(String[] args) {
//         int n;
//        int  giai_thua=1;
//        Scanner sc=new Scanner(System.in);
//        System.out.println("nhap vao so nguyen n :");
//        n=sc.nextInt();
//        while (n>0) {
//         giai_thua*=n;
//         n++;
        
//        }
//        System.out.println("");

//     }
// }

// package bai30_continue_break;

// import java.util.Scanner;

// public class demo {

//     public static void main(String[] args) {
//         /*viết chương trình nhập số a từ bàn phím 
//          * nếu a chẵn thì tính tổng số chẵn từ 0 đến a
//          * nếu a lẻ thì in dòng chữ " tôi 0 tính số lẻ , bye bye" và thoát chương trình 
//          */
//     int a;
//     int tong=0;
//     Scanner sc=new Scanner(System.in);
//     System.out.println("nhap cac so chan tu 0- a:");
//     a=sc.nextInt();
//     if (a %2 !=0) {
//         System.out.println("tôi không tính số lẻ ,bye bye");
//     }else{
//         for(int i=0;i<=a;i+=2){
//             tong+=i;
//             System.out.println("tong la:"+tong);
//         }
//     }       
// }
// }
// package bai30_continue_break;

// import java.util.Scanner;

// public class demo {

//     public static void main(String[] args) {
//         /*viết chương trình tính tổng các số lẻ từ 1 đến n , nhập n từ bàn phím 
//          * 1.nhập n =7, bỏ qua cộng tổng với số 3==> in ra kết quả 
//          * (gợi ý đạp án : 1 +5 + 5 =13)
//          * thử break khi vòng lặp chạy đến giá trị n=3
//          */
//         int n; 
//         int tong=0;
//         Scanner sc=new Scanner(System.in);
//         System.out.println("nhap vao so n:");
//         n=sc.nextInt();
//        if(n%2!=0){
//         for (int i=1;i<n;i+=2){
//             if (i==3) {
//                 continue;
                
//             }else{
//                 tong+=i;
//             }
//         System.out.println("tong la:"+tong);
//         }
//        }
//        System.out.println("tong la:"+tong);
        
//     }
// }
// package bai30_continue_break;
// public class demo {

//     public static void main(String[] args) {
//         /* viết chương trình tìm những số
//          * chia hết cho 3 từ 10 đến 50
//          */
//         for (int i=10;i<=50;i++){
//             if (i %3==0) {
//                 System.out.println("cac so chia het cho 3 la:"+i);
                
//             }
//         }
//     }
// }
// package bai30_continue_break;
// public class demo {
//     public static void main(String[] args) {
//         /*viết chương trình 
//          * tính tổng s=1!+2!+3!+...+10!
//          */
//        int gt=1;
//        int tong=0;
//        for(int i=1; i <=10;i++){
//         gt*=i;
//         System.out.println("giai thua la:"+gt);
//         tong+=gt;
//         System.out.println("tong la:"+tong);
//        }    
//     }
// }
/* bài tập java 
 * số hoàn hảo là số tổng các ước thực của nó bằng chính nó 
 * ví dụ : 6 =1+2+3;
 * tìm tất cả các những số hoàn thiện trong phạm vi từ 1-1000
 */
// package bai30_continue_break;

// import java.util.Scanner;

// public class demo{
//     public static void main(String[] args) {
//         int n=7;
//         int tong =0;
//         for(int i=1;i<n;i++ ){
//             if (n%i==0) {
//                 tong+=i;
              
                
//             }if(tong==n){
//                 System.out.println("so hoan hao la:"+tong);
//             }else{
//                 System.out.println("khong phai so hoan hao");
//             }   
//         }

//     }
// }
/*viết chương trình nhập vào số nguyên a>0 từ bàn phím 
 * cho biết đó có phải là số nguyên tố hay không  
 * số nguyên tố là số > 1 và chia hết cho 1 và chính nó
 * kết thúc chương trình hỏi người dùng bạn có muốn tiếp tục sử dụng phần mềm hay không?
 * nếu chọn không thì thoát chương trình 
 */ 
// package bai30_continue_break;

// import java.util.Scanner;

// public class demo {

//     public static void main(String[] args) {
//         int n;
//         Scanner sc = new Scanner(System.in);
//        while (true) {
//         System.out.println("Nhap vao so nguyen n (n > 0):");
//         n = sc.nextInt();

//         while (n <= 0) {
//             System.out.println("Nhap lai so nguyen n (n > 0):");
//             n = sc.nextInt();
//         }

//         System.out.println("Ban da nhap so nguyen n thanh cong: " + n);
//         int uoc = 0;

//         for (int i = 1; i <= n; i++) {
//             if (n % i == 0) {
//                 uoc++;
//             }
//         }

//         if (uoc == 2) {
//             System.out.println(n + " la so nguyen to.");
//         } else {
//             System.out.println(n + " khong phai so nguyen to.");
            
//         }
//         System.out.println("ban co muon tiep tuc khong (y/n)?");
//         String traLoi=new Scanner(System.in).nextLine();
//         if(traLoi.equals("y")|| traLoi.equals("y")){
//             break;
//         }

        
//        }
//     }
// }
package bai30_continue_break;

import java.util.Scanner;

public class demo{
    public static void main(String[] args) {
        int a;
        Scanner sc=new Scanner(System.in);
      while (true) {
        System.out.println("nhap vao so nguyen to a > 0:");
        a=sc.nextInt();
        while (a<=0){
            System.out.println("nhap lai so nguyen to a>0"+a);
            a=sc.nextInt();
        }
        System.out.println("ban da nhap vao so nguyen n thanh cong:"+a);
        int uoc=0;
        for(int i=1; i<=a ;i++){
            if (a%i==0) {
                uoc++;
            }
        }
        if (uoc==2) {
            System.out.println("so nguyen to la:"+a);
        }else{
            System.out.println("khong phai so nguyen to");
        }
        System.out.println("ban co muon tiep tuc khong(y/n)?");
        String traLoi=new Scanner(System.in).nextLine();
        if (traLoi.equals("n")||traLoi.equals("n")) {
            System.out.println("chuong trinh ket thuc!");
            break;
            
        }
        System.out.println("chuong trinh duoc thuc hien tiep!");
        
      }
    }
}