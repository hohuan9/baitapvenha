
package baitapvenha6;
import java.util.Scanner;
public class loaibokhoangtrong {
     public static String removeExtraSpaces(String input) {
        // Loai bo khoang trong, tru khoang trong giua 2 tu
        String result = input.trim().replaceAll("\\s+", " ");
        return result;
    }

    public static void main(String[] args) {
        String input = "   Hello    World   ";
        String output = removeExtraSpaces(input);

        System.out.println("Chuoi sau khi loai bo khoang trong: '" + output + "'");
    }
}
