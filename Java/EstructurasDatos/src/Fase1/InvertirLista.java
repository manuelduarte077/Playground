package Fase1;

import java.util.ArrayList;

/**
 * This program demonstrates how to reverse the order of elements in an ArrayList.
 * It creates an ArrayList of strings, adds some words to it,
 * and then creates a new ArrayList with the words in reverse order.
 */

public class InvertirLista {
    public static void main(String[] args) {

        ArrayList<String> words = new ArrayList<>(); // Create an ArrayList to store strings
        words.add("Hola"); // Add elements to the ArrayList
        words.add("Mundo");
        words.add("Java");

        ArrayList<String> reversedWords = new ArrayList<>(); // Create another ArrayList to store reversed strings

        for (int i = words.size() - 1; i >= 0; i--) { // Loop through the original list in reverse order
            reversedWords.add(words.get(i)); // Add each element to the new list
        }

        System.out.println(reversedWords);
    }
}
