package dev.donmanuel.app.factorymethod;

import dev.donmanuel.app.factorymethod.factory.VehiculoFactory;
import dev.donmanuel.app.models.Car;
import dev.donmanuel.app.normal.Vehiculo;

public class CarFactory extends VehiculoFactory {

    @Override
    public Vehiculo createVehiculo() {
        return new Car();
    }

}
