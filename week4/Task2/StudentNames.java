package week4.Task2;

import java.util.ArrayList;

public class StudentNames {

    public static void main(String[] args) {

        ArrayList<String> students = new ArrayList<>();

        // Add student names
        students.add("Sathish");
        students.add("Arun");
        students.add("Karthik");
        students.add("Vijay");
        students.add("Rahul");

        System.out.println("===== STUDENT NAMES =====");
        System.out.println("All Students: " + students);

        // Remove a student
        students.remove("Vijay");
        System.out.println("\nAfter removing Vijay:");
        System.out.println(students);

        // Search for a student
        String searchName = "Karthik";

        if (students.contains(searchName)) {
            System.out.println("\n" + searchName + " is found in the collection.");
        } else {
            System.out.println("\n" + searchName + " is not found in the collection.");
        }

        // Display final collection
        System.out.println("\nFinal Student Collection:");
        for (String student : students) {
            System.out.println(student);
        }
    }
}