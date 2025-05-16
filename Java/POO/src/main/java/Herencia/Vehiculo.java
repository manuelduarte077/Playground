package Herencia;

public class Vehiculo {
    protected String marca;
    protected String modelo;

    public Vehiculo(String marca, String modelo) {
        this.marca = marca;
        this.modelo = modelo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public void arrancar() {
        System.out.println("El vehículo " + marca + " " + modelo + " ha arrancado.");

    }

    public void detener() {
        System.out.println("El vehículo " + marca + " " + modelo + " se ha detenido.");
    }
}
