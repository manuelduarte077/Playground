package Serializacion;

import java.util.ArrayList;
import java.util.List;

import static Serializacion.SerializacionEjemplo.guardarEmpleadosEnArchivo;
import static Serializacion.SerializacionEjemplo.leerEmpleadosDesdeArchivo;

public class Main {
    public static void main(String[] args) {
        // Crear una lista de empleados
        List<Empleado> empleados = new ArrayList<>();
        empleados.add(new Empleado("Ana", 30, 4000));
        empleados.add(new Empleado("Pedro", 40, 5000));
        empleados.add(new Empleado("Luis", 35, 4500));

        // Archivo donde se guardará la lista serializada
        String nombreArchivo = "empleados.dat";

        // 1. Guardar (serializar) la lista de empleados en un archivo
        guardarEmpleadosEnArchivo(empleados, nombreArchivo);

        // 2. Leer (deserializar) la lista de empleados desde el archivo
        List<Empleado> empleadosLeidos = leerEmpleadosDesdeArchivo(nombreArchivo);

        // Mostrar la lista deserializada
        System.out.println("Empleados leídos desde el archivo:");
        if (empleadosLeidos != null) {
            for (Empleado empleado : empleadosLeidos) {
                System.out.println(empleado);
            }
        }
    }
}
