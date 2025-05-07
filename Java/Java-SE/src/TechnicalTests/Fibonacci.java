package TechnicalTests;

public class Fibonacci {
    public static void main(String[] args) {
        int n = 10; // Example input
        System.out.println("Fibonacci of " + n + " (iterative): " + fibonacciIterative(n));
        System.out.println("Fibonacci of " + n + " (recursive): " + fibonacciRecursive(n));
    }

    public static long fibonacciIterative(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("Number must be non-negative.");
        }
        if (n == 0) return 0;
        if (n == 1) return 1;

        long a = 0, b = 1, c = 0;
        for (int i = 2; i <= n; i++) {
            c = a + b;
            a = b;
            b = c;
        }
        return c;
    }

    public static long fibonacciRecursive(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("Number must be non-negative.");
        }
        if (n == 0) return 0;
        if (n == 1) return 1;
        return fibonacciRecursive(n - 1) + fibonacciRecursive(n - 2);
    }
}
