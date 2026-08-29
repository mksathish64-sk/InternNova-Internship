package week4.Task5;

public class StringBuilderDemo {

    public static void main(String[] args) {

        // Create a StringBuilder
        StringBuilder text = new StringBuilder("Java Programming");

        System.out.println("Original Text: " + text);

        // Append additional text
        text.append(" is Easy");

        System.out.println("After Append: " + text);

        // Insert text at a specific position
        text.insert(5, "Language ");

        System.out.println("After Insert: " + text);

        // Replace a portion of the text
        text.replace(0, 4, "Core");

        System.out.println("After Replace: " + text);

        // Reverse the final string
        text.reverse();

        System.out.println("After Reverse: " + text);
    }
}