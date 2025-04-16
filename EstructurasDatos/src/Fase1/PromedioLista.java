package Fase1;

import java.util.ArrayList;

/**
 * This program calculates the average of elements in an ArrayList of integers.
 * It creates an ArrayList, adds some numbers to it,
 * and then calculates and prints the average of all elements in the list.
 */

public class PromedioLista {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>(); // ArrayList to store integers
        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
        numbers.add(40);

        int sum = 0; // Variable to store the sum of elements
        for (int num : numbers) { // Loop through each element in the ArrayList
            sum += num; // Add the current element to the sum
        }

        double averrage = (double) sum / numbers.size();
        System.out.println("El promedio de los elementos es: " + averrage); // Print the average

    }
}
