package FiguraGeometrica;

public class Circulo extends FiguraGeometrica {
    private double radio;

    public Circulo(String nombre, double radio) {
        super(nombre);

        if (radio > 0) {
            this.radio = radio;
        } else {
            this.radio = 0;
            System.out.println("El radio debe ser positivo");
        }
    }

    public double getRadio() {
        return radio;
    }

    @Override
    public double calcularArea() {
        return Math.PI * radio * radio;
    }
}
