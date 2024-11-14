
package baitapvenha6;
import java.util.Scanner;
public class tudainhatchuoi {
    public static String findLongestWord(String input) {
        // tach chuoi thanh cac tu dua tren khoang trang
        String[] words = input.split("\\s+");
        String longestWord = "";

        // Duyet qua tung tu va tim tu dai nhat
        for (String word : words) {
            if (word.length() > longestWord.length()) {
                longestWord = word;
            }
        }

        return longestWord;
    }

    public static void main(String[] args) {
        String input = "I love Programming";
        String longestWord = findLongestWord(input);

        System.out.println("Tu dai nhat trong chuoi '" + input + "' la: '" + longestWord + "'");
    }
}
