package week3.Task4;

public class Developer extends Employee {

    String programmingLanguage;

    Developer(String name, int employeeId, double salary,
              String programmingLanguage) {

        super(name, employeeId, salary);
        this.programmingLanguage = programmingLanguage;
    }

    void writeCode() {
        System.out.println("Programming Language : " + programmingLanguage);
        System.out.println("Role                 : Developing software applications");
    }

    @Override
    void displayDetails() {
        super.displayDetails();
        writeCode();
    }
}