
package baitapvenha6;
import java.util.Scanner;
public class laplaichuoi {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("nhap chuoi can ktra: ");
        String str = scanner.nextLine();
        System.out.println("nhap ky tu can ktra: ");
        char tu = scanner.next().charAt(0);
        int dem=0;
        for (int i=0; i < str.length(); i++){
            if (str.charAt(i) == tu){
                dem++;
            }
        }
        System.out.println("so lan xuat hien cua " + tu + " trong chuoi la: " + dem);
    }
    
}
