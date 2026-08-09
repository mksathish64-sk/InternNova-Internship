package Week1.Task5;

public class TypeCasting {
    
    public static void main(String[] args)
    {
        int a = 10;
        double b = a;
        System.out.println("==================================");
        System.out.println("\tImplict Type Casting");
        System.out.println("Before: "+a);
        System.out.println("After: "+b);
        double c = 10.95;
        int d = (int)c;
        System.out.println("===================================");
        System.out.println("\tExplicit Type Casting");
        System.out.println("Before: "+c);
        System.out.println("After: "+d);

    }
}
