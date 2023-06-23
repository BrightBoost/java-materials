import java.util.ArrayList;
import java.util.List;

public class Exercise9 {
    public static void main(String[] args) {
        List<String> favoriteFoods = new ArrayList<>();
        favoriteFoods.add("Pizza");
        favoriteFoods.add("Burger");
        favoriteFoods.add("Sushi");

        synchronized (favoriteFoods) {
            for (String food : new ArrayList<>(favoriteFoods)) {
                favoriteFoods.add(food);
                System.out.println("Count: " + favoriteFoods.size());
            }
        }

        System.out.println("Final count: " + favoriteFoods.size());
    }
}
