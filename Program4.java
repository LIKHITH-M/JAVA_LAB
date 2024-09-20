
public class Program4 {
    public static void main(String[] args) {
        int intValue = 257;

        // Explicit casting from int to byte
        byte narrowedByteValue = (byte) intValue;

        // Implicit casting from int to double
        double widenedByteValue = intValue;

        System.out.println("Original Int Value: " + intValue);
        System.out.println("Narrowed Byte Value (Explicit Casting): " + narrowedByteValue);
        System.out.println("Widened Byte Value (Implicit Casting): " + widenedByteValue);
    }
}
