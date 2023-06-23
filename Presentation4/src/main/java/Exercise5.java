import java.util.ArrayDeque;
import java.util.Deque;

public class Exercise5 {
    public static void main(String[] args) {
        Deque<String> lunchQueue = new ArrayDeque<>();

        // Adding everyone to the lunch queue
        lunchQueue.add("Person 1");
        lunchQueue.add("Person 2");
        lunchQueue.add("Person 3");
        lunchQueue.add("Person 4");
        lunchQueue.add("Person 5");

        // Logging the output of everyone getting lunch
        while (!lunchQueue.isEmpty()) {
            String person = lunchQueue.poll();
            System.out.println(person + " is getting lunch");
        }

        System.out.println("Lunch is over, time to stack the plates in the kitchen");

        Deque<String> plateStack = new ArrayDeque<>();

        // Simulating everyone stacking their plates in the kitchen
        plateStack.push("Person 1's plate");
        plateStack.push("Person 2's plate");
        plateStack.push("Person 3's plate");
        plateStack.push("Person 4's plate");
        plateStack.push("Person 5's plate");

        // Logging every stacking action
        while (!plateStack.isEmpty()) {
            String plate = plateStack.pop();
            System.out.println("Stacking " + plate + " in the kitchen");
        }

        System.out.println("Dishes are stacked, time to wash and dry them");

        String dishwasher = "Person X";
        String dryer = "Person Y";

        // Log whose dish is being washed and put into the drying rack
        System.out.println("Washing " + dishwasher + "'s dish and putting it into the drying rack");

        // Log the order of drying the plates and putting them in the cupboard
        System.out.println("Drying " + dryer + "'s dish and putting it in the cupboard");
    }
}
