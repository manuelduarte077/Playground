package Fase1;

import java.util.ArrayList;

/**
 * This program demonstrates how to find the maximum value in an ArrayList of integers.
 * It creates an ArrayList, adds some numbers to it, and then finds and prints the maximum value.
 */
public class MaximoValor {

    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>(); // Create an ArrayList to store integers
        numbers.add(10); // Add elements to the ArrayList
        numbers.add(20);
        numbers.add(5);
        numbers.add(13);
        numbers.add(7);
        numbers.add(25);

        int max = numbers.get(0); // Initialize max with the first element of the ArrayList

        for (int number : numbers) {
            if (number > max) { // Check if the current number is greater than max
                max = number; // Update max if the current number is greater
            }
        }

        System.out.println("El valor máximo es: " + max); // Print the maximum value
    }
}
