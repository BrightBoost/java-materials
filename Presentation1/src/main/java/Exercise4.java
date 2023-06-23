public class Exercise4 {
    public static void main(String[] args) {
        // Create and use car objects here
    }

}

class Car {
    // Properties
    private String brand;
    private String model;
    private int year;
    private double price;
    private String color; // New field: color of the car
    private int mileage; // New field: current mileage of the car

    // Constructor
    public Car(String brand, String model, int year, double price, String color, int mileage) {
        this.brand = brand;
        this.model = model;
        this.year = year;
        this.price = price;
        this.color = color;
        this.mileage = mileage;
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

    // Methods
    public void start() {
        System.out.println("The car is starting.");
    }

    public void accelerate() {
        System.out.println("The car is accelerating.");
    }

    public void brake() {
        System.out.println("The car is braking.");
    }

    public void displayInfo() {
        System.out.println("Brand: " + brand);
        System.out.println("Model: " + model);
        System.out.println("Year: " + year);
        System.out.println("Price: $" + price);
        System.out.println("Color: " + color);
        System.out.println("Mileage: " + mileage);
    }
}