import java.util.*;
public class even_odd_sum {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int num;
        int odd_sum = 0;
        int even_sum = 0;
        int choice;
        do{
            System.out.print("enter a number: ");
            num = sc.nextInt();
            if(num % 2 == 0){
                even_sum += num;
            }
            else{
                odd_sum += num;
            }
            System.out.print("to continue press 1, to end press 0: ");
            choice = sc.nextInt();
        }while(choice == 1);
        System.out.println("sum of even numbers : " + even_sum);
        System.out.println("sum of odd numbers : " + odd_sum);
        sc.close();
    }
}
