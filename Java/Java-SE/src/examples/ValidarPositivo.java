package examples;

/*
    Pide un numero por teclado y valida que sea positivo
*/

import java.util.Scanner;

public class ValidarPositivo {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int number;
        do {
            System.out.println("Digite um numero: ");
            number = sc.nextInt();

            if (number < 0) {
                System.out.println("Error, el numero debe ser positivo");
            }
        } while (number < 0);

        System.out.println("El numero " + number);
    }
}
