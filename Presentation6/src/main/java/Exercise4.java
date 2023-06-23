public class Exercise4 {
    public static void main(String[] args) {
        Car car = new Car("Toyota", "Camry", 2020, "Red");
        Bike bike = new Bike("Giant", "Talon", 2022, 26);

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

    public void drive() {
        System.out.println("Driving the vehicle");
    }
}

class Car extends Vehicle {
    private String color;

    public Car(String brand, String model, int year, String color) {
        super(brand, model, year);
        this.color = color;
    }

    @Override
    public void drive() {
        System.out.println("Driving the car");
    }
}

class Bike extends Vehicle {
    private int wheelSize;

    public Bike(String brand, String model, int year, int wheelSize) {
        super(brand, model, year);
        this.wheelSize = wheelSize;
    }

    @Override
    public void drive() {
        System.out.println("Riding the bike");
    }
}