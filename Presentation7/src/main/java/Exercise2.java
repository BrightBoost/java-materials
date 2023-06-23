package exercise2;

public class Exercise2 {
    public static void main(String[] args) {
        try (CatHuntAction catHuntAction = new CatHuntAction(new Cat("Tom"), new Spider())) {
            catHuntAction.huntSpider();
            catHuntAction.playWithCat();
        } catch (SpiderAteCatException e) {
            System.out.println("Caught SpiderAteCatException: " + e.getMessage());
        } catch (UnexpectedStrongSuperSpiderException e) {
            System.out.println("Caught UnexpectedStrongSuperSpiderException: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Caught Exception: " + e.getMessage());
        }
    }
}

class CatHuntAction implements AutoCloseable {
    private Cat cat;
    private Spider spider;

    public CatHuntAction(Cat cat, Spider spider) {
        this.cat = cat;
        this.spider = spider;
    }

    public void huntSpider() throws UnexpectedStrongSuperSpiderException {
        System.out.println("Cat " + cat.getName() + " is hunting the spider.");
        spider.runAway();
    }

    public void playWithCat() {
        System.out.println("Playing with cat " + cat.getName());
        if (spider.isHungry()) {
            throw new SpiderAteCatException("Spider ate the cat!");
        }
    }

    @Override
    public void close() {
        System.out.println("Closing CatHuntAction");
    }
}

class Cat {
    private String name;

    public Cat(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}

class Spider {
    private boolean hungry = true;

    public void runAway() throws UnexpectedStrongSuperSpiderException {
        boolean strongSuperSpider = true;
        if (strongSuperSpider) {
            throw new UnexpectedStrongSuperSpiderException("Unexpected strong super spider!");
        } else {
            System.out.println("Spider is running away from the cat.");
        }
    }

    public boolean isHungry() {
        return hungry;
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
