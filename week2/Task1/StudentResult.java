package week2.Task1;
import java.util.*;
public class StudentResult {

    public static void main(String[] args)
    {
        String name;
        int mark1,mark2,mark3;
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your Name: ");
        name =  sc.nextLine();
        System.out.print("Enter first Mark: ");
        mark1 = sc.nextInt();
        System.out.print("Enter second Mark: ");
        mark2 = sc.nextInt();
        System.out.print("Enter third Mark: ");
        mark3 = sc.nextInt();

        int total = mark1 + mark2 + mark3;
        float percentage = total/3.0f;
        
        System.out.print("--------------------------------------------\n");
        System.out.println("\t  Student Mark details");
        System.out.print("--------------------------------------------\n");
        System.out.println("Name: "+name);
        System.out.println("Subject1: "+mark1);
        System.out.println("Subject2: "+mark2);
        System.out.println("Subject3: "+mark3);
        System.out.println("Total: "+total);
        System.out.printf("Percentage: %.2f\n",percentage);

        if(percentage>90)
        {
            System.out.println("Grade:'O' , Excellent");
        }
        else if(percentage>80 && percentage<=90)
        {
            System.out.println("Grade:'A+' , Very Good");
        }
        else if(percentage>70 && percentage<=80)
        {
            System.out.println("Grade:'A' , Good");
        }
        else if(percentage>60 && percentage<=70)
        {
            System.out.println("Grade:'B+' , Try do get more Marks");
        }
        else if(percentage>50 && percentage<=60)
        {
            System.out.println("Grade:'B' , Need More Concentration!!");
        }
        else
        {
            System.out.println("!!You are Fail!!");
        }
        sc.close();
    }    
}
