import java.util.Random;

public class Exercise5 {
    public static void main(String[] args) {
        Car myCar = new Car("Toyota", "Camry", 2022, 25000.0, "Red", 5000, 120);

        boolean carStarted = myCar.start();
        if (carStarted) {
            myCar.increaseSpeed(50);
        }
    }

}

class Car {
    // Properties
    private String brand;
    private String model;
    private int year;
    private double price;
    private String color;
    private int mileage;
    private int speed;
    private int maxSpeed;

    // Constructor
    public Car(String brand, String model, int year, double price, String color, int mileage, int maxSpeed) {
        this.brand = brand;
        this.model = model;
        this.year = year;
        this.price = price;
        this.color = color;
        this.mileage = mileage;
        this.speed = 0;
        this.maxSpeed = maxSpeed;
    }

    // Getters and setters for properties
    // ...

    // Methods
    public boolean start() {
        Random random = new Random();
        int randomNumber = random.nextInt(10);

        if (randomNumber < 7) {
            System.out.println("The car has started successfully.");
            return true;
        } else {
            System.out.println("Failed to start the car.");
            return false;
        }
    }

    public void increaseSpeed(int amount) {
        if (speed + amount <= maxSpeed) {
            speed += amount;
            System.out.println("Increased speed by " + amount + " mph. Current speed: " + speed + " mph");
        } else {
            System.out.println("Cannot increase speed beyond the maximum speed of the car.");
        }
    }

    // Other methods
    // ...
}