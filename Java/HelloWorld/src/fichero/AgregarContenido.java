package fichero;

import java.io.FileWriter;
import java.io.IOException;

public class AgregarContenido {
    public static void main(String[] args) {

        try {
            FileWriter writer = new FileWriter("example.txt", true);
            writer.write("\nEste es un nuevo contenido agregado al archivo.\n");
            writer.write("Agregando más contenido.\n");
            writer.close();

            System.out.println("Se agrego contenido al file");

        } catch (IOException ex) {
            System.out.println("Ocurrio un erro");
            ex.printStackTrace();
        }

    }
}
