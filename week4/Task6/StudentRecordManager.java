package week4.Task6;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.InputMismatchException;
import java.util.Scanner;

public class StudentRecordManager {

    static Scanner sc = new Scanner(System.in);

    // Student ID -> Student details
    static HashMap<Integer, String> students = new HashMap<>();

    // Unique courses
    static HashSet<String> courses = new HashSet<>();

    // Student IDs for maintaining student order
    static ArrayList<Integer> studentIds = new ArrayList<>();

    public static void main(String[] args) {

        boolean running = true;

        System.out.println("==========================================");
        System.out.println("       STUDENT RECORD MANAGER");
        System.out.println("==========================================");

        while (running) {

            displayMenu();

            try {
                System.out.print("Enter your choice: ");
                int choice = sc.nextInt();
                sc.nextLine();

                switch (choice) {

                    case 1:
                        addStudent();
                        break;

                    case 2:
                        viewStudents();
                        break;

                    case 3:
                        searchStudent();
                        break;

                    case 4:
                        removeStudent();
                        break;

                    case 5:
                        displayUniqueCourses();
                        break;

                    case 6:
                        running = false;
                        System.out.println("\nThank you for using Student Record Manager.");
                        break;

                    default:
                        System.out.println(
                                "\nError: Invalid menu choice. Please choose between 1 and 6."
                        );
                }

            } catch (InputMismatchException e) {

                System.out.println(
                        "\nError: Please enter a valid numeric choice."
                );

                sc.nextLine();
            }
        }

        sc.close();
    }

    // Display main menu
    static void displayMenu() {

        System.out.println("\n===== Student Record Manager =====");
        System.out.println("1. Add Student");
        System.out.println("2. View Students");
        System.out.println("3. Search Student");
        System.out.println("4. Remove Student");
        System.out.println("5. Display Unique Courses");
        System.out.println("6. Exit");
    }

    // Add student
    static void addStudent() {

        try {

            System.out.println("\n===== ADD STUDENT =====");

            System.out.print("Enter Student ID: ");
            int id = sc.nextInt();
            sc.nextLine();

            // Check unique Student ID
            if (students.containsKey(id)) {
                System.out.println(
                        "Error: Student ID " + id + " already exists."
                );
                return;
            }

            if (id <= 0) {
                System.out.println(
                        "Error: Student ID must be a positive number."
                );
                return;
            }

            System.out.print("Enter Student Name: ");
            String name = sc.nextLine();

            if (name.trim().isEmpty()) {
                System.out.println(
                        "Error: Student name cannot be empty."
                );
                return;
            }

            System.out.print("Enter Course: ");
            String course = sc.nextLine();

            if (course.trim().isEmpty()) {
                System.out.println(
                        "Error: Course cannot be empty."
                );
                return;
            }

            System.out.print("Enter Age: ");
            int age = sc.nextInt();
            sc.nextLine();

            if (age <= 0) {
                System.out.println(
                        "Error: Age must be a positive number."
                );
                return;
            }

            // StringBuilder for formatting student details
            StringBuilder details = new StringBuilder();

            details.append("Name: ").append(name);
            details.append(" | Course: ").append(course);
            details.append(" | Age: ").append(age);

            // Store in HashMap
            students.put(id, details.toString());

            // Store ID in ArrayList
            studentIds.add(id);

            // Store course in HashSet
            courses.add(course);

            System.out.println(
                    "\nStudent added successfully!"
            );

        } catch (InputMismatchException e) {

            System.out.println(
                    "\nError: Please enter valid numeric values."
            );

            sc.nextLine();
        }
    }

    // View students
    static void viewStudents() {

        System.out.println("\n===== ALL STUDENTS =====");

        if (students.isEmpty()) {
            System.out.println("No student records available.");
            return;
        }

        for (Integer id : studentIds) {

            if (students.containsKey(id)) {

                System.out.println(
                        "Student ID: " + id
                                + " | " + students.get(id)
                );
            }
        }
    }

    // Search student
    static void searchStudent() {

        try {

            System.out.println("\n===== SEARCH STUDENT =====");

            System.out.print("Enter Student ID: ");
            int id = sc.nextInt();
            sc.nextLine();

            if (id <= 0) {
                System.out.println(
                        "Error: Student ID must be positive."
                );
                return;
            }

            if (students.containsKey(id)) {

                System.out.println("Student Found!");
                System.out.println(
                        "Student ID: " + id
                                + " | " + students.get(id)
                );

            } else {

                System.out.println(
                        "Student with ID " + id
                                + " does not exist."
                );
            }

        } catch (InputMismatchException e) {

            System.out.println(
                    "Error: Invalid Student ID. Please enter a number."
            );

            sc.nextLine();
        }
    }

    // Remove student
    static void removeStudent() {

        try {

            System.out.println("\n===== REMOVE STUDENT =====");

            System.out.print("Enter Student ID: ");
            int id = sc.nextInt();
            sc.nextLine();

            if (students.containsKey(id)) {

                students.remove(id);
                studentIds.remove(Integer.valueOf(id));

                System.out.println(
                        "Student with ID " + id
                                + " removed successfully."
                );

            } else {

                System.out.println(
                        "Student with ID " + id
                                + " does not exist."
                );
            }

        } catch (InputMismatchException e) {

            System.out.println(
                    "Error: Invalid Student ID. Please enter a number."
            );

            sc.nextLine();
        }
    }

    // Display unique courses
    static void displayUniqueCourses() {

        System.out.println("\n===== UNIQUE COURSES =====");

        if (courses.isEmpty()) {
            System.out.println("No courses available.");
            return;
        }

        for (String course : courses) {
            System.out.println("- " + course);
        }

        System.out.println(
                "Total Unique Courses: " + courses.size()
        );
    }
}