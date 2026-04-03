import java.util.*;
public class binomial_coefficient {
    public static int factorial(int n){
        int fact = 1;
        for(int i=1; i<=n; i++){
            fact *= i;
        }
        return fact;
    }
    public static int binomial(int n, int r){
        int n_fact = factorial(n);
        int r_fact = factorial(r);
        int n_r_fact = factorial(n-r);
        return n_fact / (r_fact * n_r_fact);
    }
    public static void main(String args[]){
        System.out.println("enter values of n and r: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int r = sc.nextInt();
        int res = binomial(n, r);
        System.out.println("binomial coefficient is: " + res);
        sc.close();
    }
}
