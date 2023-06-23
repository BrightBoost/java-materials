package restaurant;

public class Exercise5 {
    public static void main(String[] args) {
        Customer customer = new Customer("John Doe");
        Employee employee = new Employee("Alice");

        customer.makeOrder("Pizza");
        employee.prepareOrder(customer.getOrder());
        employee.bringOrder();

        Restaurant.rulesAndRegulationsRestaurantsExplained();
        System.out.println("Customers visited today: " + Restaurant.getCustomersVisited());
    }

}

class Restaurant {
    public static int customersVisited = 0;

    public static void rulesAndRegulationsRestaurantsExplained() {
        // Method implementation
        System.out.println("Rules and regulations of restaurants explained...");
    }

    public static int getCustomersVisited() {
        return customersVisited;
    }
}

class Employee {
    private String name;

    public Employee(String name) {
        this.name = name;
    }

    public void prepareOrder(String order) {
        // Method implementation
        System.out.println("Preparing order: " + order);
    }

    public void bringOrder() {
        // Method implementation
        System.out.println("Bringing order to the customer");
        Restaurant.customersVisited++;
    }
}

class Customer {
    private String name;
    private String order;

    public Customer(String name) {
        this.name = name;
    }

    public void makeOrder(String order) {
        // Method implementation
        this.order = order;
        System.out.println("Customer " + name + " placed an order for: " + order);
    }

    public String getOrder() {
        return order;
    }
}