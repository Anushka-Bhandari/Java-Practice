import java.util.*;
public class product {
    public static int multiply(int a, int b){
        return a*b;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter two integers: ");
        int x = sc.nextInt();
        int y = sc.nextInt();
        int res = multiply(x, y);
        System.out.println("product of " + x + " and " + y + " is: " + res);
        sc.close();
    }
}
