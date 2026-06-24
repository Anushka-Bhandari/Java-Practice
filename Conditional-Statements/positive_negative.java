import java.util.*;
public class positive_negative {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("enter a number: ");
        int num = sc.nextInt();
        if(num == 0){
            System.out.println("you entered 0");
        }
        else if(num > 0){
            System.out.println("you entered a positive number");
        }
        else{
            System.out.println("you entered a negative number");
        }
        sc.close();
    }
}
