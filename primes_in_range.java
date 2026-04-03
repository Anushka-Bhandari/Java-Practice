import java.util.*;
public class primes_in_range {
    public static boolean isPrime(int x){
        if(x <= 1){
            return false;
        }
        if(x == 2){
            return true;
        }
        for(int i=2; i<=Math.sqrt(x); i++){
            if(x % i == 0){
                return false;
            }
        }
        return true;
    }
    public static void primes_range(int n){
        for(int i=2; i<=n; i++){
            if(isPrime(i)){
                System.out.print(i + " ");
            }
        }
        System.out.println();
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter range: ");
        int n = sc.nextInt();
        primes_range(n);
        sc.close();
    }
}
