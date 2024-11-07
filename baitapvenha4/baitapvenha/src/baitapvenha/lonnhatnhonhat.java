
package baitapvenha;
import java.util.Scanner;
public class lonnhatnhonhat {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhap so luong phan tu: ");
        int n = scanner.nextInt();

        int[] a = new int[n];
        System.out.println("Nhap cac phan tu cua mang:");
        for (int i = 0; i < n; i++) {
            System.out.print("Phan tu " + (i + 1) + ": ");
            a[i] = scanner.nextInt();
        }
        int max = a[0];  
        int min = a[0];  

        for (int i = 1; i < n; i++) {
            if (a[i] > max) {
                max = a[i]; 
            }
            if (a[i] < min) {
                min = a[i]; 
            }
        }

        System.out.println("Phan tu lon nhat trong mang: " + max);
        System.out.println("Phan tu nho nhat trong mang: " + min);
    }
    
}
