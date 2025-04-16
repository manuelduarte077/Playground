// Dado un ArrayList<String> con nombres, cuenta cuántos nombres tienen más de 5 letras.

package Fase1;

import java.util.ArrayList;

/**
 * This program counts how many names in an ArrayList have more than 5 letters.
 * It creates an ArrayList of strings, adds some names to it,
 * and then counts how many names have more than 5 letters.
 */

public class Reto1 {
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<>();
        names.add("Juan");
        names.add("Maria");
        names.add("Alejandro");
        names.add("Sofia");
        names.add("Pedro");
        names.add("Isabella");

        int count = 0; // Variable to count names with more than 5 letters

        for (String name : names) {
            if (name.length() > 5) {
                count++; // Increment the count if the name has more than 5 letters
            }
        }

        System.out.println("El número de nombres con más de 5 letras es: " + count);
    }
}
