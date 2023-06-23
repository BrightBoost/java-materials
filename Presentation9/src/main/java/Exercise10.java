import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Exercise10 {
    public static void main(String[] args) {
        // Create an infinite stream of numbers
        Stream<Integer> infiniteStream = Stream.iterate(1, i -> i + 1);

        // Create a finite stream of Strings
        List<String> finiteStream = List.of("Apple", "Banana", "Cherry", "Date", "Elderberry");

        // allMatch()
        boolean allMatchResult = finiteStream.stream()
                .allMatch(s -> s.length() >= 3 && (Character.toUpperCase(s.charAt(2)) == 'F' || isNumeric(s) && Integer.parseInt(s) > 6));
        System.out.println("allMatch() Result: " + allMatchResult);

        // Rest of the code...
    }

    private static boolean isNumeric(String str) {
        try {
            Integer.parseInt(str);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }
}
