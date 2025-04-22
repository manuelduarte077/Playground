package saludador;

/*
   Pide un nombre por teclado y haz que te salude
 */

import java.util.Scanner;

public class Saludador {
    public static void main(String[] args) {
        Scanner sn = new Scanner(System.in);
        sn.useDelimiter("\n");

        System.out.println("¿Cuál es tu nombre?");
        String nombre = sn.next();

        System.out.println("Hola " + nombre + ", ¿cómo estás?");
    }
}
