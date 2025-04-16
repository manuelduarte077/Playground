package Fase1;

import java.util.ArrayList;

/**
 * This program demonstrates how to count the occurrences of a specific number in an ArrayList.
 * It creates an ArrayList of integers, adds some numbers to it,
 * and then counts how many times a specific number appears in the list.
 */

public class ContarOcurrencias {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>(); // Create an ArrayList to store integers
        numbers.add(5);
        numbers.add(3);
        numbers.add(5);
        numbers.add(7);
        numbers.add(5);

        int target = 5; // The number to count occurrences of
        int count = 0; // Variable to store the count of occurrences

        for (int number : numbers) {
            if (number == target) {
                count++; // Increment the count if the number matches the target
            }
        }

        System.out.println("El número " + target + " aparece " + count + " veces en la lista."); // Print the count

    }
}


