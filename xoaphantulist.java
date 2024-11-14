
package baitapvenha2;
import java.util.*;
public class xoaphantulist {
    public static void main(String[] args){
        ArrayList<Integer> number = new ArrayList<>();
        for (int i=1; i<=10; i++){
            number.add(i);
        }
        System.out.println(number.remove(4));
        System.out.println(number);
    }
}
