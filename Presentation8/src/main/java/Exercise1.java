@FunctionalInterface
interface Calculator {
    int calc(int a, int b);
}

public class Exercise1 {
    public static void main(String[] args) {
        // Implementing the interface using a lambda expression
        Calculator addition = (a, b) -> a + b;

        // Calling the calculate method with the interface type as an argument
        calculate(addition, 5, 3);
    }

    public static void calculate(Calculator calculator, int a, int b) {
        int result = calculator.calc(a, b);
        System.out.println("Result: " + result);
    }
}
