import java.util.*;
public class palindrome {
    public static int reverse(int n){
        int num = 0;
        while(n > 0){
            int ld = n % 10;
            num = num * 10 + ld;
            n /= 10;
        }
        return num;
    }
    public static boolean isPalindrome(int n){
        if(n == reverse(n)){
            return true;
        }
        return false;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("enter a number: ");
        int n = sc.nextInt();
        if(isPalindrome(n)){
            System.out.println(n + " is a palindrome number.");
        }
        else{
            System.out.println(n + " is not a palindrome number.");
        }
        sc.close();
    }
}
