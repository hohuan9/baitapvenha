package songuyento;

public class Songuyento {

    public static void main(String[] args) {
        System.out.println("So nguyen to: ");
        for (int i = 1; i <= 100; i++) {
            if (choice(i)) {
                System.out.print(i + ", ");
            }        
        }
    }

    public static boolean choice(int n) {
        if (n < 2) return false;  // 0 và 1 không phải là số nguyên tố
        for (int j = 2; j <= Math.sqrt(n); j++) {
            if (n % j == 0) return false; // Nếu n chia hết cho bất kỳ số nào từ 2 đến căn bậc hai của nó, thì không phải số nguyên tố
        }
        return true; // Ngược lại, là số nguyên tố
    }
}

