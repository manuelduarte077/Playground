package Examples;

import java.util.ArrayList;
import java.util.List;

// Clase Asignatura
class Asignatura {
    private String nombre;
    private double nota;

    // Constructor
    public Asignatura(String nombre, double nota) {
        this.nombre = nombre;
        this.nota = nota;
    }

    // Getters
    public String getNombre() {
        return nombre;
    }

    public double getNota() {
        return nota;
    }
}

// Clase Alumno
class Alumno {
    private String nombre;
    private int edad;
    private List<Asignatura> asignaturas;

    // Constructor
    public Alumno(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
        this.asignaturas = new ArrayList<>();
    }

    // Método para añadir una asignatura
    public void agregarAsignatura(Asignatura asignatura) {
        asignaturas.add(asignatura);
    }

    // Método para calcular la nota media
    public double calcularNotaMedia() {
        double suma = 0;
        for (Asignatura asignatura : asignaturas) {
            suma += asignatura.getNota();
        }
        return suma / asignaturas.size();
    }

    // Método para mostrar la información del alumno
    public void mostrarInformacion() {
        System.out.println("Alumno: " + nombre + ", Edad: " + edad);
        System.out.println("Asignaturas:");
        for (Asignatura asignatura : asignaturas) {
            System.out.println(asignatura.getNombre() + ": " + asignatura.getNota());
        }
        System.out.println("Nota media: " + calcularNotaMedia());
    }

    public static void main(String[] args) {
        Alumno alumno = new Alumno("María", 20);
        alumno.agregarAsignatura(new Asignatura("Matemáticas", 8.5));
        alumno.agregarAsignatura(new Asignatura("Historia", 7.0));
        alumno.agregarAsignatura(new Asignatura("Física", 9.0));

        alumno.mostrarInformacion();
    }
}