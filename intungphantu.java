
package baitapvenha2;
import java.util.*;
public class intungphantu {
    public static void main(String[] args) {

        ArrayList<Integer> numbers = new ArrayList<>(Arrays.asList(10, 20, 30, 40, 50));
        
        Integer[] array = numbers.toArray(new Integer[0]);
        System.out.println("Cac phan tu cua mang:");
        for (int num : array) {
            System.out.println(num);
        }
    }  
}
