package Examples;

public class Empleado {
    private String nombre;
    private double sueldo;

    // Constructor
    public Empleado(String nombre, double sueldo) {
        this.nombre = nombre;
        this.sueldo = sueldo;
    }

    // Metodo para aumentar el sueldo
    public void aumentarSueldo(double porcentaje) {
        sueldo += sueldo * (porcentaje / 100);
    }

    // Metodo para mostrar la información del empleado
    public void mostrarInformacion() {
        System.out.println("Nombre: " + nombre + ", Sueldo: " + sueldo);
    }

    public static void main(String[] args) {
        Empleado empleado1 = new Empleado("Juan", 1000);
        empleado1.mostrarInformacion();

        empleado1.mostrarInformacion();
        empleado1.aumentarSueldo(25); // Aumentar el sueldo en un 10%
        empleado1.mostrarInformacion();
    }
}
