// 2. Write a Java program to create a class box with instance variable width,
// height, depth and create an object using default constructors and
// parameterized constructors.
// package partA;
// package partA;

class Box {
    double width, height, depth;

    // Default constructor
    Box() {
        width = 1.0;
        height = 2.0;
        depth = 1.0;
    }

    // Parameterized constructor
    Box(double width, double height, double depth) {
        this.width = width;
        this.height = height;
        this.depth = depth;
    }

    // Method to calculate the volume
    double Volume() {
        return width * height * depth;
    }
}

public class program2 {
    public static void main(String[] args) {
        // Create an object using the default constructor
        Box box1 = new Box();
        System.out.println("Box 1 : Default Constructor");
        System.out.print("Width: " + box1.width);
        System.out.print(", Height: " + box1.height);
        System.out.println(", Depth: " + box1.depth);
        System.out.println("The Volume is: " + box1.Volume());
        System.out.println("----------------------------------------------------------------");

        // Create an object using the parameterized constructor
        Box box2 = new Box(2.5, 3.0, 4.0);
        System.out.println("Box 2 : Parameterized Constructor");
        System.out.print("Width: " + box2.width);
        System.out.print(", Height: " + box2.height);
        System.out.println(", Depth: " + box2.depth);
        System.out.println("The Volume is: " + box2.Volume());
    }
}
