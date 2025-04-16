package Fase1;

/**
 * This program searches for a specific number in an array of integers.
 * It iterates through the array and checks if the number is present.
 * If found, it prints a message indicating that the number was found;
 * otherwise, it indicates that the number was not found.
 */

public class BuscarNumero {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 9, 4, 5}; // Array of integers

        int x = 3; // Number to search for
        boolean found = false; // Flag to indicate if the number is found

        for (int number : numbers) {
            if (number == x) {
                found = true;
                break;
            }
        }

        if (found) {
            System.out.println("El número " + x + " fue encontrado.");
        } else {
            System.out.println("El número " + x + " no fue encontrado.");
        }
    }
}
