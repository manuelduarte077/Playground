package Fase1;

import java.util.ArrayList;

/**
 * This program demonstrates how to concatenate strings from an ArrayList.
 * It creates an ArrayList of strings, adds some words to it,
 * and then concatenates them into a single string.
 */

public class ConcatenarStrings {

    public static void main(String[] args) {
        ArrayList<String> numbers = new ArrayList<>();
        numbers.add("Hola");
        numbers.add(" ");
        numbers.add("Mundo");
        numbers.add("!");

        StringBuilder concatenatedString = new StringBuilder(); // Using StringBuilder for efficient string concatenation
        for (String word : numbers) {
            concatenatedString.append(word); // Append each word to the StringBuilder
        }

        System.out.println("Cadena concatenada: " + concatenatedString.toString());
    }

}
