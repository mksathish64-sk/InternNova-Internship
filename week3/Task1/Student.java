
public class Student {

    String studentName;
    int rollNumber;
    String branch;
    double cgpa;

    public void displayDetails() {
        System.out.println("Student Name : " + studentName);
        System.out.println("Roll Number  : " + rollNumber);
        System.out.println("Branch       : " + branch);
        System.out.println("CGPA         : " + cgpa);
        System.out.println("-----------------------------------");
    }
}