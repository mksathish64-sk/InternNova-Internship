package week4.Task4;

import java.util.HashMap;

public class StudentRecords {

    public static void main(String[] args) {

        HashMap<Integer, String> students = new HashMap<>();

        // Add student records
        students.put(101, "Sathish");
        students.put(102, "Arun");
        students.put(103, "Karthik");
        students.put(104, "Vijay");
        students.put(105, "Rahul");

        System.out.println("===== STUDENT RECORDS =====");
        System.out.println("All Student Records:");

        for (Integer id : students.keySet()) {
            System.out.println("Student ID: " + id
                    + " | Student Name: " + students.get(id));
        }

        // Search for a student using Student ID
        int searchId = 103;

        System.out.println("\n===== SEARCH STUDENT =====");

        if (students.containsKey(searchId)) {
            System.out.println("Student Found:");
            System.out.println("Student ID: " + searchId);
            System.out.println("Student Name: " + students.get(searchId));
        } else {
            System.out.println("Student with ID "
                    + searchId + " not found.");
        }

        // Remove a student record
        int removeId = 104;

        students.remove(removeId);

        System.out.println("\n===== UPDATED RECORDS =====");

        for (Integer id : students.keySet()) {
            System.out.println("Student ID: " + id
                    + " | Student Name: " + students.get(id));
        }
    }
}