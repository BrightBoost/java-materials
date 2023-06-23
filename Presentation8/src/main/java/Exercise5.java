import java.util.function.BiFunction;

public class Exercise5 {
    public static void main(String[] args) {
        // Testing countSubstringOccurrences function
        String string = "Hello, Hello, Hello";
        String substring = "Hello";
        int occurrences = countSubstringOccurrences(string, substring);
        System.out.println("Number of occurrences of \"" + substring + "\" in \"" + string + "\": " + occurrences);

        // Testing mergeCatAndDog function
        Cat cat = new Cat("Whiskers", "Gray");
        Dog dog = new Dog("Buddy", "Brown");
        CatDog catDog = mergeCatAndDog(cat, dog);
        System.out.println("Merged CatDog: " + catDog);
    }

    public static int countSubstringOccurrences(String string, String substring) {
        int count = 0;
        int index = 0;
        while (index != -1) {
            index = string.indexOf(substring, index);
            if (index != -1) {
                count++;
                index += substring.length();
            }
        }
        return count;
    }

    public static CatDog mergeCatAndDog(Cat cat, Dog dog) {
        return new CatDog(cat.getName(), cat.getColor(), dog.getName(), dog.getColor());
    }
}

class Cat {
    private String name;
    private String color;

    public Cat(String name, String color) {
        this.name = name;
        this.color = color;
    }

    public String getName() {
        return name;
    }

    public String getColor() {
        return color;
    }
}

class Dog {
    private String name;
    private String color;

    public Dog(String name, String color) {
        this.name = name;
        this.color = color;
    }

    public String getName() {
        return name;
    }

    public String getColor() {
        return color;
    }
}

class CatDog {
    private String catName;
    private String catColor;
    private String dogName;
    private String dogColor;

    public CatDog(String catName, String catColor, String dogName, String dogColor) {
        this.catName = catName;
        this.catColor = catColor;
        this.dogName = dogName;
        this.dogColor = dogColor;
    }

    public String getCatName() {
        return catName;
    }

    public String getCatColor() {
        return catColor;
    }

    public String getDogName() {
        return dogName;
    }

    public String getDogColor() {
        return dogColor;
    }

    @Override
    public String toString() {
        return "CatDog{" +
                "catName='" + catName + '\'' +
                ", catColor='" + catColor + '\'' +
                ", dogName='" + dogName + '\'' +
                ", dogColor='" + dogColor + '\'' +
                '}';
    }
}
