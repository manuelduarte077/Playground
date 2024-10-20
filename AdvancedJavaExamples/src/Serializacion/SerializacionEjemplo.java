package Serializacion;

import java.io.*;
import java.util.List;

public class SerializacionEjemplo {
    // Metodo para serializar (guardar) una lista de empleados en un archivo
    public static void guardarEmpleadosEnArchivo(List<Empleado> empleados, String nombreArchivo) {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(nombreArchivo))) { // Crear un ObjectOutputStream
            oos.writeObject(empleados); // Guardar la lista de empleados en el archivo
            System.out.println("Lista de empleados guardada en el archivo: " + nombreArchivo);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    // Metodo para deserializar (leer) una lista de empleados desde un archivo
    public static List<Empleado> leerEmpleadosDesdeArchivo(String nombreArchivo) {
        List<Empleado> empleados = null;
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(nombreArchivo))) {
            empleados = (List<Empleado>) ois.readObject();
            System.out.println("Lista de empleados leída exitosamente desde " + nombreArchivo);
            System.out.println("Empleados leídos: " + empleados.size());
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
        return empleados;
    }

}
