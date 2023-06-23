public class Exercise2 {
    public static void main(String[] args) {
        // Example 1: Entrance Fee
        int age = 2;
        if (age < 3) {
            System.out.println("Entrance is free.");
        } else {
            System.out.println("Entrance fee is 10 euros.");
        }

        // Example 2: Traffic Light
        String trafficLight = "red";
        if (trafficLight.equals("red")) {
            System.out.println("You must stop.");
        } else if (trafficLight.equals("green")) {
            System.out.println("You can go.");
        } else {
            System.out.println("Invalid traffic light color.");
        }
    }
}
