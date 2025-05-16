package FiguraGeometrica;

public class RectanguloFigura extends FiguraGeometrica {
    private double base;
    private double altura;

    public RectanguloFigura(String nombre,double base, double altura) {
        super(nombre);
        this.base = base > 0 ? base : 0;
        this.altura = altura > 0 ? altura : 0;
    }

    public double getBase() {
        return base;
    }

    public double getAltura() {
        return altura;
    }

    @Override
    public double calcularArea() {
        return base * altura;
    }
}
