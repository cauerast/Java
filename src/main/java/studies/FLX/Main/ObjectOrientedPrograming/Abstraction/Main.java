package studies.FLX.Main.ObjectOrientedPrograming.Abstraction;

public class Main {
    public static void main(String[] args) {
        // Abstract = Used to define abstract classes and methods.
        // Abstraction is the processo of hiding implementation details
        // and showing only the essential features.
        // Abstract classes CAN'T be instatiated directly;
        // Can contain 'abstract' methods (which must be implemented)
        // Can contain 'concrete' methods (which are inherited)

        //we cant:
        // Shape shape = new Shape();
        // because shape is abstract, but:

        Circle circle = new Circle(3);
        Triangle triangle = new Triangle(4, 5);
        Rectangle rectangle = new Rectangle(6, 7);

        System.out.println(circle.area());
        System.out.println(triangle.area());
        System.out.println(rectangle.area());
    }
}
