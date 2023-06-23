public class Exercise7 {
    private int counter;

    public Exercise7() {
        counter = 0;
    }

    public synchronized void increment() {
        counter++;
    }

    public int getCounter() {
        return counter;
    }

    public static void main(String[] args) {
        Exercise7 counter = new Exercise7();

        Runnable incrementTask = () -> {
            for (int i = 0; i < 1000; i++) {
                counter.increment();
            }
            System.out.println("Thread " + Thread.currentThread().getId() + " finished incrementing.");
        };

        Thread thread1 = new Thread(incrementTask);
        Thread thread2 = new Thread(incrementTask);
        Thread thread3 = new Thread(incrementTask);

        long startTime = System.currentTimeMillis();

        thread1.start();
        thread2.start();
        thread3.start();

        try {
            thread1.join();
            thread2.join();
            thread3.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        long endTime = System.currentTimeMillis();

        System.out.println("Final count: " + counter.getCounter());
        System.out.println("Time taken: " + (endTime - startTime) + " milliseconds");
    }
}
