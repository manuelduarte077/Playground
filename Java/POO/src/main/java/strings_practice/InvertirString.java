package strings_practice;

public class InvertirString {
    public static void main(String[] args) {
        String palabra = "Hola";

        // Opción 1: StringBuilder
        String invertida1 = new StringBuilder(palabra).reverse().toString();
        System.out.println("Invertida (StringBuilder): " + invertida1);

        // Opción 2: Manual con for
        String invertida2 = "";
        for (int i = palabra.length() - 1; i >= 0; i--) {
            invertida2 += palabra.charAt(i);
        }

        System.out.println("Invertida (for loop): " + invertida2);
    }
}
