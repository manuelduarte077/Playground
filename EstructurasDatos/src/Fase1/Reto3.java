// Filtrar nombres que empiezan con vocal

package Fase1;

import java.util.ArrayList;
import java.util.Set;

/**
 * This program filters names from an ArrayList that start with a vowel.
 * It creates an ArrayList of strings, adds some names to it,
 * and then filters the names that start with a vowel.
 */
public class Reto3 {

    public static void main(String[] args) {

        ArrayList<String> names = new ArrayList<>();
        names.add("Jose");
        names.add("Maria");
        names.add("Alejandro");
        names.add("Sofia");
        names.add("Pedro");
        names.add("Isabella");
        names.add("Andres");

        ArrayList<String> filteredNames = new ArrayList<>();

        // Filter names that start with a vowel
        Set<Character> vowels = Set.of('a', 'e', 'i', 'o', 'u');

        for (String name : names) {
            if (!name.isEmpty() && vowels.contains(Character.toLowerCase(name.charAt(0)))) {
                filteredNames.add(name);
            }
        }

        System.out.println("Lista de nombres que empiezan con vocal: " + filteredNames); // Print the new list
    }
}
