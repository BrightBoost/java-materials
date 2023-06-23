import java.util.HashMap;
import java.util.Map;

public class Exercise6 {
    public static void main(String[] args) {
        // Create a new map to store first names and favorite art form
        Map<String, String> favorites = new HashMap<>();

        // Use merge to decide which art form has alphabetically earlier position
        favorites.merge("John", "Painting", (oldValue, newValue) -> oldValue.compareTo(newValue) < 0 ? oldValue : newValue);
        favorites.merge("Mary", "Sculpture", (oldValue, newValue) -> oldValue.compareTo(newValue) < 0 ? oldValue : newValue);
        favorites.merge("Sarah", "Drawing", (oldValue, newValue) -> oldValue.compareTo(newValue) < 0 ? oldValue : newValue);

        // Use ComputeIfPresent to add ice skating as default for names starting with an M or S or J
        favorites.computeIfPresent("Mary", (key, value) -> value + ", Ice Skating");
        favorites.computeIfPresent("Sarah", (key, value) -> value + ", Ice Skating");
        favorites.computeIfPresent("John", (key, value) -> value + ", Ice Skating");

        // Use ComputeIfAbsent to add a new pair
        favorites.computeIfAbsent("Michael", key -> "Photography");

        // Use ComputeIfAbsent on an existing pair
        favorites.computeIfAbsent("Mary", key -> "Pottery");

        // Print the updated map
        System.out.println(favorites);
    }
}
