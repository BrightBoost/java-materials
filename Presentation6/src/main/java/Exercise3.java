public class Exercise3 {
    public static void main(String[] args) {
        Vehicle vehicle = new Vehicle("Ford", "Mustang", 2021);
        Car car = new Car("Toyota", "Camry", 2020);
        Bike bike = new Bike("Giant", "Talon", 2022);

        vehicle.drive();
        car.drive();
        bike.drive();
    }

}

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

    public void drive() {
        System.out.println("Driving the vehicle");
    }
}

class Car extends Vehicle {
    public Car(String brand, String model, int year) {
        super(brand, model, year);
    }

    @Override
    public void drive() {
        System.out.println("Driving the car");
    }
}

class Bike extends Vehicle {
    public Bike(String brand, String model, int year) {
        super(brand, model, year);
    }

    @Override
    public void drive() {
        System.out.println("Riding the bike");
    }
}