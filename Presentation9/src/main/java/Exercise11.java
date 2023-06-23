import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Exercise11 {
    public static void main(String[] args) {
        // Stream of cats
        List<String> cats = Arrays.asList("Tom", "Jerry", "Simba", "Garfield", "Tom", "Garfield");

        List<String> filteredCats = cats.parallelStream()
                .filter(cat -> !cat.equals("Garfield")) // Remove cats with long hair
                .distinct() // Remove duplicates
                .sorted((cat1, cat2) -> cat2.compareTo(cat1)) // Sort in reverse alphabetical order
                .collect(Collectors.toList());

        System.out.println("Filtered Cats: " + filteredCats);

        // Stream of sequential odd numbers
        List<Integer> oddNumbers = java.util.stream.Stream.iterate(1, n -> n + 2)
                .limit(100) // Limit to 100 numbers
                .filter(Exercise11::isPrime) // Remove non-prime numbers
                .filter(n -> n <= 100) // Remove numbers above 100
                .collect(Collectors.toList());

        System.out.println("Prime Odd Numbers: " + oddNumbers);
        System.out.println("Count of Prime Numbers: " + oddNumbers.size());
    }

    private static boolean isPrime(int number) {
        if (number <= 1) {
            return false;
        }

        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }
}
