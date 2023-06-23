public class Exercise5 {
    public static void main(String[] args) {
        AgeGroup ageGroup = AgeGroup.ADULT;
        TrafficLightOption trafficLightOption = TrafficLightOption.GREEN;

        System.out.println("Age Group: " + ageGroup);
        System.out.println("Traffic Light Option: " + trafficLightOption);
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
}
