import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class FicheroNumeros {

    public static void main(String[] args) {
        // Scanner para pedir por teclado
        Scanner sn = new Scanner(System.in);

        // Pedimos el número de números a generar
        int number = 0;
        do {

            try {
                System.out.println("Introduce un número entero positivo");
                number = sn.nextInt();

                if (number < 0) {
                    System.out.println("El número debe ser positivo");
                }

            } catch (InputMismatchException e) {
                sn.next();
                System.out.println("Debes escribir un número");
            }

        } while (number <= 0);

        //
        File fichero = new File("numeros.txt");

        // Abrimos el fichero para escribir y leer, se cierran automaticamente
        try (FileWriter fw = new FileWriter(fichero); FileReader fr = new FileReader(fichero)) {

            // Escribimos de 1 al numero insertado
            for (int i = 1; i <= number; i++) {
                fw.write(i + "\r\n");
            }

            // Recargamos
            fw.flush();

            // Leemos el fichero
            int valor;
            while ((valor = fr.read()) != -1) {
                System.out.print(valor);
            }
        } catch (IOException ex) {
            Logger.getLogger(App.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
