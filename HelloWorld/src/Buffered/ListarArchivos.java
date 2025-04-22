package Buffered;

import java.io.File;

public class ListarArchivos {
    public static void main(String[] args) {

        File folder = new File("nuevaCarpeta");
        String[] files = folder.list();

        if (files != null) {
            for (String name : files) {
                System.out.println(name);
            }
        } else {
            System.out.println("No se puede listar los archivos");
        }

    }
}
