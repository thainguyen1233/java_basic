 package bai_23_vong_lap_while;

// import java.util.Scanner;


// /*vòng lặp while 
//  * while(điều kiện){
//  * câu lệnh;
//  * }
//  *
//  *for với while khác nhau vòng for dùng cho mảng a đến b có điểm dừng
//  -while không biết điểm dừng
//  */
// //in da 500 từ nguyen van thai
// public class demo{
//     public static void main(String[] args) {
//         int n=1;
//         Scanner sc=new Scanner(System.in);
      
      
//      while (n!=0) {
//        System.out.println("nhap lai so");
//       n=sc.nextInt();
//      }
//     }public class Main
//     {
//         public static void main(String[] args) {
//             int n=1;
//             while(true){
//                System.out.printf(n+".");
//                n++;
//                if (n==100){
//                    System.out.printf("kết quả ra 100" );
//                  break;  
//                } 
//         }
//         }
//     }
// }
//nhập điểm hơp hợp lệ từ 0 đến 10
// package bai_23_vong_lap_while;

// import java.util.Scanner;

// public class demo{
//     public static void main(String[] args) {
//         int n;
//         while (true) {
//             Scanner diem=new Scanner(System.in);
//             System.out.println("nhap diem:");
//             n=diem.nextInt();
//             if(n >=0 && n<=10){
//                 System.out.println("bạn da nhap diem hop le!");
//                 break;

//             }
//             System.out.println("diem phai tu 0  den 10");
            
            
//         }
//     }
// 
// viết chương trình hiển thị các số chia hết cho 5 trong phạm vi từ 0 đến 20
// package bai_23_vong_lap_while;

// import java.util.Scanner;

// public class demo {

//      public static void main(String[] args) {
//         int n;
//         while (true){
//             Scanner sc=new Scanner(System.in);
//             System.out.println("nhap so trong pham vi tu 0 den 20:");
//             n=sc.nextInt();
//             if (n%5==0) {
//                 System.out.println("so chia het cho 5 la:"+n);
//                 break;
                
//             }
//         }
     

//      }
// }
// package bai_23_vong_lap_while;

// import java.util.Scanner;

// public class demo {

//     public static void main(String[] args) {
       

//         System.out.println("nhap so nguye trong khoang 0 den 20:");
//         for(int i=0 ; i<=20;i++){
//             if (i %5!=0) {
//                 continue;
                
//             }
//             System.out.println("so chia het cho 5 la:"+i);
//         }
       
//     }
// }
// import java.util.Scanner;

//  public class demo {

//       public static void main(String[] args) {
//          int n;
//          while (true){
//              Scanner sc=new Scanner(System.in);
//              System.out.println("nhap so trong pham vi tu 0 den 20:");
//              n=sc.nextInt();
//              if (n%5==0) {
//                  System.out.println("so chia het cho 5 la:"+n);
//                  break;
                
//              }
//          }
//         }
//     }