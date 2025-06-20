package dev.donmanuel.app.factorymethod;

import dev.donmanuel.app.factorymethod.factory.VehiculoFactory;
import dev.donmanuel.app.models.Truck;
import dev.donmanuel.app.normal.Vehiculo;

public class TruckFactory extends VehiculoFactory {

    @Override
    public Vehiculo createVehiculo() {
        return new Truck();
    }
}
