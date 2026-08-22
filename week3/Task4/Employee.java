package week3.Task4;

public class Employee {

    String name;
    int employeeId;
    double salary;

    Employee(String name, int employeeId, double salary) {
        this.name = name;
        this.employeeId = employeeId;
        this.salary = salary;
    }

    void displayDetails() {
        System.out.println("Name        : " + name);
        System.out.println("Employee ID : " + employeeId);
        System.out.println("Salary      : " + salary);
    }
}