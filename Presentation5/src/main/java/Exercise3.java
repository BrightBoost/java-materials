package restaurant;

public class Exercise3 {
    public static void main(String[] args) {
        Employee chef = new Employee("John");
        // chef.prepareOrder("Burger"); // This line will cause a compilation error since prepareOrder is private

        Employee waiter = new Employee("Mary");
        waiter.takeOrder("Pizza"); // Can be accessed within the restaurant package and its child classes

        waiter.answerQuestion("What's the daily special?"); // Can be accessed from anywhere

        waiter.bringOrder("Steak"); // Can be accessed within the restaurant package
    }
}

class Employee {
    private String name;

    public Employee(String name) {
        this.name = name;
    }

    private void prepareOrder(String order) {
        System.out.println(name + " is preparing order: " + order);
    }

    protected void takeOrder(String order) {
        System.out.println(name + " is taking order: " + order);
    }

    public void answerQuestion(String question) {
        System.out.println(name + " is answering question: " + question);
    }

    void bringOrder(String order) {
        System.out.println(name + " is bringing order: " + order);
    }
}
