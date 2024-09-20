// package partA;

class Addnumber {
    // Method to add two integers
    int add(int num1, int num2) {
        return num1 + num2;
    }

    // Method to add two doubles
    double add(double num1, double num2) {
        return num1 + num2;
    }

    // Method to add three integers
    int add(int num1, int num2, int num3) {
        return num1 + num2 + num3;
    }
}

public class Program3 {
    public static void main(String[] args) {
        Addnumber adder = new Addnumber();

        // Adding two integers
        int sum1 = adder.add(5, 10);
        System.out.println("The sum1 value is: " + sum1);

        // Adding two doubles
        double sum2 = adder.add(3.3, 2.7);
        System.out.println("The sum2 value is: " + sum2);

        // Adding three integers
        int sum3 = adder.add(2, 4, 6);
        System.out.println("The sum3 value is: " + sum3);
    }
}
