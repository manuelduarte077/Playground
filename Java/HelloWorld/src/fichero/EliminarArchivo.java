package fichero;

import java.io.File;

public class EliminarArchivo {

    public static void main(String[] args) {
        File file = new File("example.txt");

        if (!file.exists()) {
            System.out.println("El archivo no existe.");
        } else {
            if (file.delete()) {
                System.out.println("Archivo eliminado: " + file.getName());
            } else {
                System.out.println("No se pudo eliminar el archivo.");
            }
        }
    }

}
