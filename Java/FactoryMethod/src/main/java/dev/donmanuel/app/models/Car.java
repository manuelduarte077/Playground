package dev.donmanuel.app.models;

import dev.donmanuel.app.normal.Vehiculo;

public class Car implements Vehiculo {
    @Override
    public void start() {
        System.out.println("Car starting...");
    }

    @Override
    public void stop() {
        System.out.println("Car stoping...");
    }
}
