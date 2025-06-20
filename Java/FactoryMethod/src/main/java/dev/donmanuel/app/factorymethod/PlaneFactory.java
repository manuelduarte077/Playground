package dev.donmanuel.app.factorymethod;

import dev.donmanuel.app.factorymethod.factory.VehiculoFactory;
import dev.donmanuel.app.models.Plane;
import dev.donmanuel.app.normal.Vehiculo;

public class PlaneFactory extends VehiculoFactory {
    @Override
    public Vehiculo createVehiculo() {
        return new Plane();
    }
}
