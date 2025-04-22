// Dado un ArrayList<Integer>, crea otro que contenga solo los números pares del primero.

package Fase1;

import java.util.ArrayList;

public class Reto2 {
    public static void main(String[] args) {

        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(3);
        numbers.add(9);
        numbers.add(2);
        numbers.add(6);
        numbers.add(7);

        ArrayList<Integer> evenNumbers = new ArrayList<>();
        for (int number : numbers) {
            if (number % 2 == 0) { // Check if the number is even
                evenNumbers.add(number); // Add it to the new list
            }
        }

        System.out.println("Lista original: " + numbers);
        System.out.println("Lista de números pares: " + evenNumbers); // Print the new list

    }
}
