import java.util.ArrayList;

public class App {
    public static void main(String[] args) {
        listNumber(
                new ArrayList<Integer>() {{
                    add(1);
                    add(2);
                    add(3);
                    add(4);
                    add(5);
                }}
        );
    }

    /**
     * Esta función imprime un saludo y la suma de dos números.
     *
     * @param a Primer número
     * @param b Segundo número
     * @return 0
     */
    public static int sayHello(int a, int b) {
        System.out.println("¡Hola desde una función en Java!");

        String result = "La suma de " + a + " y " + b + " es: " + (a + b);
        System.out.println(result);

        return 0;
    }

    public static void listNumber(ArrayList<Integer> numbers) {

        for (int number : numbers) {
            System.out.println(number);
        }

    }
}
