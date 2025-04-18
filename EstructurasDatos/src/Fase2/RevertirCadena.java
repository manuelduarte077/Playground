package Fase2;

//  Revertir una cadena de texto usando una pila (Stack)

public class RevertirCadena {
    public static String invertir(String texto) {
        MiStack pila = new MiStack();

        for (char c : texto.toCharArray()) {
            pila.push((int)c); // Guardamos el valor ASCII del carácter
        }

        String resultado = "";
        while (!pila.isEmpty()) {
            resultado += (char)pila.pop();
        }

        return resultado;
    }

    public static void main(String[] args) {
        String original = "hola";
        String invertida = invertir(original);

        System.out.println("Original: " + original);
        System.out.println("Invertida: " + invertida); // aloh
    }
}