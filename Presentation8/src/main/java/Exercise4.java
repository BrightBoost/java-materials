import java.util.function.BiPredicate;

class Animal {
    private String name;
    private String color;

    public Animal(String name, String color) {
        this.name = name;
        this.color = color;
    }

    public String getName() {
        return name;
    }

    public String getColor() {
        return color;
    }
}

public class Exercise4 {
    public static void main(String[] args) {
        Animal animal1 = new Animal("Cat", "Gray");
        Animal animal2 = new Animal("Dog", "Brown");
        Animal animal3 = new Animal("Cat", "Black");

        // BiPredicate to check if two animals have the same name
        BiPredicate<Animal, Animal> sameNamePredicate = (animalA, animalB) ->
                animalA.getName().equals(animalB.getName());

        // BiPredicate to check if two animals have the same color
        BiPredicate<Animal, Animal> sameColorPredicate = (animalA, animalB) ->
                animalA.getColor().equals(animalB.getColor());

        // BiPredicate combining sameNamePredicate and sameColorPredicate
        BiPredicate<Animal, Animal> sameNameAndColorPredicate = sameNamePredicate.and(sameColorPredicate);

        // BiPredicate to check if two animals have the same name but different color
        BiPredicate<Animal, Animal> sameNameDifferentColorPredicate = sameNamePredicate.and(sameColorPredicate.negate());

        // Testing the predicates
        System.out.println("Same Name Test:");
        System.out.println("animal1 and animal2 have the same name: " + sameNamePredicate.test(animal1, animal2));
        System.out.println("animal1 and animal3 have the same name: " + sameNamePredicate.test(animal1, animal3));

        System.out.println("\nSame Color Test:");
        System.out.println("animal1 and animal2 have the same color: " + sameColorPredicate.test(animal1, animal2));
        System.out.println("animal1 and animal3 have the same color: " + sameColorPredicate.test(animal1, animal3));

        System.out.println("\nSame Name and Color Test:");
        System.out.println("animal1 and animal2 have the same name and color: " + sameNameAndColorPredicate.test(animal1, animal2));
        System.out.println("animal1 and animal3 have the same name and color: " + sameNameAndColorPredicate.test(animal1, animal3));

        System.out.println("\nSame Name, Different Color Test:");
        System.out.println("animal1 and animal2 have the same name but different color: " + sameNameDifferentColorPredicate.test(animal1, animal2));
        System.out.println("animal1 and animal3 have the same name but different color: " + sameNameDifferentColorPredicate.test(animal1, animal3));
    }
}
