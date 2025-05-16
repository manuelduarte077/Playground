class Rectangulo {
    private double alto;
    private double ancho;

    Rectangulo(double alto, double ancho) {
        this.alto = alto;
        this.ancho = ancho;
    }

    public double getAncho() {
        return ancho;
    }

    public void setAncho(double ancho) {
        this.ancho = ancho;
    }

    public double getAlto() {
        return alto;
    }

    public void setAlto(double alto) {
        this.alto = alto;
    }

    public double calcularArea() {
        return this.ancho * this.alto;
    }

    public double calcularPerimetro() {
        return 2 * (this.ancho + this.alto);
    }
}


public class Ejercicio2 {
    public static void main(String[] args) {
        Rectangulo miRectangulo = new Rectangulo(5.0, 10.0);

        System.out.println("Rectángulo creado:");
        System.out.println("Ancho: " + miRectangulo.getAncho());
        System.out.println("Alto: " + miRectangulo.getAlto());
        System.out.println("Área: " + miRectangulo.calcularArea());
        System.out.println("Perímetro: " + miRectangulo.calcularPerimetro());

        miRectangulo.setAncho(7.0);
        System.out.println("\nRectángulo modificado:");
        System.out.println("Nueva Área: " + miRectangulo.calcularArea());
        System.out.println("Nuevo Perímetro: " + miRectangulo.calcularPerimetro());
    }
}
