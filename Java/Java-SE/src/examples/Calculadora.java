package examples;

/*
   Pide 2 operandos, un operador (+ - * /) y realiza la operacion correspondiente.
   Si el operador es invalido o el 2º operando es 0 en el caso de la division,
   debes indicar que no se puede realizar la operacion.
 */

import java.util.Locale;
import java.util.Scanner;

public class Calculadora {
    public static void main(String[] args) {

        Scanner sn = new Scanner(System.in);
        sn.useLocale(Locale.US);

        System.out.println("Digite el primer numero: ");
        int num1 = sn.nextInt();

        System.out.println("Introduce el operador (+ - * /)");
        String oper = sn.next();

        System.out.println("Digite o segundo valor: ");
        int num2 = sn.nextInt();

        // Result
        double resultado = 0;
        boolean continuar = true;

        // Segun el operador
        switch (oper) {
            case "+" -> resultado = num1 + num2;
            case "-" -> resultado = num1 - num2;
            case "*" -> resultado = num1 * num2;
            case "/" -> {
                if (num2 != 0) {
                    resultado = num1 / num2;
                } else {
                    System.out.println("No se puede dividir entre 0 y 0");
                    continuar = false;
                }
            }
            default -> {
                System.out.println("Operador invalido");
                continuar = false;
            }
        }

        if (continuar) {
            System.out.println("El resultado es: " + resultado);
        }
    }
}
