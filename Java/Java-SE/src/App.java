public class App {
    public static void main(String[] args) {
        sayHello(
                5,
                10
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
}
