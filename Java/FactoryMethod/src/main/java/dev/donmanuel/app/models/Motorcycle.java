package dev.donmanuel.app.models;

import dev.donmanuel.app.normal.Vehiculo;

public class Motorcycle implements Vehiculo {
    @Override
    public void start() {
        System.out.println("Motorcycle starting...");
    }
    @Override
    public void stop() {
        System.out.println("Motorcycle stoping...");
    }

}
