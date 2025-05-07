package TechnicalTests;

/*
    Descripción: Escribe una función que determine si un número entero dado es primo.
    Conceptos: Bucles, condicionales (if), operador módulo (%),
               optimizaciones (solo comprobar hasta la raíz cuadrada del número).
 */

import java.util.Scanner;

public class PrimeNumberCheck {

    public static void main(String[] args) {
        int number;
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce un número para comprobar si es primo:");
        number = sc.nextInt();

        if (isPrime(number)) {
            System.out.println(number + " es un número primo.");
        } else {
            System.out.println(number + " no es un número primo.");
        }
    }

    /**
     * Comprueba si un número es primo.
     *
     * @param number El número a comprobar.
     * @return true si el número es primo, false en caso contrario.
     */
    public static boolean isPrime(int number) {
        // Comprobamos si el número es menor que 2
        if (number < 2) {
            return false;
        }

        // Comprobamos si el número es divisible por algún número entre 2 y la raíz cuadrada de number
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false;
            }
        }

        return true;
    }
}
