package DesignPatterns.Observer;

public class Main {
    public static void main(String[] args) {
        // Crear un canal observable
        CanalDeNotificaciones canal = new CanalDeNotificaciones();

        // Crear usuarios (observadores)
        Usuario usuario1 = new Usuario("Ana");
        Usuario usuario2 = new Usuario("Pedro");

        // Suscribir los usuarios al canal de notificaciones
        canal.addObserver(usuario1);
        canal.addObserver(usuario2);

        // Enviar una nueva notificación
        canal.nuevoMensaje("¡Nuevo mensaje disponible!");

        // Otro Mensaje
        canal.nuevoMensaje("Descuento en tus compras hoy");
    }
}
