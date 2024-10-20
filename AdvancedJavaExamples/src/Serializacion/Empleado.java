package Serializacion;

import java.io.Serializable;

public class Empleado implements Serializable {
    private static final long serialVersionUID = 1L; // Identificador de la version de la clase
    private String nombre;
    private int edad;
    private double salario;

    public Empleado(String nombre, int edad, double salario) {
        this.nombre = nombre;
        this.edad = edad;
        this.salario = salario;
    }

    @Override
    public String toString() { // Method to display the object
        return "Empleado{" + "nombre=" + nombre + ", edad=" + edad + ", salario=" + salario + '}';
    }
}
