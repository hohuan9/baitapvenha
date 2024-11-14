
package baitapvenha6;
import java.util.Scanner;
public class chuoipalindrome {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap chuoi can ktra palindrome: ");
        String str = scanner.nextLine();
        
        boolean isPalindrome = checkPalindrome(str);
        if(isPalindrome){
            System.out.println("chuoi '" + str + "' la chuoi palindrome");
        }else{
            System.out.println("chuoi '" + str + "' khong la chuoi palindrome");
        }
    }
    public static boolean checkPalindrome(String str){
        int left = 0;
        int right = str.length()-1;
        while(left < right){
            if(str.charAt(left) != str.charAt(right)){
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}
