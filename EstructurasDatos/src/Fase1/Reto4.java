//Dado un ArrayList<Integer>, crea una nueva lista con los valores multiplicados por 2.

package Fase1;

import java.util.ArrayList;

public class Reto4 {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(3);
        numbers.add(9);
        numbers.add(2);
        numbers.add(6);
        numbers.add(7);

        ArrayList<Integer> evenNumbers = new ArrayList<>();

        for (int num : numbers) {
            evenNumbers.add(num * 2); // Multiply each number by 2 and add to the new list
        }

        System.out.println("Lista original: " + numbers);
        System.out.println("Lista de números multiplicados por 2: " + evenNumbers); // Print the new list

    }
}
