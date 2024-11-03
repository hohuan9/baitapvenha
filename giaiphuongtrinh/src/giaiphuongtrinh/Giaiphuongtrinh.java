
package giaiphuongtrinh;
import java.util.Scanner;
public class Giaiphuongtrinh {
 
    public static void giaiphuongtrinhbac1(Scanner scanner){
        System.out.println("Giai phuong trinh bac 1(ax+b=0): ");
        System.out.println("Nhap a: ");
        double a = scanner.nextDouble();
        System.out.println("Nhap b: ");
        double b = scanner.nextDouble();
        
        if(a==0){
            if(b==0){
                System.out.println("Phuong trinh co vo so nghiem.");
            }else{
                System.out.println("phuong trinh vo nghiem.");
            }
        }else{
            double x = -b/a;
            System.out.println("Phuong trinh co nghiem la: " + x);
        }
    }
    public static void giaiphuongtrinhbac2(Scanner scanner){
        System.out.println("Giai phuong trinh bac 2(ax^2+bx+c=0): ");
        System.out.println("Nhap a: ");
        double a = scanner.nextDouble();
        System.out.println("Nhap b: ");
        double b = scanner.nextDouble();
        System.out.println("Nhap c: ");
        double c = scanner.nextDouble();
        
        if(a==0){
            System.out.println("Day la phuong trinh bac 1: ");
            giaiphuongtrinhbac1(scanner);
        }else{
            double delta = b*b - 4*a*c;
            
            if (delta > 0) {
                double n1 = (-b + Math.sqrt(delta)) / (2 * a);
                double n2 = (-b - Math.sqrt(delta)) / (2 * a);
                System.out.println("Phuong trinh co 2 nghiem phan biet:");
                System.out.println("n1 = " + n1);
                System.out.println("n2 = " + n2);
            } else if (delta == 0) {
                double x = -b / (2 * a);
                System.out.println("Phuong trinh co nghiem kep x = " + x);
            } else {
                System.out.println("Phuong trinh vo nghiem!");
            }
        }
    }
    public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);
       int choice;

       do{
           System.out.println("Chon phuong trinh can giai:\n1. Giai phuong trinh bac 1\n2. Giai phuong trinh bac 2 ");
           choice = scanner.nextInt();
           
           switch(choice){
               case 1:
                   giaiphuongtrinhbac1(scanner);
                   break;
               case 2:
                   giaiphuongtrinhbac2(scanner);
                   break;
               default:
                   System.out.println("Lựa chọn không hợp lệ. Vui lòng chọn lại.");
           }
           System.out.println(); 
           
       }while(choice != 0);
       
       scanner.close();
    }
    
}
