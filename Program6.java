
public class Program6 {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5};
        int sum = 0;

        for (int number : numbers) { // For-each loop
            sum += number;
        }
        
        System.out.println("Sum of the elements in the array: " + sum);
    }
}
