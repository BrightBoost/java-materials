import java.util.Optional;

public class Exercise9 {
    public static void main(String[] args) {
        String name = "John Doe";
        Optional<String> optionalName = createOptionalName(name);
        optionalName.ifPresentOrElse(
                n -> System.out.println("Name: " + n),
                () -> System.out.println("No name provided")
        );

        String defaultValue = "Default Name";
        String extractedName = optionalName.orElseGet(() -> defaultValue);
        System.out.println("Extracted Name: " + extractedName);
    }

    public static Optional<String> createOptionalName(String name) {
        if (name.isEmpty()) {
            return Optional.empty();
        } else {
            return Optional.of(name);
        }
    }
}
