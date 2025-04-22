package Fase1;

import java.util.ArrayList;

/**
 * This program demonstrates the use of an ArrayList in Java.
 * It creates an ArrayList of integers, adds some numbers to it,
 * and then prints each number to the console.
 */
public class ArrayListExample {
    public static void main(String[] args) {
        ArrayList<Integer> numeros = new ArrayList<>();

        numeros.add(10);
        numeros.add(20);
        numeros.add(30);

        for (int num : numeros) {
            System.out.println(num);
        }

    }
}


