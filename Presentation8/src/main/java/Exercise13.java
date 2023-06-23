import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Exercise13 {
    public static void main(String[] args) {
        // Infinite stream of integers
        Stream<Integer> infiniteNumbers = Stream.iterate(0, n -> n + 1);

        // Finite stream of strings
        List<String> strings = Arrays.asList("Apple", "Banana", "Cherry", "Apple", "Durian", "Banana", "Elderberry");

        // Filter()
        Stream<Integer> filteredNumbers = infiniteNumbers.filter(n -> n % 2 == 0);
        Stream<String> filteredStrings = strings.stream().filter(s -> s.length() > 5);

        // Distinct()
        Stream<Integer> distinctNumbers = filteredNumbers.distinct();
        Stream<String> distinctStrings = filteredStrings.distinct();

        // Limit()
        Stream<Integer> limitedNumbers = distinctNumbers.limit(5);
        Stream<String> limitedStrings = distinctStrings.limit(5);

        // Sorted() and skip()
        Stream<Integer> sortedNumbers = limitedNumbers.sorted();
        Stream<String> sortedStrings = limitedStrings.sorted().skip(2);

        // Print the elements using forEach
        sortedNumbers.forEach(System.out::println);
        sortedStrings.forEach(System.out::println);
    }
}
