package Week5.Task3;

public class ShapeDemo {

    public static void main(String[] args) {

        Shape circle = new Circle(5);
        circle.displayMessage();
        circle.calculateArea();

        System.out.println();

        Shape rectangle = new Rectangle(10, 6);
        rectangle.displayMessage();
        rectangle.calculateArea();
    }
}