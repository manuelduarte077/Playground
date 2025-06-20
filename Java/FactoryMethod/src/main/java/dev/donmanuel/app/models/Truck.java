package dev.donmanuel.app.models;

import dev.donmanuel.app.normal.Vehiculo;

public class Truck implements Vehiculo {

    @Override
    public void start() {
        System.out.println("Truck starting...");
    }
    @Override
    public void stop() {
        System.out.println("Truck stoping...");
    }

}
