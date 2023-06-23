public class Exercise1 {
    private String brand;
    private String model;
    private int year;
    private double price;

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
        if (price >= 0) {
            this.price = price;
        } else {
            System.out.println("Price cannot be negative.");
        }
    }

    public static void main(String[] args) {
        Exercise1 car = new Exercise1();
        car.setBrand("Toyota");
        car.setModel("Camry");
        car.setYear(2021);
        car.setPrice(25000.0);

        System.out.println("Car details:");
        System.out.println("Brand: " + car.getBrand());
        System.out.println("Model: " + car.getModel());
        System.out.println("Year: " + car.getYear());
        System.out.println("Price: $" + car.getPrice());
    }
}
