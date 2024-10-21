package DesignPatterns.Singleton;

public class Main {
    public static void main(String[] args) {
        // Intentamos obtener la instancia única de Singleton
        SingletonExample instancia1 = SingletonExample.obtenerInstancia();
        SingletonExample instancia2 = SingletonExample.obtenerInstancia();

        // Ambas instancias deben ser las mismas
        System.out.println(instancia1 == instancia2); // true

        // Usar el método de la instancia
        instancia1.mostrarMensaje();
    }
}
