import java.util.Random;

public class Exercise6 {
    public static void main(String[] args) {
        Car myCar = new Car("Toyota", "Camry", 2022, 25000.0, "Red", 5000, 120);

        boolean carStarted = myCar.start();
        if (carStarted) {
            myCar.increaseSpeed(50);
        }
    }

}

// In this code, the Car class, its fields, and methods have been modified to
// adhere to the Java naming conventions:
// Class name: The class name Car follows the convention of using PascalCase,
// starting with an uppercase letter.
// Field names: All field names (brand, model, year, etc.) follow the convention
// of using camelCase, starting with a lowercase letter.
// Getter and setter methods: The names of the getter and setter methods for
// each property (getBrand(), setBrand(String brand), etc.) follow the
// convention of using camelCase, starting with "get" or "set" followed by the
// capitalized property name.

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
    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getMileage() {
        return mileage;
    }

    public void setMileage(int mileage) {
        this.mileage = mileage;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

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