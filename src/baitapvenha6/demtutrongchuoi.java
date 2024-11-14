
package baitapvenha6;
import java.util.Scanner;
public class demtutrongchuoi {
    public static int countWords(String input) {
        // Tach chuoi thanh cac tu dua tren dau cach
        String[] words = input.trim().split("\\s+");
        return words.length;
    }

    public static void main(String[] args) {
        String input = "Java is fun";
        int wordCount = countWords(input);

        // In ket qua
        System.out.println("Chuoi '" + input + "' co"  + wordCount + " tu.");
    }
}
