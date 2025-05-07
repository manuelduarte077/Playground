package TechnicalTests;

public class Factorial {
    public static void main(String[] args) {
        int number = 5;

        System.out.println("Factorial of " + number + " (iterative): " + factorialIterative(number));
        System.out.println("Factorial of " + number + " (recursive): " + factorialRecursive(number));
    }

    // Iterative approach
    public static int factorialIterative(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("Number must be non-negative.");
        }

        int result = 1;
        for (int i = 1; i <= n; i++) {
            result *= i;
        }

        return result;
    }

    // Recursive approach
    public static int factorialRecursive(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("Number must be non-negative.");
        }
        if (n == 0) {
            return 1; // Base case
        }
        return n * factorialRecursive(n - 1); // Recursive case
    }
}