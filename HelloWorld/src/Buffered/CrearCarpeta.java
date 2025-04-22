package Buffered;

import java.io.File;


/**
 * Crea una carpeta en el directorio actual.
 */

public class CrearCarpeta {
    public static void main(String[] args) {

        File folder = new File("nuevaCarpeta");

        if (folder.mkdir()) {
            System.out.println("Carpeta creada correctamente");
        } else {
            System.out.println("No se puede crear Carpeta");
        }
    }
}
