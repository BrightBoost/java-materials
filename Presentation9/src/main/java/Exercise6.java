import java.util.concurrent.atomic.AtomicInteger;

public class Exercise6 {
    private AtomicInteger counter;

    public Exercise6() {
        counter = new AtomicInteger(0);
    }

    public void increment() {
        counter.incrementAndGet();
    }

    public int getCounter() {
        return counter.get();
    }

    public static void main(String[] args) {
        Exercise6 counter = new Exercise6();

        Runnable incrementTask = () -> {
            for (int i = 0; i < 1000; i++) {
                counter.increment();
            }
            System.out.println("Thread " + Thread.currentThread().getId() + " finished incrementing.");
        };

        Thread thread1 = new Thread(incrementTask);
        Thread thread2 = new Thread(incrementTask);
        Thread thread3 = new Thread(incrementTask);

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

        System.out.println("Final count: " + counter.getCounter());
    }
}
