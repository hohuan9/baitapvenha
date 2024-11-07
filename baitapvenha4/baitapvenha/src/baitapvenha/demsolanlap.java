
package baitapvenha;
import java.util.Scanner;
public class demsolanlap {
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

        System.out.print("Nhap so nguyen muon dem: ");
        int x = scanner.nextInt();

        int count = 0;
        for (int i = 0; i < n; i++) {
            if (a[i] == x) {
                count++;
            }
        }

        System.out.println("So lan xuat hien cua " + x + " trong mang: " + count);
    }
}
