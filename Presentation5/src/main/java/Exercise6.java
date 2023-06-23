package restaurant;

abstract class Vehicle {
    public abstract void start();

    public abstract void stop();
}

class Car extends Vehicle {
    @Override
    public void start() {
        System.out.println("Car started");
    }

    @Override
    public void stop() {
        System.out.println("Car stopped");
    }
}

public class Exercise6 {
    public static void main(String[] args) {
        Car car = new Car();
        car.start();
        car.stop();
    }
}
