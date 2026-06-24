import java.util.*;
public class ComplexNo{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("enter real part of number1: ");
        int real1 = sc.nextInt();
        System.out.print("enter imaginary part of number1: ");
        int imaginary1 = sc.nextInt();
        System.out.print("enter real part of number2: ");
        int real2 = sc.nextInt();
        System.out.print("enter imaginary part of number2: ");
        int imaginary2 = sc.nextInt();
        Complex c1 = new Complex(real1, imaginary1);
        Complex c2 = new Complex(real2, imaginary2);
        Complex sumResult = c1.sum(c2);
        Complex diffResult = c1.difference(c2);
        Complex prodResult = c1.product(c2);
        System.out.print("Sum: ");
        sumResult.display();
        System.out.print("Difference: ");
        diffResult.display();
        System.out.print("Product: ");
        prodResult.display();
        sc.close();
    }
}
class Complex{
    int real;
    int imaginary;
    Complex(int real, int imaginary){
        this.real = real;
        this.imaginary = imaginary;
    }
    Complex sum(Complex c){
        return new Complex(this.real + c.real, this.imaginary + c.imaginary);
    }
    Complex difference(Complex c){
        return new Complex(this.real - c.real, this.imaginary - c.imaginary);
    }
    Complex product(Complex c){
        int realPart = (this.real * c.real) - (this.imaginary * c.imaginary);
        int imagPart = (this.real * c.imaginary) + (this.imaginary * c.real);
        return new Complex(realPart, imagPart);
    }
    void display(){
        if(real == 0 && imaginary == 0){
            System.out.println("0");
        }
        else if(real == 0 && imaginary != 0){
            System.out.println(imaginary + "i");
        }
        else if(imaginary == 0 && real != 0){
            System.out.println(real);
        }
        else if(imaginary < 0){
            System.out.println(real + " - " + (-imaginary) + "i");
        }
        else{
            System.out.println(real + " + " + imaginary + "i");
        }
    }
}