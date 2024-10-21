package Examples.Polimorfismo.FiguraGeometrica;

public class Main {
    public static void main(String[] args) {
        Circulo circulo = new Circulo(5);
        Cuadrado cuadrado = new Cuadrado(4);
        Triangulo triangulo = new Triangulo(3, 4);

        circulo.mostrarInformacion();
        cuadrado.mostrarInformacion();
        triangulo.mostrarInformacion();
    }
}
