public class Exercise3 {
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

    // Constructor
    public Car(String brand, String model, int year, double price) {
        this.brand = brand;
        this.model = model;
        this.year = year;
        this.price = price;
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
    }
}