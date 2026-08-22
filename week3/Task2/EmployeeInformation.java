package week3.Task2;
public class EmployeeInformation {

    public static void main(String[] args) {

        // Object using default constructor
        Employee employee1 = new Employee();

        // Objects using parameterized constructor
        Employee employee2 = new Employee(
                102,
                "Arun",
                "Development",
                45000
        );

        Employee employee3 = new Employee(
                103,
                "Karthik",
                "Testing",
                40000
        );

        System.out.println("===================================");
        System.out.println("       EMPLOYEE INFORMATION");
        System.out.println("===================================");

        System.out.println("\nEmployee 1 - Default Constructor");
        employee1.displayDetails();

        System.out.println("Employee 2 - Parameterized Constructor");
        employee2.displayDetails();

        System.out.println("Employee 3 - Parameterized Constructor");
        employee3.displayDetails();
    }
}