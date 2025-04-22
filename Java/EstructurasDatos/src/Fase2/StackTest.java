package Fase2;

public class StackTest {
    public static void main(String[] args) {
        MiStack stack = new MiStack();

        stack.push(10);
        stack.push(20);
        stack.push(30);

        // Print Stack
        stack.printStack(); // Should print 20, 10
    }
}
