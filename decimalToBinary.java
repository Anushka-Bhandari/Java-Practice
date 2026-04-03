import java.util.*;
public class decimalToBinary {
    public static int dec_to_bin(int dec){
        int pow = 0;
        int bin = 0;
        while(dec > 0){
        int r = dec % 2 ;
        bin += r * (int) Math.pow(10, pow);
        pow++;
        dec /= 2;
        }
        return bin;
    }
    public static void main(String args[]){
        System.out.print("enter any decimal number: ");
        Scanner sc = new Scanner(System.in);
        int dec = sc.nextInt();
        int res = dec_to_bin(dec);
        System.out.println("binary equivalent of " + dec + " is " + res);
        sc.close();
    }
}
