// package thu_vien_date_time;

// import java.sql.Date;
// import java.text.SimpleDateFormat;
// import java.time.Year;
// import java.time.ZoneId;
// import java.util.Calendar;

// public class time {
//   public static void main(String[] args) {
// //     Calendar cal=Calendar.getInstance();
// //     System.out.println("thời gian hiện tại là :"+cal);
// //     int nam=cal.get(Calendar.YEAR);
// //     int thang=cal.get(Calendar.MONTH);
// //     int ngay=cal.get(Calendar.DAY_OF_MONTH);
// //     int gio=cal.get(Calendar.HOUR_OF_DAY);
// //     int phut=cal.get(Calendar.MINUTE);
// //     int giay=cal.get(Calendar.SECOND);
// //     System.out.println("thời gian hiện tại là :"+nam+"/"+thang +1 +"/"+ngay+"/"+gio+"/"+phut+"/"+giay);

// //   } 
// //set ngay thang nam theo y myon  
// // Calendar cal=Calendar.getInstance();
// // cal.set(Calendar.YEAR, 2024);
// // cal.set(Calendar.MONTH, 11);
// // cal.set(Calendar.DAY_OF_MONTH, 25);
// // int nam=cal.get(Calendar.YEAR);
// // int thang=cal.get(Calendar.MONTH);
// // int ngay=cal.get(Calendar.DAY_OF_MONTH);
// // System.out.println(nam+"/"+thang+"/"+ngay);
// // Calendar ca=Calendar.getInstance();
// // ca.set(Calendar.YEAR,2004);
// // ca.set(Calendar.MONTH, 2  );
// // ca.set(Calendar.DAY_OF_MONTH, 02);
// // int nam_Sinh=ca.get(Calendar.YEAR);
// // int thang_Sinh=ca.get(Calendar.MONTH);
// // int ngay_Sinh=ca.get(Calendar.DAY_OF_MONTH);
// // System.out.println("ngay sinh cua toi la:"+ngay_Sinh+"/"+(thang_Sinh-1)+"/"+nam_Sinh);

// // 
// // Calendar cal = Calendar.getInstance();
// // SimpleDateFormat dinhdang = new SimpleDateFormat("dd/MM/yyyy hh:mm:ss a");
// // Date d = cal.getTime();
// // String s = dinhdang.format(d);
// // System.out.println("f " + s); // In ra chuỗi thời gian
// //   }
//set ngay thang theo mong muốn 
// package thu_vien_date_time;

// import java.text.SimpleDateFormat;
// import java.util.Calendar;

// public class time{
//   public static void main(String[] args) {
//     Calendar cal=Calendar.getInstance();
//     SimpleDateFormat dinhdang =new SimpleDateFormat("dd/MM/yyyy hh:mm:ss a");
//     String s=dinhdang.format(cal.getTime());
//     System.out.println("thoi GIAN HIEN TAI LA:"+s);
//   }
// }
package thu_vien_date_time;

import java.time.Year;
import java.util.Calendar;
import java.util.Scanner;

public class time {

  public static void main(String[] args) {
    int nam, thang, ngay, tuoi;
    Scanner sc = new Scanner(System.in);
    System.out.println("moi ban nhap vao ngay cua ban");
    ngay = sc.nextInt();
    System.out.println("moi ban nhap vao thang cua ban");
    thang = sc.nextInt();
    System.out.println("moi ban nhap vao nam cua ban");
    nam = sc.nextInt();

    // Khoi tao Calendar voi ngay thang nam sinh
    Calendar cal = Calendar.getInstance();
    cal.set(Calendar.YEAR, nam); // Set nam
    cal.set(Calendar.MONTH, thang - 1); // Set thang (thang bat dau tu 0)
    cal.set(Calendar.DAY_OF_MONTH, ngay); // Set ngay

    int nam_Sinh = cal.get(Calendar.YEAR);
    int thang_Sinh = cal.get(Calendar.MONTH) + 1; // them 1 de hien thi thang tu 1
    int ngay_Sinh = cal.get(Calendar.DAY_OF_MONTH);
    System.out.println("ngay thang nam sinh: " + ngay_Sinh + "/" + thang_Sinh + "/" + nam_Sinh);

    // Lay thoi gian hien tai
    Calendar now = Calendar.getInstance();
    int nam_hientai = now.get(Calendar.YEAR);
    tuoi = nam_hientai - nam_Sinh;
    System.out.println("tuoi cua ban la: " + tuoi);
  }
}