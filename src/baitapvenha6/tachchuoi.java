
package baitapvenha6;
import java.util.Scanner;
import java.util.*;
public class tachchuoi {
     public static String[] splitWords(String input) {

        String[] words = input.split(" ");
        return words;
    }

    public static void main(String[] args) {
        String input = "Java is fun";
        String[] result = splitWords(input);

        System.out.println(Arrays.toString(result));
    }
}
