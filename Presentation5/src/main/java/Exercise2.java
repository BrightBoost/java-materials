public class Exercise2 {
    public static void main(String[] args) {
        Car myCar = new Car("Toyota", "Camry");
        myCar.start(); // Calling the start() method without parameters
        myCar.start(0.7); // Calling the start() method with success percentage parameter
    }

}

class Car {
    private String make;
    private String model;

    public Car(String make, String model) {
        this.make = make;
        this.model = model;
    }

    public void start() {
        // Common code for starting the car
        System.out.println("Car started normally");
    }

    public void start(double successPercentage) {
        if (successPercentage >= 0.8) {
            start(); // Calling the start() method without parameters
        } else {
            System.out.println("Car failed to start");
        }
    }
}