package dev.donmanuel.app.models;

import dev.donmanuel.app.normal.Vehiculo;

public class Plane implements Vehiculo {

    @Override
    public void start() {
        System.out.println("Plane starting...");
    }

    @Override
    public void stop() {
        System.out.println("Plane stoping...");
    }


    public void fly() {
        System.out.println("Take off the plane...");
    }

}
