package dev.donmanuel.app.factorymethod;

import dev.donmanuel.app.factorymethod.factory.VehiculoFactory;
import dev.donmanuel.app.models.Motorcycle;
import dev.donmanuel.app.normal.Vehiculo;

public class MotorcycleFactory extends VehiculoFactory {

    @Override
    public Vehiculo createVehiculo() {
        return new Motorcycle();
    }
}
