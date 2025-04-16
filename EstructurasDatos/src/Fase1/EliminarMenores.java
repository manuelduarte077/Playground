package Fase1;

import java.util.ArrayList;

/**
 * This program demonstrates how to remove elements from an ArrayList based on a condition.
 * It creates an ArrayList of integers, removes all elements that are less than 10,
 * and then prints the modified list.
 */

public class EliminarMenores {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>(); // Create an ArrayList to store integers
        numbers.add(4);
        numbers.add(12);
        numbers.add(7);
        numbers.add(15);
        numbers.add(3);

        for (int i = 0; i < numbers.size(); i++) {
            if (numbers.get(i) < 10) { // Check if the current number is less than 10
                numbers.remove(i); // Remove the number from the list
                i--; // retrocedemos para no saltar elementos
            }
        }

        System.out.println("Lista sin menores de 10: " + numbers); // Print the modified list
    }
}
