import java.util.*;
public class floyds_triangle {
    public static void floydsTriangle(int n){
        int num = 1;
        for(int i=1; i<=n; i++){
            for(int j=1; j<=i; j++){
                System.out.print(num + " ");
                num++;
            }
            System.out.println();
        }
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("enter value of n: ");
        int n = sc.nextInt();
        floydsTriangle(n);
        sc.close();
    }
}
