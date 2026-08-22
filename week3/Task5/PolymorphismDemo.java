package week3.Task5;

public class PolymorphismDemo {

    public static void main(String[] args) {

        Calculator calculator = new Calculator();

        System.out.println("======================================");
        System.out.println("       METHOD OVERLOADING");
        System.out.println("======================================");

        System.out.println("calculate(10, 20)       : "
                + calculator.calculate(10, 20));

        System.out.println("calculate(10.5, 20.5)   : "
                + calculator.calculate(10.5, 20.5));

        System.out.println("calculate(10, 20, 30)   : "
                + calculator.calculate(10, 20, 30));

        System.out.println("\n======================================");
        System.out.println("       METHOD OVERRIDING");
        System.out.println("======================================");

        Vehicle car = new Car();
        Vehicle bike = new Bike();

        System.out.print("Car  : ");
        car.start();

        System.out.print("Bike : ");
        bike.start();
    }
}