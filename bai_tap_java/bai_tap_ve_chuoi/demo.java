// // package bai_tap_ve_chuoi;

// // import java.util.Scanner;

// // public class demo {

// //     public static void main(String[] args) {
// //         Scanner sc = new Scanner(System.in);
// //         System.out.println("moi ban nhap vao chuoi:");
// //         String s = sc.nextLine();
// //         demkytu(s);
// //     }

// //     public static void demkytu(String s) {
// //         int demchuthuong = 0;
// //         int demchuhoa = 0;
// //         int demchuso = 0;
// //         int demkhoangtrang = 0;

// //         for (int i = 0; i < s.length(); i++) {
// //             char c = s.charAt(i); // Lấy ký tự tại vị trí i
// //             if (Character.isUpperCase(c)) { // Kiểm tra ký tự c
// //                 demchuhoa++;
// //             } else if (Character.isLowerCase(c)) { // Kiểm tra ký tự c
// //                 demchuthuong++; 
// //             } else if (Character.isDigit(c)) { // Kiểm tra ký tự c
// //                 demchuso++;
// //             } else if (Character.isWhitespace(c)) { // Kiểm tra ký tự c
// //                 demkhoangtrang++;
// //             }
// //         }

// //         System.out.println("so chu hoa la:" + demchuhoa);
// //         System.out.println("so chu thuong la:" + demchuthuong);
// //         System.out.println("so chu so laL" + demchuso);
// //         System.out.println("so khoang trang la:" + demkhoangtrang);
// //     }
// // }
// // bài tập java 19 bài tập về chuỗi 
// package bai_tap_ve_chuoi;

// public class demo {
//     public static void main(String[] args) {
//         tinhtong("English=78Sicience=83Math=History=65"); 
//     }

//     public static void tinhtong(String str1) {
//         int sum = 0;
//         int dem = 0;

//         String[] mang = str1.split("="); // Tách chuỗi theo dấu "="

//         for (String pt : mang) {
//             // Tách phần số từ chuỗi
//             String[] number = pt.split("[a-zA-Z]");
//             if (number.length > 0) { // Kiểm tra xem có phần số hay không
//                 try {
//                     int so = Integer.parseInt(number[0]); // Chuyển đổi phần số thành số nguyên
//                     sum += so;
//                     dem++;
//                 } catch (NumberFormatException e) {
//                     System.out.println("Lỗi nhập vào số: " + e.getMessage());
//                 }
//             }
//         }

//         // Tính trung bình cộng 
//         double trungbinhcong = (double) sum / dem; // Ép kiểu sum sang double để tránh kết quả bị làm tròn

//         System.out.println("Tổng các số là:" + sum);
//         System.out.println("Trung bình cộng là:" + trungbinhcong);
//     }
// }
package bai_tap_ve_chuoi;

import java.util.Scanner;

public class demo {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int soLanNhapSai = 0;
        final int MAX_SO_LAN_NHAP_SAI = 5; 

        while (soLanNhapSai < MAX_SO_LAN_NHAP_SAI) {
            System.out.println("moi ban nhap vao mat khau ");
            String matKhau = sc.nextLine();

            if (kiemTraMatKhau(matKhau)) {
                System.out.println("mat khau khong hop le");
                break; 
            } else {
                soLanNhapSai++;
                System.out.println("mat khau cua ban nhap sai " + soLanNhapSai + " lan.");
                if (soLanNhapSai == MAX_SO_LAN_NHAP_SAI) {
                    System.out.println("tai khoan cua ban da bi khoa");
                }
            }
        }
    }

    public static boolean kiemTraMatKhau(String matKhau) {
        boolean coChuSo = false;
        boolean coChuCai = false;

        if (matKhau.length() < 6) {
            System.out.println("mat khau phai co it nhat 6 ky tu");
            return false;
        }

        for (int i = 0; i < matKhau.length(); i++) {
            char c = matKhau.charAt(i);
            if (Character.isDigit(c)) {
                coChuSo = true;
            } else if (Character.isLetter(c)) {
                coChuCai = true;
            }
        }

        if (!coChuSo) {
            System.out.println("mat khau phai co it nhat 1 chu so");
            return false;
        }

        if (!coChuCai) {
            System.out.println("mat khau phai co it nhat 1 chu cai");
            return false;
        }

        return true; // Mật khẩu hợp lệ
    }
}