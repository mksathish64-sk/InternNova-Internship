package Week5.Task4;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class StudentFileHandler {

    public static void main(String[] args) {

        String fileName = "students.txt";

        try {
            // Writing to file
            FileWriter writer = new FileWriter(fileName);

            writer.write("Student ID: 101\n");
            writer.write("Student Name: Sathish\n");
            writer.write("Course: CSE\n");
            writer.write("Marks: 89\n\n");

            writer.write("Student ID: 102\n");
            writer.write("Student Name: Arun\n");
            writer.write("Course: IT\n");
            writer.write("Marks: 92\n");

            writer.close();

            System.out.println("Data written successfully.\n");

            // Reading from file
            System.out.println("===== FILE CONTENT =====");

            BufferedReader reader =
                    new BufferedReader(new FileReader(fileName));

            String line;

            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }

            reader.close();

        }
        catch (IOException e) {
            System.out.println(
                    "Error occurred while handling file."
            );

            System.out.println(e.getMessage());
        }
    }
}