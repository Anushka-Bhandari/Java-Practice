import java.util.*;
public class binaryToDecimal {
    public static int bin_to_dec(int bin){
        int pow = 0; 
        int dec = 0;
        while(bin > 0){
          int ld = bin % 10;
          dec += ld * (int)Math.pow(2, pow);  
          pow++;
          bin /= 10;
        }
        return dec;
    }
    public static void main(String args[]){
        System.out.print("enter any binary number: ");
        Scanner sc = new Scanner(System.in);
        int binary = sc.nextInt();
        int res = bin_to_dec(binary);
        System.out.println("decimal equivalent of " + binary + " is " + res);
        sc.close();
    }
}
