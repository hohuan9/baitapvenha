package randomso;

import java.util.Scanner;
import java.util.Random;

public class Randomso {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int somayman = random.nextInt(50) + 1;
        int sodoan = 0;

        System.out.println("Doan 1 so tu 1 den 50: ");

        while (sodoan != somayman) {
            System.out.println("So ban doan la: ");
            sodoan = scanner.nextInt();

            if (sodoan > somayman) {
                System.out.println("So ban nhap cao hon! thu lai!");
            } else if (sodoan < somayman) {
                System.out.println("So ban nhap thap hon! thu lai!");
            } else {
                System.out.println("Chuc mung ban da doan dung " + somayman + "!");
            }
            
        }scanner.close();
    }
}
