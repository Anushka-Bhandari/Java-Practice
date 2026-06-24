import java.util.*;
public class fact_function {
    public static int fact(int n){
        int factorial = 1;
        for(int i=1; i<=n; i++){
            factorial *= i;
        }
    return factorial;
    }
    public static void main(String args[]){
        System.out.println("enter value: ");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int res = fact(a);
        System.out.println("factorial of " + a + " is: " + res);
        sc.close();
    }
}
