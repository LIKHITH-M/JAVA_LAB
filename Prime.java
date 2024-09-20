import java.util.Scanner;

public class Prime {

    public static void main(String[] args) {
        // Create a Scanner object for input
        Scanner obj = new Scanner(System.in);

        // Prompt the user for an integer N
        System.out.print("Enter an integer N: ");
        int N = obj.nextInt();

        // Print prime numbers up to N
        System.out.print("Prime numbers up to " + N + " are: ");

        // Iterate over each number from 2 to N
        for (int i = 2; i <= N; i++) {
            boolean isPrime = true;  // Assume the number is prime

            // Check if the number is divisible by any number other than 1 and itself
            for (int j = 2; j <= Math.sqrt(i); j++) {  // Optimization by checking up to sqrt(i)
            	// there is no factor for non prime numberes greater than sqrt(i).
                if (i % j == 0) {
                    isPrime = false;  // If divisible, it's not prime
                    break;
                }
            }

            // If the number is prime, print it
            if (isPrime) {
                System.out.print(i + "\t");
            }
        }

        // Close the scanner
        obj.close();
    }
}
