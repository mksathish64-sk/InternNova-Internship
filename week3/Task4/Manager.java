package week3.Task4;

public class Manager extends Employee {

    int teamSize;

    Manager(String name, int employeeId, double salary, int teamSize) {

        super(name, employeeId, salary);
        this.teamSize = teamSize;
    }

    void manageTeam() {
        System.out.println("Team Size   : " + teamSize);
        System.out.println("Responsibility : Managing the development team");
    }

    @Override
    void displayDetails() {
        super.displayDetails();
        manageTeam();
    }
}
