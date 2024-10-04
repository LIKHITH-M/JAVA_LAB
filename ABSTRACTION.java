// Interface declaration
interface Shape {
    void printArea();
}

// Rectangle class implementing the Shape interface
class Rectangle implements Shape {
    private double length;
    private double width;

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    public void printArea() {
        double area = length * width;
        System.out.println("Area of Rectangle: " + area);
    }
}

// Triangle class implementing the Shape interface
class Triangle implements Shape {
    private double base;
    private double height;

    public Triangle(double base, double height) {
        this.base = base;
        this.height = height;
    }

    public void printArea() {
        double area = 0.5 * base * height;
        System.out.println("Area of Triangle: " + area);
    }
}

// Circle class implementing the Shape interface
class Circle implements Shape {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public void printArea() {
        double area = Math.PI * radius * radius;
        System.out.println("Area of Circle: " + area);
    }
}

// Main class
public class ABSTRACTION {
    public static void main(String[] args) {
        // Creating objects for each shape
        Rectangle rectangle = new Rectangle(5, 10);
        Triangle triangle = new Triangle(6, 8);
        Circle circle = new Circle(4);

        // Calling the printArea method for each shape
        rectangle.printArea();  // Area of Rectangle: 50.0
        triangle.printArea();   // Area of Triangle: 24.0
        circle.printArea();     // Area of Circle: 50.265482
    }}