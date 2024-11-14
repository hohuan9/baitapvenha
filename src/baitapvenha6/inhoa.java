
package baitapvenha6;
import java.util.Scanner;
public class inhoa {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("nhap chuoi can in hoa: ");
        String str = scanner.nextLine();
        String inhoa = "";
        for (int i=0; i < str.length(); i++){
            char a = str.charAt(i);
            if(a >= 'A' && a <= 'Z'){
                inhoa += (char) (a+32);
            }else if(a >= 'a' && a <= 'z'){
                inhoa += (char) (a-32);
            }else{
                inhoa += a;
            }
        }
        System.out.print("chuoi sau khi in hoa: " + inhoa);
    }
}
