package FiguraGeometrica;

public class Cuadrado extends FiguraGeometrica {
    private double lado;

    public Cuadrado(String nombre, double lado) {
        super(nombre);

        if (lado < 0) {
            this.lado = lado;
        } else {
            this.lado = 0;
            System.out.println("El lado debe ser positivo");
        }
    }

    public double getLado() {
        return lado;
    }

    @Override
    public double calcularArea() {
        return lado * lado;
    }
}
