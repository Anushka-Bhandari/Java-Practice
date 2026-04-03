import java.util.*;
public class prime_or_not {
   public static boolean isPrime(int n){
    if(n <= 1){
        return false;
    }
    if(n == 2){
        return true;
    }
    for(int i=2; i<=Math.sqrt(n); i++){
        if(n % i == 0){
            return false;
        }
    }
    return true;
   } 
   public static void main(String args[]){
    System.out.print("enter value: ");
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    boolean res = isPrime(n);
    if(res == true){
        System.out.println(n + " is prime");
    }
    else{
        System.out.println(n + " is not prime");
    }
    sc.close();
   }
}
