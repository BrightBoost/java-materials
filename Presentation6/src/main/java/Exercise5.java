public class Exercise5 {
    public static void main(String[] args) {
        Car car = new Car();
        SportCar sportCar = new SportCar();

        car.sayVroom(); // Output: "car vrooming"
        sportCar.sayVroom(); // Output: "sportcar vrooming"

        // Reference type Vehicle
        Vehicle vehicleCar = new Car();
        Vehicle vehicleSportCar = new SportCar();

        vehicleCar.sayVroom(); // Output: "car vrooming"
        vehicleSportCar.sayVroom(); // Output: "sportcar vrooming"
    }

}

class Vehicle {
    public void sayVroom() {
        System.out.println("vehicle vrooming");
    }
}

class Car extends Vehicle {
    public void sayVroom() {
        System.out.println("car vrooming");
    }
}

class SportCar extends Car {
    public void sayVroom() {
        System.out.println("sportcar vrooming");
    }
}