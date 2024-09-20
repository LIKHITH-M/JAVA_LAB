

import java.util.Arrays;

public class Program5 {
    public static void main(String[] args) {
        String[] stringArray = {"Apple", "Orange", "Banana", "Grape", "Pineapple"};

        Arrays.sort(stringArray);
        System.out.println("Sorted String Array:");
        for (String fruit : stringArray) {
            System.out.println(fruit);
        }
    }
}
