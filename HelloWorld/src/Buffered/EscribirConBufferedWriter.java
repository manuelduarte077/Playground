package Buffered;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class EscribirConBufferedWriter {
    public static void main(String[] args) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter("exampleBuffer.txt"))) {

            writer.write("Hello World");
            writer.write(System.lineSeparator());
            writer.write("Este es un ejemplo de BufferedWriter");
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }
}
