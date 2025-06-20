package dev.donmanuel.app.normal;

import dev.donmanuel.app.normal.factory.VehicleFactory;

public class Main {
    public static void main(String[] args) {

        VehicleFactory vehicleFactory = new VehicleFactory();

        Vehiculo car = vehicleFactory.createVehiculo(TypeOfVehicle.CAR.name());
        car.start();

        Vehiculo truck = vehicleFactory.createVehiculo(TypeOfVehicle.TRUCK.name());
        truck.start();

        Vehiculo motorcycle = vehicleFactory.createVehiculo(TypeOfVehicle.MOTORCYCLE.name());
        motorcycle.start();

        Vehiculo plane = vehicleFactory.createVehiculo(TypeOfVehicle.PLANE.name());
        plane.start();

    }
}