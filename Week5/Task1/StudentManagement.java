package Week5.Task1;

import Week5.Task1.studentmanagement.Student;

public class StudentManagement {

    public static void main(String[] args) {

        Student student = new Student(
                101,
                "Sathish",
                "Computer Science Engineering"
        );

        student.displayStudentInfo();
    }
}