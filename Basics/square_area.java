import java.util.*;
public class square_area {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("enter side of square: ");
        int s = sc.nextInt();
        int area = s * s;
        System.out.println("area is : " + area);
        sc.close();
    }
}
