package week4.Task1;

import java.util.InputMismatchException;
import java.util.Scanner;

public class SafeCalculator {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("Enter first number: ");
            int num1 = sc.nextInt();

            System.out.print("Enter second number: ");
            int num2 = sc.nextInt();

            System.out.println("\n===== CALCULATOR =====");
            System.out.println("Addition       : " + (num1 + num2));
            System.out.println("Subtraction    : " + (num1 - num2));
            System.out.println("Multiplication : " + (num1 * num2));

            try {
                System.out.println("Division       : " + (num1 / num2));
                System.out.println("Modulus        : " + (num1 % num2));
            }
            catch (ArithmeticException e) {
                System.out.println("Error: Cannot divide by zero.");
            }

        }
        catch (InputMismatchException e) {
            System.out.println("Error: Please enter valid numeric values.");
        }

        System.out.println("\nProgram executed successfully.");
        sc.close();
    }
}