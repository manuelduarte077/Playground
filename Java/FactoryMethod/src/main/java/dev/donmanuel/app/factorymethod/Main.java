package dev.donmanuel.app.factorymethod;

import dev.donmanuel.app.normal.Vehiculo;

public class Main {
    public static void main(String[] args) {

        Vehiculo car = new CarFactory().createVehiculo();
        car.start();

        Vehiculo plane = new PlaneFactory().createVehiculo();
        plane.start();

        Vehiculo truck = new TruckFactory().createVehiculo();
        truck.start();

        Vehiculo motorcycle = new MotorcycleFactory().createVehiculo();
        motorcycle.start();

    }
}
