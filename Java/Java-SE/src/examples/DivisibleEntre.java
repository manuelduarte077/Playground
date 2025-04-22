package examples;

/*
   Pide dos numeros por teclado e indica si el segundo es divisble por el primero
   Por ejemplo, si numero1 = 10 y numero2 = 5 deberia mostrar:
   "El numero 5 es divisible de 10"
*/

import java.util.Scanner;

public class DivisibleEntre {
    public static void main(String[] args) {

        Scanner sn = new Scanner(System.in);
        sn.useDelimiter("\n"); // Establece el delimitador para leer la entrada

        System.out.println("Introduce el primer número:");
        int numero1 = sn.nextInt();

        System.out.println("Introduce el segundo número:");
        int numero2 = sn.nextInt();

        if (numero1 % numero2 == 0) {
            System.out.println("El número " + numero2 + " es divisible de " + numero1);
        } else {
            System.out.println("El número " + numero2 + " no es divisible de " + numero1);
        }
    }
}
