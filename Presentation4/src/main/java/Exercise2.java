import java.util.ArrayList;
import java.util.List;

class Bag<T> {
    private List<T> items;

    public Bag() {
        items = new ArrayList<>();
    }

    public void add(T item) {
        items.add(item);
    }

    public List<T> getItems() {
        return items;
    }
}

class Groceries {
    private String name;

    public Groceries(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}

public class Exercise2 {
    public static void main(String[] args) {
        List<Groceries> groceriesList = new ArrayList<>();
        groceriesList.add(new Groceries("Apples"));
        groceriesList.add(new Groceries("Bananas"));
        groceriesList.add(new Groceries("Bread"));

        Bag<Groceries> bag = new Bag<>();
        for (Groceries groceries : groceriesList) {
            bag.add(groceries);
        }

        unpackGroceries(bag);
    }

    public static void unpackGroceries(Bag<Groceries> bag) {
        List<Groceries> groceries = bag.getItems();
        for (Groceries item : groceries) {
            System.out.println("Unpacking: " + item.getName());
        }
    }
}
