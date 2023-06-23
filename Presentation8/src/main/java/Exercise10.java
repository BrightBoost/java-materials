import java.util.Optional;

public class Exercise10 {
    public static void main(String[] args) {
        int hp = 200; // Replace with actual value
        String fuel = "Gasoline"; // Replace with actual value
        String etc = "Some other property"; // Replace with actual value

        Optional<Car> optionalCar = Optional.ofNullable(new Car("MaaikesCar", new Engine(hp, fuel, etc)));
        optionalCar.ifPresent(c -> {
            System.out.println(c);
            Engine e = c.getEngine();
            // Do something with the engine
        });
    }

}

class Car {
    private String name;
    private Engine engine;

    public Car(String name, Engine engine) {
        this.name = name;
        this.engine = engine;
    }

    public Engine getEngine() {
        return engine;
    }

    @Override
    public String toString() {
        return "Car [name=" + name + "]";
    }
}

class Engine {
    private int horsepower;
    private String fuelType;
    private String otherProperty;

    public Engine(int horsepower, String fuelType, String otherProperty) {
        this.horsepower = horsepower;
        this.fuelType = fuelType;
        this.otherProperty = otherProperty;
    }

    // Getter methods and other functionality
}