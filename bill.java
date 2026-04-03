import java.util.*;
public class bill {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("enter cost of pencil: ");
        float pencil = sc.nextFloat();
        System.out.print("enter cost of pen: ");
        float pen = sc.nextFloat();
        System.out.print("enter cost of eraser: ");
        float eraser = sc.nextFloat();
        float total = pencil + pen + eraser;
        float result = total + total * 0.18f;
        System.out.println("your bill is : " + result);
        sc.close();
    }
}
