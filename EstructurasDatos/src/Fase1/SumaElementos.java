package Fase1;

import java.util.ArrayList;

/**
 * This program demonstrates the use of an ArrayList in Java.
 * It creates an ArrayList of integers, adds some numbers to it,
 * and then calculates the sum of all elements in the list.
 */
public class SumaElementos {


    public static void main(String[] args) {
        ArrayList<Integer> numeros = new ArrayList<>(); // ArrayList to store integers
        numeros.add(1); // Adding elements to the ArrayList
        numeros.add(29);
        numeros.add(3);
        numeros.add(4);

        int suma = 0; // Variable to store the sum of elements

        for (int num : numeros) { // Loop through each element in the ArrayList
            suma += num; // Add the current element to the sum
        }

        System.out.println("La suma de los elementos es: " + suma);
    }

}
