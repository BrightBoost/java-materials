import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Exercise12 {
    public static void main(String[] args) {
        // Infinite stream of numbers
        Stream<Integer> infiniteNumbers = Stream.iterate(0, n -> n + 1);

        // Finite stream of strings
        List<String> strings = Arrays.asList("Apple", "Banana", "Cherry", "Durian", "Elderberry");

        // allMatch()
        boolean allMatchResult = strings.stream().allMatch(s -> s.length() >= 3 && s.charAt(2) == 'F');
        System.out.println("allMatch result: " + allMatchResult);

        // anyMatch()
        boolean anyMatchResult = infiniteNumbers.anyMatch(n -> n >= 77 && n <= 100);
        System.out.println("anyMatch result (numbers): " + anyMatchResult);

        anyMatchResult = strings.stream().anyMatch(s -> s.startsWith("T"));
        System.out.println("anyMatch result (strings): " + anyMatchResult);

        // noneMatch()
        boolean noneMatchResult = strings.stream().noneMatch(s -> s.length() > 25);
        System.out.println("noneMatch result (length > 25): " + noneMatchResult);

        noneMatchResult = infiniteNumbers.noneMatch(n -> n == 5);
        System.out.println("noneMatch result (number 5): " + noneMatchResult);

        // collect()
        StringBuilder stringBuilder = strings.stream().collect(StringBuilder::new, StringBuilder::append, StringBuilder::append);
        System.out.println("Collect result: " + stringBuilder.toString());

        int sumOfEvenNumbers = infiniteNumbers.filter(n -> n % 2 == 0).limit(10).mapToInt(Integer::intValue).sum();
        System.out.println("Sum of even numbers: " + sumOfEvenNumbers);

        // count()
        long count = strings.stream().count();
        System.out.println("Count: " + count);

        // findAny()
        Optional<String> findAnyResult = strings.stream().findAny();
        System.out.println("findAny result (strings): " + findAnyResult.orElse("No result"));

        findAnyResult = infiniteNumbers.map(String::valueOf).findAny();
        System.out.println("findAny result (numbers): " + findAnyResult.orElse("No result"));

        // findFirst()
        Optional<String> findFirstResult = strings.stream().findFirst();
        System.out.println("findFirst result: " + findFirstResult.orElse("No result"));

        // forEach()
        strings.stream().forEach(System.out::println);

        infiniteNumbers.limit(10).forEach(System.out::println);

        // min()
        Optional<String> minResult = strings.stream().min(String::compareToIgnoreCase);
        System.out.println("Min result: " + minResult.orElse("No result"));

        // max()
        Optional<String> maxResult = strings.stream().max(String::compareToIgnoreCase);
        System.out.println("Max result: " + maxResult.orElse("No result"));

        // reduce()
        String reducedString = strings.stream().map(s -> String.valueOf(s.charAt(0))).reduce("", String::concat);
        System.out.println("Reduced string: " + reducedString);
    }
}
