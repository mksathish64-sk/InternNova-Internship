package week3.Task4;

public class EmployeeManagement {

    public static void main(String[] args) {

        Developer developer = new Developer(
                "Sathish",
                101,
                55000,
                "Java"
        );

        Manager manager = new Manager(
                "Arun",
                102,
                70000,
                8
        );

        System.out.println("======================================");
        System.out.println("       EMPLOYEE MANAGEMENT");
        System.out.println("======================================");

        System.out.println("\n--- Developer Details ---");
        developer.displayDetails();

        System.out.println("\n--------------------------------------");

        System.out.println("\n--- Manager Details ---");
        manager.displayDetails();
    }
}
