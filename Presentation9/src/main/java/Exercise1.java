public class Exercise1 {
    public static void main(String[] args) {
        // Create an instance of the RunnableClass
        RunnableClass runnable = new RunnableClass();

        // Create a Thread and pass the Runnable object
        Thread thread1 = new Thread(runnable);

        // Create an instance of the SubThread class
        SubThread subThread = new SubThread();

        // Start the threads
        thread1.start();
        subThread.start();
    }
}

// RunnableClass implementing Runnable interface
class RunnableClass implements Runnable {
    @Override
    public void run() {
        // Print the thread id
        System.out.println("Runnable thread id: " + Thread.currentThread().getId());
    }
}

// SubThread extending Thread class
class SubThread extends Thread {
    @Override
    public void run() {
        // Print the thread id
        System.out.println("SubThread id: " + this.getId());
    }
}
