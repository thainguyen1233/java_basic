package bai38_tim_hieu_chuoi_trong_java;
/*khái niệm :
 * trong java String là một lớp quản lý dữ liệu văn bản 
 * chuỗi là tập hợp các ký tự "abc "
 * append(string) thêm string vào cuối chuỗi gốc
 * insert(index,string) chèn string vào vị trí index
 * delete(index,count) xóa tất cả ký tự từ vị trí start đến vị trị end -1
 * string,leght() trả về độ dài của chuỗi tính cả space
 */

public class demo {
    public static void main(String[] args) {
        String s="hello tôi chỉ có 50k"+
       "\n bạn có muốn mua không";
       System.out.println(s);
       StringBuilder sb=new StringBuilder("hello tôi chỉ có 50k");
       sb.append("\n bạn có muốn mua không");
       sb.append("\n rât vui  được làm quen");
       System.out.println(sb);
       sb.insert(2, "obama");
       System.out.println(sb);
       sb.delete(0, 6);
       System.out.println(sb);
       System.out.println(sb.length());

    }
}
