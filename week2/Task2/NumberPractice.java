package week2.Task2;

public class NumberPractice {
    
    public static void main(String[] args)
    {
        int i;
        //Numbers from 1 to 100
        System.out.println("Numbers from 1 to 100:");
        for(i=1;i<=100;i++)
        {
            System.out.print(i+" ");
        }

        //Even Numbers from 1 to 100
        System.out.println("\n-----------------------------------\nEven Numbers from 1 to 100:");
        i=1;
        while(i<=100)
        {
            if(i%2==0)
            {
                System.out.print(i+" ");
            }
            i++;
        }

        //Odd Numbers from 1 to 100
        System.out.println("\n-----------------------------------\nOdd Numbers from 1 to 100:");
        i=1;
        do
        {
            if(i%2!=0)
            {
                System.out.print(i+" ");
            }
            i++;
        }while(i<=100);

        //Sum of Numbers from 1 to 100
        int sum=0;
        for(i=1;i<=100;i++)
        {
            sum+=i;
        }
        System.out.println("\n-----------------------------------\nSum of Numbers from 1 to 100: "+sum);
    }
}
