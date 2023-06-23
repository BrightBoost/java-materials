public class Exercise6 {
    public static void main(String[] args) {
        int age = 20;
        double entranceFee;

        AgeGroup ageGroup = getAgeGroup(age);
        switch (ageGroup) {
            case INFANT:
                entranceFee = 0.0;
                break;
            case CHILD:
                entranceFee = 5.0;
                break;
            case ADULT:
                entranceFee = 10.0;
                break;
            case SENIOR:
                entranceFee = 7.50;
                break;
            default:
                entranceFee = 0.0; // Default value, can be set as per the requirement
                break;
        }

        System.out.println("Entrance fee: " + entranceFee + " euros");

        TrafficLightOption trafficLightColor = TrafficLightOption.GREEN;
        String action;

        switch (trafficLightColor) {
            case RED:
                action = "Stop";
                break;
            case GREEN:
                action = "Proceed with caution";
                break;
            case YELLOW:
                action = "Prepare to stop";
                break;
            default:
                action = "Invalid traffic light color";
                break;
        }

        System.out.println("Action: " + action);
    }

    public enum AgeGroup {
        INFANT("0-3"),
        CHILD("3-12"),
        ADULT("12-65"),
        SENIOR("65+");

        private final String description;

        AgeGroup(String description) {
            this.description = description;
        }

        @Override
        public String toString() {
            return description;
        }
    }

    public enum TrafficLightOption {
        RED,
        GREEN,
        YELLOW
    }

    public static AgeGroup getAgeGroup(int age) {
        if (age < 3) {
            return AgeGroup.INFANT;
        } else if (age >= 3 && age <= 12) {
            return AgeGroup.CHILD;
        } else if (age > 12 && age < 65) {
            return AgeGroup.ADULT;
        } else {
            return AgeGroup.SENIOR;
        }
    }
}
