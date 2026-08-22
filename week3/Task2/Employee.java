package week3.Task2;
public class Employee {

    int employeeId;
    String employeeName;
    String department;
    double salary;

    // Default Constructor
    Employee() {
        employeeId = 0;
        employeeName = "Not Assigned";
        department = "Not Assigned";
        salary = 0.0;
    }

    // Parameterized Constructor
    Employee(int employeeId, String employeeName, String department, double salary) {
        this.employeeId = employeeId;
        this.employeeName = employeeName;
        this.department = department;
        this.salary = salary;
    }

    void displayDetails() {
        System.out.println("Employee ID   : " + employeeId);
        System.out.println("Employee Name : " + employeeName);
        System.out.println("Department    : " + department);
        System.out.println("Salary        : " + salary);
        System.out.println("-----------------------------------");
    }
}