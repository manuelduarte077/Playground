package fichero;

import java.io.FileWriter;
import java.io.IOException;

public class EscribirArchivo {
    public static void main(String[] args) {

        try {
            FileWriter writer = new FileWriter("example.txt");
            writer.write("Hola, mundo!\n");
            writer.write("Este es un archivo de ejemplo.\n");
            writer.close();

            System.out.println("Archivo escrito con éxito.");
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
            ex.printStackTrace();
        }

    }
}
