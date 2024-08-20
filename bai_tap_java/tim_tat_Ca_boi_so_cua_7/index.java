package tim_tat_Ca_boi_so_cua_7;
/*Tìm tất cả các số chia hết cho 7 nhưng không phải bội số của 5
Đề bài: 
Viết chương trình tìm tất cả các số chia hết cho 7 nhưng không phải bội số của 5,
 nằm trong đoạn 10 và 200 (tính cả 10 và 200).
 Các số thu được sẽ được in thành chuỗi trên một dòng, cách nhau bằng dấu phẩy. */
public class index {
   public static void main(String[] args) {
    StringBuilder result=new StringBuilder();
    for(int i=10 ; i <200;i++){
        if (i%7==0 && i%5!=0) {
            if (result.length()==0) {
                result.append(i);
            }else{
                result.append(",").append(i);
                
            }
            
        }
    }
    System.out.println(result);
   }  
}
