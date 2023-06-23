public class Exercise2 {
    public static void main(String[] args) {
        try {
            // Sleep for 5 seconds
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            System.out.println("InterruptedException occurred");
            e.printStackTrace();
        }
    }
}
