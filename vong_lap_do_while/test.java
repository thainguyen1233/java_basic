// package vong_lap_do_while;

// import java.util.Scanner;

// /*biểu thức 
//  * cú pháp sử dụng vòng lặp do while
//  * do{
//  * câu
// } lệnh;
//  * }while(điều kiện);
//  *
//  *Kiểm tra ít nhất 1 lần nếu nhập vào 1 < 0 thì chạy còn 1 số mà lớn hơn bằng 0 thì dừng 
//  *
//  *
//  */
// public class test{
//     public static void main(String[] args) {
//         int n=0;
//         do{
//             System.out.println("lan lap thu n ");
            
//         }while(n>0);
//     }
// }
// package vong_lap_do_while;


// public class test {

//     public static void main(String[] args) {
//         int a=1;
//         int tong =0;
//         do {
//             tong+=a;
//             a++;
//         }while (a<=5);
//             System.out.println("tong=" + tong);
        
//     }
// }
package vong_lap_do_while;
public class test {
    public static void main(String[] args) {
        int n=0;
        while (true)
        {
        n++;
     System.out.println("n=" + n);
     if (n==100){
        break;
     }
    }
       
}
}