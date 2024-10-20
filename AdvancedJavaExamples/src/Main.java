import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6);

        int suma = numeros.stream() // Stream<Integer> (1, 2, 3, 4, 5, 6)
                .filter(n -> n % 2 == 0) // Stream<Integer> (2, 4, 6) - filtrar los números pares
                .map(n -> n * 2) // Stream<Integer> (4, 8, 12) - multiplicar por 2
                .reduce(0, Integer::sum); // 24 - sumar todos los elementos

        System.out.println("La suma de los números pares multiplicados por 2 es: " + suma);

    }
}