import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class Exercise3 {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
        System.out.println("Original list: " + numbers);

        // Using a Consumer to double the integers
        Consumer<Integer> doubler = (Integer num) -> {
            int doubledValue = num * 2;
            System.out.println("Doubled value: " + doubledValue);
        };

        // Applying the Consumer to each element in the list
        numbers.forEach(doubler);
    }
}
