import java.util.*;
public class sum_of_integer {
    public static int sumOfDigits(int n){
        int sum = 0;
        while(n > 0){
            int ld = n % 10;
            sum += ld;
            n /= 10;
        }
        return sum;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("enter any integer: ");
        int n = sc.nextInt();
        System.out.println("sum of digits of " + n + " is " + sumOfDigits(n));
        sc.close();
    }
}
