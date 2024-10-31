
package baitapingiatri;

import java.util.Scanner;

public class BaiTapInGiaTri {

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap ten: ");
        String ten = scanner.nextLine();
       
        
        System.out.print("Nhap tuoi: ");
        int tuoi = scanner.nextInt();
        
        
        System.out.print("Nhap gioi tinh: ");
        String gioiTinh = scanner.next();
        
        
        System.out.print("Nhap chuyen nganh: ");
        String chuyenNganh = scanner.next();
        
        
        System.out.print("Nhap GPA: ");
        float GPA = scanner.nextFloat();
       
        
        System.out.print("Nhap que quan: ");
        String queQuan = scanner.next();
        
        
        System.out.println("\nTen: " + ten);
        System.out.println("Tuoi: " + tuoi);
        System.out.println("gioi tinh: " + gioiTinh);
        System.out.println("chuyen nganh: " + chuyenNganh); 
        System.out.println("GPA: " + GPA);
        System.out.println("que quan: " + queQuan);
    }
    
}
