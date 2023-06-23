import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Exercise15 {
    public static void main(String[] args) {
        // Stream from a list of cats
        List<Cat> cats = Arrays.asList(
                new Cat("Whiskers", "Long"),
                new Cat("Mittens", "Short"),
                new Cat("Oreo", "Short"),
                new Cat("Simba", "Long"),
                new Cat("Luna", "Short"));

        // Remove cats with long hair
        Stream<Cat> filteredStream = cats.stream()
                .filter(cat -> cat.getHairType().equals("Short"));

        // Remove duplicates
        Stream<Cat> distinctStream = filteredStream.distinct();

        // Sort cats in reversed alphabetical order of first name
        List<Cat> sortedCats = distinctStream
                .sorted((cat1, cat2) -> cat2.getFirstName().compareTo(cat1.getFirstName()))
                .collect(Collectors.toList());

        System.out.println(sortedCats);

        // Bonus: Stream of sequential odd numbers
        Stream<Integer> oddNumbersStream = Stream.iterate(1, n -> n + 2)
                .limit(100);

        // Remove non-prime numbers
        Stream<Integer> primeNumbersStream = oddNumbersStream.filter(Exercise15::isPrime);

        // Remove numbers above 100
        Stream<Integer> filteredPrimeNumbersStream = primeNumbersStream.filter(n -> n <= 100);

        // Count prime numbers under 100
        long count = filteredPrimeNumbersStream.count();

        System.out.println("Count of prime numbers under 100: " + count);
    }

    private static boolean isPrime(int number) {
        if (number < 2) {
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

class Cat {
    private String firstName;
    private String hairType;

    public Cat(String firstName, String hairType) {
        this.firstName = firstName;
        this.hairType = hairType;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getHairType() {
        return hairType;
    }

    @Override
    public String toString() {
        return "Cat{" +
                "firstName='" + firstName + '\'' +
                ", hairType='" + hairType + '\'' +
                '}';
    }
}