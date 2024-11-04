package sochansole;

public class Sochansole {

    public static void main(String[] args) {
        int s = 0, s1 = 0;
        for (int i = 1; i <= 100; i++) {

            if (i % 2 == 0) {
                s = s + i;
            } else {
                s1 = s1 + i;
            }
        }
        System.out.print("Tong cac so chan: " + s);
        System.out.print("\nTong cac so le: " + s1);

    }

}
