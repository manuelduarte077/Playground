package Examples;

public class Coche {
    private String marca;
    private String modelo;
    private int year;
    private String color;
    private boolean arrancado;

    // Constructor
    public Coche(String marca, String modelo, int year, String color) {
        this.marca = marca;
        this.modelo = modelo;
        this.year = year;
        this.color = color;
        this.arrancado = false;
    }

    // Metodo para arrancar el coche
    public void arrancar() {
        if (!arrancado) {
            arrancado = true;
            System.out.println("El coche ha sido arrancado.");
        } else {
            System.out.println("El coche ya está arrancado.");
        }
    }

    // Metodo para detener el coche
    public void detener() {
        if (arrancado) {
            arrancado = false;
            System.out.println("El coche ha sido detenido.");
        } else {
            System.out.println("El coche ya está detenido.");
        }
    }

    // Método para mostrar el estado del coche
    public void mostrarEstado() {
        System.out.println("Marca: " + marca + ", Modelo: " + modelo + ", Año: " + year + ", Color: " + color);
        System.out.println("Estado: " + (arrancado ? "Arrancado" : "Detenido"));
    }

    public static void main(String[] args) {
        Coche coche1 = new Coche("Toyota", "Corolla", 2020, "Rojo");

        coche1.mostrarEstado();
        coche1.arrancar();
        coche1.mostrarEstado();
        coche1.detener();
        coche1.mostrarEstado();
    }
}
