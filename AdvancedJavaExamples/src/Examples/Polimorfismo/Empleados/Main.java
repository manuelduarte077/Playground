package Examples.Polimorfismo.Empleados;

public class Main {
    public static void main(String[] args) {
        Gerente gerente = new Gerente("Laura", 5000);
        Obrero obrero = new Obrero("Pedro", 3000, 15);

        gerente.asignarBono(1000);
        gerente.mostrarInformacion();

        obrero.mostrarInformacion();
    }
}
