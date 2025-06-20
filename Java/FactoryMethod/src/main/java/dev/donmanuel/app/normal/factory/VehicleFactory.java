package dev.donmanuel.app.normal.factory;

import dev.donmanuel.app.normal.Vehiculo;
import dev.donmanuel.app.models.Car;
import dev.donmanuel.app.models.Motorcycle;
import dev.donmanuel.app.models.Plane;
import dev.donmanuel.app.models.Truck;

public class VehicleFactory {

    public Vehiculo createVehiculo(String typeOfVehicle) {

        if (typeOfVehicle.equalsIgnoreCase("car")) {
            return new Car();
        }

        if (typeOfVehicle.equalsIgnoreCase("Motorcycle")) {
            return new Motorcycle();
        }

        if (typeOfVehicle.equalsIgnoreCase("Truck")) {
            return new Truck();
        }

        if (typeOfVehicle.equalsIgnoreCase("Plane")) {
            return new Plane();
        }

        return null;
    }

}
