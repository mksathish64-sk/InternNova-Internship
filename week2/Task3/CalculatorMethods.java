package week2.Task3;
import java.util.*;
public class CalculatorMethods {

    static int add(int a, int b)
    {
        return a+b;
    }

    static int sub(int a, int b)
    {
        return a-b;
    }

    static int multiply(int a, int b)
    {
        return a*b;
    }

    static float div(int a, int b)
    {   
        if(b==0)
        {
            throw new ArithmeticException("Can't divide by zero");            
        }
        return (float)a/b;
    }

    static float mod(int a, int b)
    {   
        if(b==0)
        {
            throw new ArithmeticException("Can't divide by zero");            
        }
        return a%b;
    }
    
    public static void main(String[] args)
    {
        int a,b;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the First number: ");
        a = sc.nextInt();
        System.out.print("Enter the Second number: ");
        b = sc.nextInt();

        System.out.println("Addition: "+add(a,b));
        System.out.println("Subtraction: "+sub(a,b));
        System.out.println("Multiplication: "+multiply(a,b));
        System.out.printf("Division: %.2f\n",div(a,b));
        System.out.println("Modulus: "+mod(a,b));

        sc.close();

    }
}
