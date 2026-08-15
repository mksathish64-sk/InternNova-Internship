package week2.Task4;
import java.util.*;
public class MethodParameters {
    
    static int square(int n)
    {
        return n*n;
    }

    static int cube(int n)
    {
        return n*n*n;
    }
    
    static float average(int a,int b,int c)
    {
        return (float)(a+b+c)/3;
    }

    static int max(int a, int b)
    {
        if(a>b)
        {
            return a;
        }
        else
        {
            return b;
        }
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        // Square of a Number
        System.out.print("\nEnter the Number to find Square: ");
        int n = sc.nextInt();
        System.out.println("Square of "+n+" is: "+square(n));

        // Cube of a Number
        System.out.print("-------------------------------------\nEnter the Number to find Cube: ");
        n = sc.nextInt();
        System.out.println("Cube of "+n+" is: "+cube(n));

        // Average of three Numbers
        System.out.println("-------------------------------------\nAverage of three Numbers");
        System.out.print("Enter the First Number: ");
        int a = sc.nextInt();
        System.out.print("Enter the Second Number: ");
        int b = sc.nextInt();
        System.out.print("Enter the Third Number: ");
        int c = sc.nextInt();
        System.out.printf("Average of %d,%d and %d is: %.2f\n",a,b,c,average(a,b,c));

        // Maximum of two Numbers
        System.out.println("-------------------------------------\nMaximum of two Numbers");
        System.out.print("Enter the First Number: ");
        a = sc.nextInt();
        System.out.print("Enter the Second Number: ");
        b = sc.nextInt();
        System.out.println("Maximum of "+a+" and "+b+" is: "+max(a,b));

        sc.close();
    }
}
