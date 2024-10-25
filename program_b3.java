// Write a program that demonstrates handling of exceptions in inheritance.
// Create a base class called “Father” and derived class called “Son” which
// extends the base class. In Father class, implement a constructor which takes
// the age and throws the exception Wrong Age () i.e when the input age is
// equal to father’s age.

import java.util.Scanner;

// Father class to represent the father's age
class Father {
    int Fage; // Stores father's age
    Scanner input = new Scanner(System.in); // Scanner to get input from the user

    // Constructor for Father class
    Father() {
        System.out.println("Enter father's age:");
        Fage = input.nextInt(); // Reads father's age from the user
    }
}

// Son class that extends Father, representing the son's age
class Son extends Father {
    int Sage; // Stores son's age
    Scanner input = new Scanner(System.in); // Scanner to get input from the user

    // Constructor for Son class
    Son() {
        // super(); // Uncomment if explicitly calling Father constructor, though Java does this automatically
        System.out.println("Enter son's age:");
        Sage = input.nextInt(); // Reads son's age from the user
    }
}

// Custom exception class to handle incorrect age inputs
class WrongAgeException extends Exception {
    // Constructor that accepts an error message and displays it
    public WrongAgeException(String str) {
        super(str); // Calls the parent Exception constructor
        System.out.println(str); // Prints the error message
    }
}

// Main class to test Father, Son, and WrongAgeException
public class program_b3 {
    public static void main(String[] args) throws WrongAgeException {
        Son s = new Son(); // Create a Son object, which also initializes Father

        // Try-catch block to check and handle the age validation
        try {
            // Condition to check if son's age is greater than or equal to father's age
            if (s.Sage >= s.Fage)
                throw new WrongAgeException("Exception: Son's age cannot be greater than or equal to Father's age");
            else
                System.out.println("You have entered a Valid Age"); // Message if the age is valid
        } 
        catch (WrongAgeException e) {
            System.out.println(e + " SON'S AGE >= FATHER'S AGE"); // Error message if exception is thrown
        }
    }
}
