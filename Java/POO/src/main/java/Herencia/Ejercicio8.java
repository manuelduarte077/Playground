package Herencia;

public class Ejercicio8 {
    public static void main(String[] args) {
        Vehiculo vehiculoGenerico = new Vehiculo("Genérico", "V1");
        vehiculoGenerico.arrancar();
        vehiculoGenerico.detener();

        System.out.println();

        CocheH miCoche = new CocheH("Toyota", "RAV4", 5);
        miCoche.mostrarInfoCoche();
        miCoche.arrancar(); // Llama al arrancar() de CocheH
        miCoche.acelerar(60);
        miCoche.detener(); // Llama al detener() de Vehiculo (no sobrescrito)

        System.out.println();

        Motocicleta miMoto = new Motocicleta("Honda", "CBR500R", 500, "Deportivo");
        miMoto.mostrarInfoMoto();
        miMoto.arrancar(); // Llama al arrancar() de Motocicleta
        miMoto.hacerCaballito();
        miMoto.detener();
    }
}
