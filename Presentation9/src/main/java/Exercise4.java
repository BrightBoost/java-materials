import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.ExecutionException;

public class Exercise4 {
    public static void main(String[] args) {
        // Create a class that represents the dishes to do
        Dishes dishes = new Dishes();

        // Create an ExecutorService with a single thread
        ExecutorService executor = Executors.newSingleThreadExecutor();

        // Submit the task of doing dishes to the ExecutorService
        Future<String> future = executor.submit(dishes);

        // Poll the Future object to check whether the dishes are done
        while (!future.isDone()) {
            System.out.println("Dishes are still being done...");
            try {
                Thread.sleep(1000); // Poll every 1 second
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        // Retrieve the result from the Future object
        try {
            String result = future.get();
            System.out.println("Dishes are done: " + result);
        } catch (InterruptedException | ExecutionException e) {
            e.printStackTrace();
        }

        // Shut down the ExecutorService
        executor.shutdown();
    }

    private static class Dishes implements Callable<String> {
        @Override
        public String call() throws Exception {
            System.out.println("Doing the dishes...");
            Thread.sleep(5000); // Simulating dishwashing process
            return "Clean dishes";
        }
    }
}
