package examples;

/*
   Pide 3 numeros por teclado e indica cual es el mayor.
 */

import java.util.Scanner;

public class Mayor {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        in.useDelimiter("\n");

        // Pedimos los 3 numeros
        System.out.print("Enter an integer: ");
        int n1 = in.nextInt();
        System.out.print("Enter an integer: ");
        int n2 = in.nextInt();
        System.out.print("Enter an integer: ");
        int n3 = in.nextInt();

        // Comrpuebo si el numero 1 es mayor que los otros 2 numeros
        if (n1 >= n2 && n1 >= n3) {
            System.out.println("El numero mayor es " + n1);
            // Compruebo si el numero 2 es mayor que el numero 3
        } else if (n2 >= n3) {
            System.out.println("El numero mayor es " + n2);
            // Por descarte, el numero 3 es el mayor
        } else {
            System.out.println("El numero mayor es " + n3);
        }
    }
}
