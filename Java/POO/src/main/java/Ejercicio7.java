import java.util.ArrayList;
import java.util.List;

class Estudiante {
    private final String nombre;
    private List<Double> calificaciones;

    Estudiante(String nombre) {
        this.nombre = nombre;
        this.calificaciones = new ArrayList<>();
    }

    public String getNombre() {
        return nombre;
    }

    // Metodo para agregar calificaciones
    public void agregarCalificacion(double calificacion) {
        if (calificacion >= 0 && calificacion <= 10) {
            this.calificaciones.add(calificacion);
            System.out.println("Calificación " + calificacion + " agregada para " + this.nombre);
        } else {
            System.out.println("Calificacion no valida para " + this.nombre + "Debe de estar entre 0 y 10");
        }
    }

    // Método para obtener el promedio
    public double obtenerPromedio() {
        if (calificaciones.isEmpty()) {
            System.out.println(this.nombre + " no tiene calificaciones registradas.");
            return 0.0;
        }
        double suma = 0;
        for (double cal : calificaciones) {
            suma += cal;
        }
        return suma / calificaciones.size();
    }

    // Método para mostrar calificaciones (opcional)
    public void mostrarCalificaciones() {
        System.out.println("Calificaciones de " + this.nombre + ":");
        if (calificaciones.isEmpty()) {
            System.out.println("Sin calificaciones.");
            return;
        }
        for (int i = 0; i < calificaciones.size(); i++) {
            System.out.println(" - Calificación " + (i + 1) + ": " + calificaciones.get(i));
        }
    }
}

public class Ejercicio7 {
    public static void main(String[] args) {
        Estudiante estudiante1 = new Estudiante("Mario Casas");

        System.out.println("Estudiante: " + estudiante1.getNombre());

        estudiante1.agregarCalificacion(8.5);
        estudiante1.agregarCalificacion(9.0);
        estudiante1.agregarCalificacion(7.8);
        estudiante1.agregarCalificacion(11.0); // Calificación inválida
        estudiante1.agregarCalificacion(-2.0); // Calificación inválida

        estudiante1.mostrarCalificaciones();
        System.out.printf("Promedio de %s: %.2f\n", estudiante1.getNombre(), estudiante1.obtenerPromedio());

        Estudiante estudiante2 = new Estudiante("Luisa Perez");
        System.out.println("\nEstudiante: " + estudiante2.getNombre());
        System.out.printf("Promedio de %s: %.2f\n", estudiante2.getNombre(), estudiante2.obtenerPromedio());
        estudiante2.agregarCalificacion(10.0);
        System.out.printf("Promedio de %s: %.2f\n", estudiante2.getNombre(), estudiante2.obtenerPromedio());
    }
}
