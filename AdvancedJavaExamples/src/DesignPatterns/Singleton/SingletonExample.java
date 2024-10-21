package DesignPatterns.Singleton;

public class SingletonExample {
    // Instancia única de la clase (inicializada perezosamente)
    private static SingletonExample instanciaUnica;

    // Constructor privado para evitar la creación de instancias desde fuera
    private SingletonExample() {
        System.out.println("Instancia de Singleton creada");
    }

    // Método público para obtener la instancia única de la clase
    public static synchronized SingletonExample obtenerInstancia() {
        if (instanciaUnica == null) {
            instanciaUnica = new SingletonExample();
        }
        return instanciaUnica;
    }

    public void mostrarMensaje() {
        System.out.println("Este es un mensaje de la instancia Singleton");
    }
}

