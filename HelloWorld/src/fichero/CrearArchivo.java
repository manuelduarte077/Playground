package fichero;

import java.io.File;
import java.io.IOException;

/**
 * Crea un archivo de texto llamado files.txt en el directorio actual.
 * Si el archivo ya existe, no se creará de nuevo.
 */

public class CrearArchivo {

    public static void main(String[] args) {
        try {
            File file = new File("files.txt");
            
            if (!file.exists() && file.createNewFile()) { // Crea el archivo si no existe
                System.out.println("Archivo creado: " + file.getName());
            } else {
                System.out.println("El archivo ya existe.");
            }
        } catch (IOException e) {
            System.out.println("Ocurrio un error");
            e.printStackTrace();
        }
    }
}
