package examples;

/*
   Pide un año por teclado e indica si es bisiesto o no.
   Un año es bisiesto cuando es divisible entre 4 y no divisible por 100
   o es divisible por 400
 */

import java.util.Scanner;

public class Bisiesto {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        sc.useDelimiter("\n");

        System.out.print("Ingrese el primer numero: ");
        int year = sc.nextInt();

        // Comprobamos si el año es bisiesto
        if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) { // Año bisiesto
            System.out.println(year + " es un año bisiesto.");
        } else {
            System.out.println(year + " no es un año bisiesto.");
        }
    }
}
