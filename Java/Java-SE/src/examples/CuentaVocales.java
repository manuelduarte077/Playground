package examples;

/*
   Pide una frase por teclado y cuenta cuentas vocales tiene.
 */

import java.util.Scanner;

public class CuentaVocales {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        System.out.println("Ingresa la frase");
        String frase = teclado.next();

        // Vocales
        if ((frase.length()%2) == 0) {
            System.out.println(frase);
        }
    }
}
