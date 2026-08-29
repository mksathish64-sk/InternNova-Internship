package week4.Task3;

import java.util.HashSet;

public class UniqueCourses {

    public static void main(String[] args) {

        HashSet<String> courses = new HashSet<>();

        // Add course names
        courses.add("Java");
        courses.add("Python");
        courses.add("C");
        courses.add("C++");
        courses.add("JavaScript");
        courses.add("SQL");
        courses.add("HTML");

        // Duplicate entries
        courses.add("Java");
        courses.add("Python");

        System.out.println("===== UNIQUE COURSES =====");
        System.out.println("Final HashSet: " + courses);

        System.out.println("\nTotal Courses: " + courses.size());

        // Search for a course
        String searchCourse = "Java";

        if (courses.contains(searchCourse)) {
            System.out.println(searchCourse + " is available in the HashSet.");
        } else {
            System.out.println(searchCourse + " is not available in the HashSet.");
        }

        System.out.println("\nNote: Duplicate course names are not stored.");
    }
}