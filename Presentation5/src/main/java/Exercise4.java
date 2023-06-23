public class Exercise4 {
    public static void main(String[] args) {
        Car car1 = new Car("Toyota", "Camry", 2021); // Using constructor with make, model, and year
        Car car2 = new Car("Honda", "Civic"); // Using constructor with make and model

        System.out.println(car1); // Output: Make: Toyota, Model: Camry, Year: 2021
        System.out.println(car2); // Output: Make: Honda, Model: Civic, Year: 0 (default value)
    }
}

class Car {
    private String make;
    private String model;
    private int year;

    public Car(String make, String model, int year) {
        this.make = make;
        this.model = model;
        this.year = year;
    }

    public Car(String make, String model) {
        this(make, model, 0); // Invoking the other constructor with a default value for year
    }

    // Other methods and code...

    @Override
    public String toString() {
        return "Make: " + make + ", Model: " + model + ", Year: " + year;
    }
}
