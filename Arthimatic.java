import java.util.Scanner;
public class Arthimatic {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int num1 = sc.nextInt();
        System.out.print("Enter second number: ");
        int num2 = sc.nextInt();
        int sum = num1 + num2;
        int difference = num1 - num2;       
        int product = num1 * num2;
        double quotient = (double) num1 / num2;
        int modulus = num1 % num2;
        System.out.println("Sum: " + sum);
        System.out.println("Difference: " + difference);
        System.out.println("Product: " + product);
        System.out.println("Quotient: " + quotient);
        System.out.println("Modulus: " + modulus);
        sc.close();
        int num3 = 15;
        num3 += 5; // num3 is now 20
        System.out.println("After += operator: " + num3);
        int num4 = 10;
        num4++; // num4 is now 11
        System.out.println("After increment operator: " + num4);
        int num5 = 20;
        num5--; // num5 is now 19
        System.out.println("After decrement operator: " + num5);
        int num6 = 5;
        ++num6; // num6 is now 6
        System.out.println("After pre-increment operator: " + num6);
        int num7 = 10;
        --num7; // num7 is now 9
        System.out.println("After pre-decrement operator: " + num7);

    }
    
}
