package bai_28_cau_lenh_final_try;

import java.util.Scanner;

public class main {
/*câu lệnh try 
 * cú pháp
 * try{
 * statement
 * }catch(Exception e){
 * statement
 * }finally{
 * statement
 * }
 * try block: Code trong khối này cố gắng đọc dữ liệu từ file "input.txt".
catch (FileNotFoundException e): Nếu file không được tìm thấy, ngoại lệ FileNotFoundException sẽ được bắt và thông báo lỗi được in ra.
finally block: Dòng thông báo "Hoàn thành đọc file." sẽ luôn được in ra, dù có ngoại lệ hay không.
Lợi ích của try:
Xử lý lỗi an toàn: Ngăn chương trình bị dừng đột ngột do ngoại lệ.
Kiểm soát luồng chương trình: Cho phép bạn xử lý lỗi và tiếp tục thực thi code một cách có kiểm soát.
Giải phóng tài nguyên: finally block đảm bảo các tài nguyên được giải phóng dù có ngoại lệ hay không.
Lưu ý:
Bạn có thể sử dụng nhiều khối catch để xử lý các loại ngoại lệ khác nhau.
Nếu không có khối catch nào phù hợp với ngoại lệ được ném ra, chương trình sẽ bị dừng đột ngột.
Luôn sử dụng finally block để giải phóng tài nguyên.
finally dù có bị lỗi hay không bị lỗi vẫn được thi 
*/
    public static void main(String[] args) {
    //   int n;
    //   Scanner sc=new Scanner(System.in);
    //   System.out.println("nhập giá trị cần nhập là:");
    //   n=sc.nextInt();
    //   System.out.println("kết quả là :"+n);
      
    //   System.out.println("kết thúc chương trình ");
    // }
    int n;
    Scanner sc=new Scanner(System.in);
    try{
    System.out.println("nhập giá trị cần nhập là:");
     n=sc.nextInt();
     System.out.println("kết quả là :"+n);

    }catch(Exception e){
        System.out.println("dữ liệu không đúng ");

    
    }finally{
        System.out.println("kết thc chương trình ");
    }
}
}