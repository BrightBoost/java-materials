interface ElectricalVehicle {
    void charge();
}

class CityBike implements ElectricalVehicle {
    @Override
    public void charge() {
        System.out.println("Charging CityBike...");
    }
}

class MountainBike implements ElectricalVehicle {
    @Override
    public void charge() {
        System.out.println("Charging MountainBike...");
    }
}

class MiniVan implements ElectricalVehicle {
    @Override
    public void charge() {
        System.out.println("Charging MiniVan...");
    }
}

class Cabrio implements ElectricalVehicle {
    @Override
    public void charge() {
        System.out.println("Charging Cabrio...");
    }
}

public class Exercise6 {
    public static void main(String[] args) {
        ElectricalVehicle vehicle1 = new CityBike();
        ElectricalVehicle vehicle2 = new MountainBike();
        ElectricalVehicle vehicle3 = new MiniVan();
        ElectricalVehicle vehicle4 = new Cabrio();

        vehicle1.charge();
        vehicle2.charge();
        vehicle3.charge();
        vehicle4.charge();
    }
}
