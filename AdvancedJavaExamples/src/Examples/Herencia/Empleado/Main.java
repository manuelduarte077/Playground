package Examples.Herencia.Empleado;

public class Main {
    public static void main(String[] args) {
        Gerente gerente = new Gerente("Ana", 5000, 1000);
        Obrero obrero = new Obrero("Juan", 3000, 10);

        gerente.mostrarInformacion();
        System.out.println("Sueldo total: " + gerente.calcularSueldo());

        obrero.mostrarInformacion();
        System.out.println("Sueldo total: " + obrero.calcularSueldo());
    }
}
