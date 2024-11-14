
package baitapvenha6;
import java.util.Scanner;
public class daonguocchuoi {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhap chuoi can dao nguoc: ");
        String str = scanner.nextLine();
        String reversedStr = reversedString(str);
        System.out.print("chuoi sau khi dao nguoc: " + reversedStr);
    }
    public static String reversedString(String str){
        StringBuilder reversed = new StringBuilder(str);
        return reversed.reverse().toString();
    }
}
