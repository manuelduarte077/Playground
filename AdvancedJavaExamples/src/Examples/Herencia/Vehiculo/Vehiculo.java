package Examples.Herencia.Vehiculo;

// Clase base Vehículo
class Vehiculo {
    protected String marca;
    protected String modelo;

    // Constructor
    public Vehiculo(String marca, String modelo) {
        this.marca = marca;
        this.modelo = modelo;
    }

    // Método para mostrar la información del vehículo
    public void mostrarInformacion() {
        System.out.println("Marca: " + marca + ", Modelo: " + modelo);
    }
}

// Clase Coche (hereda de Vehículo)
class Coche extends Vehiculo {
    private int puertas;

    public Coche(String marca, String modelo, int puertas) {
        super(marca, modelo);
        this.puertas = puertas;
    }

    // Método sobrescrito
    @Override
    public void mostrarInformacion() {
        super.mostrarInformacion();
        System.out.println("Puertas: " + puertas);
    }
}

// Clase Motocicleta (hereda de Vehículo)
class Motocicleta extends Vehiculo {
    private boolean tieneCasco;

    public Motocicleta(String marca, String modelo, boolean tieneCasco) {
        super(marca, modelo);
        this.tieneCasco = tieneCasco;
    }

    // Método sobrescrito
    @Override
    public void mostrarInformacion() {
        super.mostrarInformacion();
        System.out.println("¿Tiene casco?: " + (tieneCasco ? "Sí" : "No"));
    }
}

