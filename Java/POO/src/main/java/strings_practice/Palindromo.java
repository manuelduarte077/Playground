package strings_practice;

public class Palindromo {
    public static boolean esPalindromo(String texto) {
        // Normalizamos: quitamos espacios y minúsculas
        String limpio = texto.replaceAll("\\s+", "").toLowerCase();
        String reverso = new StringBuilder(limpio).reverse().toString();
        return limpio.equals(reverso);
    }

    public static void main(String[] args) {
        System.out.println(esPalindromo("Anita lava la tina")); // true
    }
}