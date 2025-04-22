package Buffered;

import java.io.FileWriter;
import java.io.IOException;

/**
 * Escribe en un archivo de texto utilizando try-with-resources.
 * Este bloque asegura que el recurso se cierre automáticamente.
 */

public class EscribirTryWithResources {

    public static void main(String[] args) {
        try (FileWriter fileWriter = new FileWriter("example.txt")) {
            fileWriter.write("Texto escrito usando try-with-resources.\n");
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }

}
