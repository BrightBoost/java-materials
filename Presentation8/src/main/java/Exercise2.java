import java.util.Random;
import java.util.function.Supplier;

public class Exercise2 {
    public static void main(String[] args) {
        // Using a lambda expression
        Supplier<Integer> randomSupplier1 = () -> new Random().nextInt();
        printRandomValues(randomSupplier1, 5);

        // Using a method reference
        Supplier<Integer> randomSupplier2 = new Random()::nextInt;
        printRandomValues(randomSupplier2, 5);
    }

    public static void printRandomValues(Supplier<Integer> supplier, int count) {
        for (int i = 0; i < count; i++) {
            int value = supplier.get();
            System.out.println(value);
        }
    }
}
