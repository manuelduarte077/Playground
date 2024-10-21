package DesignPatterns.Factory;

public class Main {
    public static void main(String[] args) {
        // Crear autos usando la fábrica
        Auto sedan = FabricaDeAutos.crearAuto("Sedan"); // Se crea un Sedan
        Auto suv = FabricaDeAutos.crearAuto("SUV"); // Se crea un SUV

        // Usar los autos
        sedan.conducir();
        suv.conducir();
    }
}
