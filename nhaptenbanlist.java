package baitapvenha2;

import java.util.*;
import java.util.Scanner;

public class nhaptenbanlist {

    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        for (int i = 1; i <= 5; i++) {
            System.out.print("nhap ten thu " + i + " : ");
            String name = scanner.nextLine();
            names.add(name);
        }
        System.out.println("ten cac ban: " + names);
    }

}
