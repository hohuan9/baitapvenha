
package baitapvenha;
import java.util.Scanner;
public class trongvatrungbinh {
     public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhap so luong phan tu trong mang: ");
        int n = scanner.nextInt();

        int[] a = new int[n];
        System.out.println("Nhap cac phan tu cua mang:");
        for (int i = 0; i < n; i++) {
            System.out.print("Phan tu " + (i + 1) + ": ");
            a[i] = scanner.nextInt();
        }

        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum += a[i];
        }

        double average = (double) sum / n;

        System.out.println("Tong cac phan tu: " + sum);
        System.out.printf("Trung binh cong cac pha tu: %.2f", average);
    }
}
