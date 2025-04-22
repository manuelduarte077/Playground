import java.io.IOException;
import java.nio.file.*;
import java.nio.file.attribute.BasicFileAttributes;
import java.util.logging.Level;
import java.util.logging.Logger;

/*
    Crea un directorio llamado pruebas.
    Crea 10 ficheros dentro del directorio pruebas con el siguiente formato:
    file-<numero>.txt donde <numero> se sustituira por el numero del fichero
    Lista los fichero dentro de la carpeta pruebas.
    Si el directorio pruebas existe, lo borraremos antes de empezar a crear.
    Puedes hacerlo con File o Path.
 */
public class Ficheros {

    public static void main(String[] args) {

        try {
            Path directory = Path.of("pruebas");

            // Si el directorio ya existe, lo borramos
            if (Files.exists(directory)) {
                // Borrado recursivo
                Files.walkFileTree(directory, new SimpleFileVisitor<Path>() {
                    @Override
                    public FileVisitResult visitFile(Path file, BasicFileAttributes attrs) throws IOException {
                        Files.delete(file);
                        return FileVisitResult.CONTINUE;
                    }

                    @Override
                    public FileVisitResult postVisitDirectory(Path dir, IOException exc) throws IOException {
                        Files.delete(dir);
                        return FileVisitResult.CONTINUE;
                    }
                });
                System.out.println("Directorio borrado: " + directory);
            }

            // Creamos el directorio
            Files.createDirectory(directory);
            System.out.println("Directorio borrado: " + directory);

            // Creo los ficheros dentro del directorio
            for (int i = 0; i <= 10; i++) {
                Path fichero = Paths.get(directory.toString(), "file-" + i + ".txt");
                Files.createFile(fichero);
            }
            System.out.println("Ficheros creados: " + directory);

            // Listamos los ficheros dentro del directorio
            System.out.println("Listar ficheros");
            for (Path path : Files.newDirectoryStream(directory)) {
                System.out.println(path.getFileName().toString());
            }

        } catch (IOException ex) {
            Logger.getLogger(App.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
