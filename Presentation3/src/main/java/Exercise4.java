public class Exercise4 {
    public static void main(String[] args) {
        String trafficLightColor = "green";
        String action;

        switch (trafficLightColor) {
            case "red":
                action = "Stop";
                break;
            case "green":
                action = "Proceed with caution";
                break;
            case "yellow":
                action = "Prepare to stop";
                break;
            default:
                action = "Invalid traffic light color";
                break;
        }

        System.out.println("Action: " + action);
    }
}
