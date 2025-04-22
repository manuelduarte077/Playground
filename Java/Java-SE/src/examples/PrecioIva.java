package examples;

/*
   Pide el precio de un producto sin IVA y calcula su precio con IVA.
   El IVA es del 21%.
   Formatea el resultado para que se muestre con dos decimales.
*/

import java.util.Locale;
import java.util.Scanner;

public class PrecioIva {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.US); // Establece el locale para usar punto como separador decimal

        final double IVA = 0.15;

        System.out.println("Introduce el precio del producto sin IVA:");
        double price = sc.nextDouble();

        double priceWithIva = price + (price * IVA); // Calcula el precio con IVA

        System.out.printf("El precio del producto con IVA es: %.2f\n", priceWithIva);

    }
}
