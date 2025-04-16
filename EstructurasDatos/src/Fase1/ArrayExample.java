package Fase1;

public class ArrayExample {
    int[] numeros = new int[3];

    public ArrayExample() {
        numeros[0] = 10;
        numeros[1] = 20;
        numeros[2] = 30;

        for (int num : numeros) {
            System.out.println(num);
        }
        System.out.println("Array length: " + numeros.length);
    }
}
