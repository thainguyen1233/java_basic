package xu_ly_ngoai_le_java;
// trươc tiên khi thư 1 sô cos kiểu int nhưng số 10/0 k chia hết ra được phần nguyên
/*nên ta dùng phép thử try để kiêm tra lỗi của phép toán xong sẽ dùng catch <Exxception ex để bắt lỗi toán học 
 * fianlly sẽ dùng finally để đóng kết nối của phép toán
 */
import java.util.Scanner;

public class test {
    public static void main(String[] args) {
        int a;
        int b;
        int c;
        Scanner sc=new Scanner(System.in);
        System.out.println("nhap vao he so a:");
        a=sc.nextInt();
        System.out.println("nhap vao he so b:");
        b=sc.nextInt();
        try{
            c=a/b;
            System.out.println("ket qua la:"+c);
        // }catch (Exception ex){
        //     System.out.println("loi chia cho 0");
        //     ex.printStackTrace();
        }catch(ArithmeticException ex){
            System.out.println("loi dau vao khong hop le");
            ex.printStackTrace();
           
        }finally{
            System.out.println("ket thuc chuong trinh");
        }
        
        
    }
}
