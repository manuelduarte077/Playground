package Empleado;

public class Ejercicio10 {
    public static void main(String[] args) {
        Empleado emp1 = new Empleado("Juan Pérez (Empleado Genérico)", 1500);
        emp1.mostrarDetalles();
        System.out.println("------------------------------");

        Gerente gerente1 = new Gerente("Ana Gómez", 3000, 500);
        gerente1.mostrarDetalles();
        System.out.println("------------------------------");

        Desarrollador dev1 = new Desarrollador("Carlos López", 2200, 10, 25);
        dev1.mostrarDetalles();
        System.out.println("------------------------------");

        // Cambiando datos
        System.out.println("Actualizando datos del desarrollador...");
        dev1.setHorasExtra(15);
        dev1.setSalarioBase(2300); // Usando el setter de la clase Empleado
        dev1.mostrarDetalles();
    }
}
