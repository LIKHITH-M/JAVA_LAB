// 1. Develop a Java program to create an interface named Shape that contains a
// method named printArea(). Provide three classes named Rectangle,
// Triangle and Circle such that each one of the classes extends the interface
// Shape. Each one of the classes contains only the method printArea() that
// prints the area of the given shape.

package partB;

// Define an interface Shape with a method to print the area
interface Shape {
    void printArea();  // Abstract method to print area, must be implemented by all shapes
}

// Rectangle class implementing Shape interface
class Rectangle implements Shape {
    private double length; // Length of the rectangle
    private double width;  // Width of the rectangle

    // Constructor to initialize length and width
    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    // Method to calculate and print the area of the rectangle
    public void printArea() {
        double area = length * width;  // Calculate area of rectangle
        System.out.println("Area of Rectangle: " + area);  // Print area
    }
}

// Triangle class implementing Shape interface
class Triangle implements Shape {
    private double base;   // Base of the triangle
    private double height; // Height of the triangle

    // Constructor to initialize base and height
    public Triangle(double base, double height) {
        this.base = base;
        this.height = height;
    }

    // Method to calculate and print the area of the triangle
    public void printArea() {
        double area = 0.5 * base * height;  // Calculate area of triangle
        System.out.println("Area of Triangle: " + area);  // Print area
    }
}

// Circle class implementing Shape interface
class Circle implements Shape {
    private double radius; // Radius of the circle

    // Constructor to initialize radius
    public Circle(double radius) {
        this.radius = radius;
    }

    // Method to calculate and print the area of the circle
    public void printArea() {
        double area = Math.PI * radius * radius;  // Calculate area of circle
        System.out.println("Area of Circle: " + area);  // Print area
    }
}

// Main class to test the shapes
public class program_b1 {
    public static void main(String[] args) {
        // Create instances of each shape with specific dimensions
        Rectangle rectangle = new Rectangle(5, 10); // Rectangle with length 5 and width 10
        Triangle triangle = new Triangle(6, 8);     // Triangle with base 6 and height 8
        Circle circle = new Circle(4);              // Circle with radius 4

        // Calculate and print area of each shape
        rectangle.printArea(); // Calls printArea() of Rectangle
        triangle.printArea();  // Calls printArea() of Triangle
        circle.printArea();    // Calls printArea() of Circle
    }
}
