package Buffered;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/**
 * Lee un archivo de texto línea por línea utilizando BufferedReader.
 */

public class LeerConBufferedReader {
    public static void main(String[] args) {
        try (BufferedReader reader = new BufferedReader(new FileReader("example.txt"))) {
            String line;

            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }

        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }
}
