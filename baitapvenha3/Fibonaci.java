package fibonaci;

import java.util.Scanner;

public class Fibonaci {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap vao so phan tu n muon in ra: ");
        int n = scanner.nextInt();
        
        if(n <= 0){
            System.out.println("Vui long nhap so duong!");
        }else{
            System.out.print("Day fibonaci " + n + " la: ");
            
            int a = 0;
            int b = 1;
            
            for (int i=1; i<=n; i++){
                System.out.print(a);
                
                if (i<n){
                    System.out.print(", ");
                }
                int c = a + b;
                a = b;
                b = c;
            }
        }
        scanner.close();
    }
}
