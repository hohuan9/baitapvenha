
package tong1songuyen;

import java.util.Scanner;

public class Tong1songuyen {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap so can tinh tong n: ");
        int n = scanner.nextInt();
        int s=0;
        n = Math.abs(n);
        for (;n>0;){
            int d = n % 10;
            s = s + d;
            n = n/10;
        }
        System.out.print("Tong cac chu so la: " + s);
        scanner.close();
    }
    
}
