package Examples.Herencia.Vehiculo;

public class Main {
    public static void main(String[] args) {
        Coche coche = new Coche("Toyota", "Corolla", 4);
        Motocicleta moto = new Motocicleta("Yamaha", "MT-07", true);

        coche.mostrarInformacion();
        moto.mostrarInformacion();
    }
}
