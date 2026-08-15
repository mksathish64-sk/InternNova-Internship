package week2.Task5;
import java.util.*;
public class StudentMarks {
    
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[5];
        for(int i=0;i<5;i++)
        {
            System.out.print("Enter the Mark of Student "+(i+1)+": ");
            arr[i] = sc.nextInt();
        }

        System.out.println("=================================================");
        System.out.println("\t\tStudent Details");
        System.out.println("=================================================");
        int total = 0;
        float avg;
        int high = arr[0], low = arr[0];
        System.out.print("Marks: ");
        for(int i=0;i<5;i++)
        {
            if(high<arr[i])
            {
                high = arr[i];
            }
            if(low>arr[i])
            {
                low = arr[i];
            }
            System.out.print(arr[i]+" ");
            total+=arr[i];
        } 
        avg =(float)total/5.0f;
        System.out.println("\nTotal: "+total);
        System.out.println("Average: "+avg);
        System.out.println("Highest Mark: "+high);
        System.out.println("Lowest Mark: "+low);

        sc.close();
    }
}
