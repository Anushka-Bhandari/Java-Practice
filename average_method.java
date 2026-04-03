import java.util.*;
public class average_method {
    public static float average(float a, float b, float c){
        return (a + b + c)/3;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter three numbers: ");
        float a = sc.nextFloat();
        float b = sc.nextFloat();
        float c = sc.nextFloat();
        System.out.println("average of " + a + ", " + b + ", " + c + " is: " + average(a, b, c));
        sc.close();
    }
}
