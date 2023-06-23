import java.util.*;

public class Exercise4 {
    public static void main(String[] args) {
        // Create a TreeSet and add 10 items to it
        Set<Integer> treeSet = new TreeSet<>();
        for (int i = 1; i <= 10; i++) {
            treeSet.add(i);
        }

        // Create a HashSet and add the same 10 items to it
        Set<Integer> hashSet = new HashSet<>();
        for (int i = 1; i <= 10; i++) {
            hashSet.add(i);
        }

        // Create an array (list) lookup with 4 integers
        int[] lookup = { 3, 7, 10, 5 };

        // Look up the values in the TreeSet and HashSet
        long treeSetLookupTime = measureLookupTime(treeSet, lookup);
        long hashSetLookupTime = measureLookupTime(hashSet, lookup);

        System.out.println("Lookup time in TreeSet: " + treeSetLookupTime + " ms");
        System.out.println("Lookup time in HashSet: " + hashSetLookupTime + " ms");

        // Measure the average lookup time by running it 5 times
        int numIterations = 5;
        long averageTreeSetLookupTime = measureAverageLookupTime(treeSet, lookup, numIterations);
        long averageHashSetLookupTime = measureAverageLookupTime(hashSet, lookup, numIterations);

        System.out.println("Average lookup time in TreeSet: " + averageTreeSetLookupTime + " ms");
        System.out.println("Average lookup time in HashSet: " + averageHashSetLookupTime + " ms");

        // Scale up by multiplying the number of items by 100 three times and measure the difference
        int initialNumItems = 10;
        scaleUpAndMeasureLookupTime(treeSet, lookup, initialNumItems, 3);
        scaleUpAndMeasureLookupTime(hashSet, lookup, initialNumItems, 3);

        // Bonus: Measure the time it takes to add items to the TreeSet and HashSet
        int numItemsToAdd = 1000000;
        long treeSetAddTime = measureAddTime(treeSet, numItemsToAdd);
        long hashSetAddTime = measureAddTime(hashSet, numItemsToAdd);

        System.out.println("Time to add " + numItemsToAdd + " items to TreeSet: " + treeSetAddTime + " ms");
        System.out.println("Time to add " + numItemsToAdd + " items to HashSet: " + hashSetAddTime + " ms");
    }

    public static long measureLookupTime(Set<Integer> set, int[] lookup) {
        long startTime = System.currentTimeMillis();
        for (int value : lookup) {
            set.contains(value);
        }
        long endTime = System.currentTimeMillis();
        return endTime - startTime;
    }

    public static long measureAverageLookupTime(Set<Integer> set, int[] lookup, int numIterations) {
        long totalLookupTime = 0;
        for (int i = 0; i < numIterations; i++) {
            totalLookupTime += measureLookupTime(set, lookup);
        }
        return totalLookupTime / numIterations;
    }

    public static void scaleUpAndMeasureLookupTime(Set<Integer> set, int[] lookup, int initialNumItems, int numTimes) {
        int numItems = initialNumItems;
        for (int i = 1; i <= numTimes; i++) {
            // Scale up the set by multiplying the number of items by 100
            numItems *= 100;

            // Add items to the set
            for (int j = initialNumItems + 1; j <= numItems; j++) {
                set.add(j);
            }

            // Measure the lookup time
            long lookupTime = measureLookupTime(set, lookup);

            System.out.println("Lookup time in " + set.getClass().getSimpleName() +
                    " with " + numItems + " items: " + lookupTime + " ms");
        }
    }

    public static long measureAddTime(Set<Integer> set, int numItemsToAdd) {
        long startTime = System.currentTimeMillis();
        for (int i = 1; i <= numItemsToAdd; i++) {
            set.add(i);
        }
        long endTime = System.currentTimeMillis();
        return endTime - startTime;
    }
}
