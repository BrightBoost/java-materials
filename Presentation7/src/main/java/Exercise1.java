package exercise1;

public class Exercise1 {
    public static void main(String[] args) {
        try {
            Cat cat = new Cat();
            cat.catchSpider();
        } catch (UnexpectedStrongSuperSpiderException e) {
            System.out.println("Caught UnexpectedStrongSuperSpiderException: " + e.getMessage());
        } catch (SpiderAteCatException e) {
            System.out.println("Caught SpiderAteCatException: " + e.getMessage());
        }
    }
}

class Cat {
    public void catchSpider() throws UnexpectedStrongSuperSpiderException {
        boolean strongSuperSpider = true;
        if (strongSuperSpider) {
            throw new UnexpectedStrongSuperSpiderException("Unexpected strong super spider!");
        } else {
            System.out.println("Cat caught the spider.");
        }
    }
}

class SpiderAteCatException extends RuntimeException {
    public SpiderAteCatException(String message) {
        super(message);
    }
}

class UnexpectedStrongSuperSpiderException extends Exception {
    public UnexpectedStrongSuperSpiderException(String message) {
        super(message);
    }
}
