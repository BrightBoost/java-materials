public class Exercise7 {

    public static void main(String[] args) {
        Exercise7 exercise7 = new Exercise7();
        exercise7.run();
    }

    public void run() {
        Car regularCar = new Car();
        regularCar.drive();

        Car electricCar = new ElectricCar();
        electricCar.drive();
        ((ElectricalVehicle) electricCar).charge();

        CityBike regularBike = new CityBike();
        regularBike.ride();

        CityBike electricBike = new ElectricCityBike();
        electricBike.ride();
        ((ElectricalVehicle) electricBike).charge();
    }
}

interface ElectricalVehicle {
    void charge();
}

class Car {
    public void drive() {
        System.out.println("Car driving");
    }
}

class CityBike {
    public void ride() {
        System.out.println("CityBike riding");
    }
}

class ElectricCar extends Car implements ElectricalVehicle {
    @Override
    public void charge() {
        System.out.println("ElectricCar charging");
    }
}

class ElectricCityBike extends CityBike implements ElectricalVehicle {
    @Override
    public void charge() {
        System.out.println("ElectricCityBike charging");
    }
}
