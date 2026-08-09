package Week1.Task3;
import java.util.*;


public class ScannerInput {
    
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your Full Name: ");
        String name = sc.nextLine();
        System.out.print("Enter your Age: ");
        int age = sc.nextInt();  
        sc.nextLine();      
        System.out.print("Enter your College Name: ");
        String college = sc.nextLine();
        System.out.print("Enter your Branch Name: ");
        String branch = sc.next();
        System.out.print("Enter your City: ");
        String city = sc.next();
        System.out.println();
        System.out.println("===============================================");
        System.out.println("\t\tYour Details\t");
        System.out.println("===============================================");
        System.out.println("Name\t:"+name);
        System.out.println("Age\t:"+age);
        System.out.println("College\t:"+college);
        System.out.println("Branch\t:"+branch);
        System.out.println("City\t:"+city);

        sc.close();
    }
}
