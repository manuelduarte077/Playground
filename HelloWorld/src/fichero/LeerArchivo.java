package fichero;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class LeerArchivo {
    public static void main(String[] args) {
        try {

            File file = new File("example.txt");
            Scanner sc = new Scanner(file); // Scanner para leer el archivo

            while (sc.hasNextLine()) {
                String line = sc.nextLine(); // Lee cada línea del archivo
                System.out.println(line);
            }

            sc.close(); // Cierra el scanner

        } catch (FileNotFoundException e) {
            System.out.println("El archivo no fue encontrado.");
            e.printStackTrace();
        }
    }
}
