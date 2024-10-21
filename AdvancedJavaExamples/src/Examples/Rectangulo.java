package Examples;

public class Rectangulo {
    private double ancho;
    private double alto;

    // Constructor
    public Rectangulo(double ancho, double alto) {
        this.ancho = ancho;
        this.alto = alto;
    }

    // Metodo para calcular el área
    public double calcularArea() {
        return ancho * alto;
    }

    // Metodo para calcular el perímetro
    public double calcularPerimetro() {
        return 2 * (ancho + alto);
    }

    // Metodo para mostrar la información del rectángulo
    public void mostrarInformacion() {
        System.out.println("Ancho: " + ancho + ", Alto: " + alto);
        System.out.println("Área: " + calcularArea());
        System.out.println("Perímetro: " + calcularPerimetro());
    }

    public static void main(String[] args) {
        Rectangulo rectangulo1 = new Rectangulo(5, 10); // Crear un rectángulo con ancho 5 y alto 10

        rectangulo1.mostrarInformacion(); // Mostrar la información del rectángulo,
    }
}
