import java.util.*;
public class average{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter three numbers: ");
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        int n3 = sc.nextInt();
        float avg = (float) (n1 + n2 + n3)/3;
        System.out.println("average is : " + avg);
        sc.close();
    }
}