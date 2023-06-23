public class Exercise3 {
    public static void main(String[] args) {
        // Example 1: Entrance Fee
        int age = 20;
        double entranceFee;

        if (age < 3) {
            entranceFee = 0.0;
        } else if (age >= 3 && age <= 12) {
            entranceFee = 5.0;
        } else if (age > 12 && age < 65) {
            entranceFee = 10.0;
        } else {
            entranceFee = 7.50;
        }

        System.out.println("Entrance fee: " + entranceFee + " euros");

        // Example 2: Traffic Light
        int distance = 50;
        String trafficLightColor = "red";
        String action;

        if (distance < 10) {
            action = "Slow down and prepare to stop";
        } else if (distance >= 10 && distance < 30) {
            action = "Pay attention and be ready to stop";
        } else {
            if (trafficLightColor.equals("red")) {
                action = "Stop";
            } else if (trafficLightColor.equals("green")) {
                action = "Proceed with caution";
            } else if (trafficLightColor.equals("yellow")) {
                action = "Prepare to stop";
            } else {
                action = "Invalid traffic light color";
            }
        }

        System.out.println("Action: " + action);
    }
}
