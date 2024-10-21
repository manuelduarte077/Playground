package Examples;

public class Circulo {
    private double radio;

    // Constructor
    public Circulo(double radio) {
        this.radio = radio;
    }

    // Metodo para calcular el área
    public double calcularArea() {
        return Math.PI * Math.pow(radio, 2);
    }

    // Metodo para calcular el perímetro
    public double calcularPerimetro() {
        return 2 * Math.PI * radio;
    }

    // Metodo para mostrar la información del círculo
    public void mostrarInformacion() {
        System.out.println("Radio: " + radio);
        System.out.println("Área: " + calcularArea());
        System.out.println("Perímetro: " + calcularPerimetro());
    }

    public static void main(String[] args) {
        Circulo circulo = new Circulo(7);

        circulo.mostrarInformacion();
    }
}
