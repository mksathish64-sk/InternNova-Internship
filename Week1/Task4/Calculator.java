package Week1.Task4;
import java.util.*;
public class Calculator {
    
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the First Number: ");
        int a = sc.nextInt();
        System.out.print("Enter the Second Number: ");
        int b = sc.nextInt();
        System.out.println("====================================");
        System.out.println("\tCalculator Operations");
        System.out.println("====================================");
        System.out.println("Addition\t: "+(a+b));
        System.out.println("Subtraction\t: "+(a-b));
        System.out.println("Multiplication\t: "+(a*b));
        System.out.println("Division\t: "+(a/b));
        System.out.println("Modulus\t\t: "+(a%b));

        sc.close();
    }
}
