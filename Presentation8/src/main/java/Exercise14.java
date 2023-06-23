import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Exercise14 {
    public static void main(String[] args) {
        // Stream with lists of lists
        List<List<Integer>> listOfLists = Arrays.asList(
                Arrays.asList(1, 2, 3),
                Arrays.asList(4, 5, 6),
                Arrays.asList(7, 8, 9)
        );

        // Stream with strings
        List<String> strings = Arrays.asList("Hello", "World", "Stream");

        // Map()
        Stream<String> reversedStrings = strings.stream().map(s -> new StringBuilder(s).reverse().toString());

        // FlatMap()
        Stream<Integer> flatMapStream = listOfLists.stream().flatMap(List::stream);

        // Peek()
        long count = flatMapStream.peek(System.out::println).count();

        System.out.println("Total count: " + count);
    }
}
