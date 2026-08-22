public class StudentManagement {

    public static void main(String[] args) {

        Student student1 = new Student();
        student1.studentName = "Sathish";
        student1.rollNumber = 101;
        student1.branch = "CSE";
        student1.cgpa = 8.73;

        Student student2 = new Student();
        student2.studentName = "Arun";
        student2.rollNumber = 102;
        student2.branch = "CSE";
        student2.cgpa = 8.65;

        Student student3 = new Student();
        student3.studentName = "Karthik";
        student3.rollNumber = 103;
        student3.branch = "CSE";
        student3.cgpa = 9.02;

        System.out.println("===================================");
        System.out.println("       STUDENT INFORMATION");
        System.out.println("===================================");

        student1.displayDetails();
        student2.displayDetails();
        student3.displayDetails();
    }
}
