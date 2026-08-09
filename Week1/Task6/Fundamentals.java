package Week1.Task6;

import java.util.*;

public class Fundamentals {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter an integer value: ");
        int intValue = sc.nextInt();

        System.out.print("Enter a float value: ");
        float floatValue = sc.nextFloat();

        System.out.print("Enter a double value: ");
        double doubleValue = sc.nextDouble();

        System.out.println("\n======================================");
        System.out.println("        ORIGINAL VALUES");
        System.out.println("======================================");
        System.out.println("Integer : " + intValue);
        System.out.println("Float   : " + floatValue);
        System.out.println("Double  : " + doubleValue);

        // Implicit Type Casting
        double intToDouble = intValue;
        double floatToDouble = floatValue;

        System.out.println("\n======================================");
        System.out.println("        IMPLICIT TYPE CASTING");
        System.out.println("======================================");
        System.out.println("Before (int)   : " + intValue);
        System.out.println("After (double) : " + intToDouble);

        System.out.println();

        System.out.println("Before (float) : " + floatValue);
        System.out.println("After (double) : " + floatToDouble);

        // Explicit Type Casting
        int doubleToInt = (int) doubleValue;
        int floatToInt = (int) floatValue;

        System.out.println("\n======================================");
        System.out.println("        EXPLICIT TYPE CASTING");
        System.out.println("======================================");
        System.out.println("Before (double) : " + doubleValue);
        System.out.println("After (int)     : " + doubleToInt);

        System.out.println();

        System.out.println("Before (float) : " + floatValue);
        System.out.println("After (int)    : " + floatToInt);

        sc.close();
    }
}