// Write a program that sorts an array of strings using compareTo() to
// determine bubble sort ordering.



public class Program5 {
    public static void main(String[] args) {
        // Initialize an array of strings
        String[] stringArray = {"Apple", "Orange", "Banana", "Grape", "Pineapple"};

        // Get the length of the array
        int n = stringArray.length;

        // Outer loop for number of passes
        for (int i = 0; i < n - 1; i++) {
            // Inner loop for comparing adjacent elements
            for (int j = 0; j < n - i - 1; j++) {
                // Compare two adjacent strings and swap if they are in the wrong order
                if (stringArray[j].compareTo(stringArray[j + 1]) > 0) {
                    String temp = stringArray[j]; // Store the current string in a temporary variable
                    stringArray[j] = stringArray[j + 1]; // Swap the strings
                    stringArray[j + 1] = temp; // Assign the temp string to the next position
                }
            }
        }

        // Print the sorted string array
        System.out.println("Sorted String Array:");
        for (String element : stringArray) {
            System.out.println(element); // Output each sorted string
        }
    }
}
