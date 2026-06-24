import java.util.*;
public class is_even {
    public static boolean isEven(int n){
        if(n % 2 == 0){
            return true;
        }
        return false;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("enter an integer value: ");
        int n = sc.nextInt();
        if(isEven(n)){
            System.out.println(n + " is even");
        }
        else{
            System.out.println(n + " is not even");
        }
        sc.close();
    }
}
