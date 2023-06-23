import java.util.function.UnaryOperator;
import java.util.function.Predicate;
import java.util.function.Consumer;
import java.util.function.Supplier;

public class Exercise8 {
    public static void main(String[] args) {
        // Takes an Integer and returns an Integer
        UnaryOperator<Integer> incrementByTwo = n -> n + 2;
        System.out.println(incrementByTwo.apply(5)); // Output: 7

        // Returns a boolean and takes a String
        Predicate<String> startsWithA = s -> s.startsWith("A");
        System.out.println(startsWithA.test("Apple")); // Output: true

        // Return an Animal object without taking any input
        Supplier<Animal> createAnimal = Animal::new;
        Animal animal = createAnimal.get();
        System.out.println(animal); // Output: Animal@<hashCode>

        // Print the Animal name and return nothing
        Consumer<Animal> printAnimalName = a -> System.out.println(a.getName());
        printAnimalName.accept(animal); // Output: <animal name>
    }

    
}
class Animal {
        private String name;

        public Animal() {
            this.name = "Unknown";
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }
    }