import java.util.*;
public class hollow_rectangle{
    public static void hollowRectangle(int m, int n){
        for(int i=1; i<=m; i++){
            for(int j=1; j<=n; j++){
                if(i==1 || i==m || j==1 || j==n){
                    System.out.print("* ");
                }
                else{
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter rows and columns: ");
        int m = sc.nextInt();
        int n = sc.nextInt();
        hollowRectangle(m, n);
        sc.close();
    }
}