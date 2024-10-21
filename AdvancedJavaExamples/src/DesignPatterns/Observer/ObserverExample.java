package DesignPatterns.Observer;

import java.util.Observable;
import java.util.Observer;

// Clase que extiende Observable
class CanalDeNotificaciones extends Observable {
    private String mensaje;

    public void nuevoMensaje(String mensaje) {
        this.mensaje = mensaje;
        setChanged();  // Marcar que el estado ha cambiado
        notifyObservers(mensaje);  // Notificar a los observadores
    }
}

// Clase que implementa Observer
class Usuario implements Observer {
    private String nombre;

    public Usuario(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public void update(Observable o, Object arg) {
        System.out.println(nombre + " ha recibido una notificación: " + arg);
    }
}