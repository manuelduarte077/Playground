/**
 * The MiStack class is a custom implementation of a stack data structure using an ArrayList.
 * It provides standard stack operations such as push, pop, peek, and utility methods to check
 * the size and whether the stack is empty.
 */
package Fase2;

import java.util.ArrayList;

public class MiStack {
    private ArrayList<Integer> stack; // Internal storage for the stack elements

    /**
     * Constructor for the MiStack class.
     * Initializes an empty stack.
     */
    public MiStack() {
        stack = new ArrayList<>();
    }

    /**
     * Pushes a value onto the top of the stack.
     *
     * @param value The integer value to be added to the stack.
     */
    public void push(int value) {
        stack.add(value);
    }

    /**
     * Removes and returns the value at the top of the stack.
     *
     * @return The integer value at the top of the stack.
     * @throws RuntimeException if the stack is empty.
     */
    public int pop() {
        if (isEmpty()) {
            throw new RuntimeException("Stack is empty");
        }
        return stack.remove(stack.size() - 1);
    }

    /**
     * Returns the value at the top of the stack without removing it.
     *
     * @return The integer value at the top of the stack.
     * @throws RuntimeException if the stack is empty.
     */
    public int peek() {
        if (isEmpty()) {
            throw new RuntimeException("Stack is empty");
        }
        return stack.get(stack.size() - 1);
    }

    /**
     * Checks if the stack is empty.
     *
     * @return true if the stack is empty, false otherwise.
     */
    public boolean isEmpty() {
        return stack.isEmpty();
    }

    /**
     * Returns the number of elements in the stack.
     *
     * @return The size of the stack.
     */
    public int size() {
        return stack.size();
    }

    /**
     * Prints the elements of the stack from top to bottom.
     * Each element is printed on a new line.
     */
    public void printStack() {
        for (int i = stack.size() - 1; i >= 0; i--) {
            System.out.println(stack.get(i));
        }
    }
}