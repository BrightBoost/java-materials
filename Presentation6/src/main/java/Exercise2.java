class Vehicle {
    private String brand;
    private String model;
    private int year;

    public Vehicle(String brand, String model, int year) {
        this.brand = brand;
        this.model = model;
        this.year = year;
    }

    // Getters and setters for brand, model, and year

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

    // Additional methods
    public void startEngine() {
        System.out.println("Engine started");
    }

    public void stopEngine() {
        System.out.println("Engine stopped");
    }
}

class Bike extends Vehicle {
    private int numberOfGears;

    public Bike(String brand, String model, int year, int numberOfGears) {
        super(brand, model, year);
        this.numberOfGears = numberOfGears;
    }

    // Getter and setter for numberOfGears

    public int getNumberOfGears() {
        return numberOfGears;
    }

    public void setNumberOfGears(int numberOfGears) {
        this.numberOfGears = numberOfGears;
    }

    // Additional methods specific to Bike
    public void pedal() {
        System.out.println("Pedaling the bike");
    }
}

public class Exercise2 {
    public static void main(String[] args) {
        Vehicle vehicle = new Vehicle("Ford", "Mustang", 2021);
        Bike bike = new Bike("Giant", "Talon", 2022, 10);

        // Set fields of Vehicle
        vehicle.setBrand("Toyota");
        vehicle.setModel("Camry");
        vehicle.setYear(2020);

        // Set fields of Bike
        bike.setBrand("Trek");
        bike.setModel("Fuel EX");
        bike.setYear(2023);
        bike.setNumberOfGears(12);

        // Invoke methods of Vehicle and Bike
        vehicle.startEngine();
        vehicle.stopEngine();

        bike.startEngine();
        bike.stopEngine();
        bike.pedal();
    }
}
