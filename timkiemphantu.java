
package baitapvenha2;
import java.util.*;
public class timkiemphantu {
    public static void main(String[] args){
        ArrayList<String> names = new ArrayList<>();
        names.add("java");
        names.add("python");
        names.add("c++");
        names.add("javasc");
        if (names.contains("Python")) {
            System.out.println("\"Python\" co trong danh sach.");
        } else {
            System.out.println("\"Python\" khong co trong danh sach.");
        }
}
}