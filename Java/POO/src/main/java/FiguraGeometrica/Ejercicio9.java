package FiguraGeometrica;

/*
    Enunciado:
    Crea una clase base FiguraGeometrica con un método abstracto calcularArea().
    Crea subclases como Circulo (con atributo radio) y Cuadrado (con atributo lado).
    Implementa el método calcularArea() en cada subclase.
 */

public class Ejercicio9 {
    public static void main(String[] args) {
        // FiguraGeometrica figura = new FiguraGeometrica("algo"); // Error: No se puede instanciar una clase abstracta

        Circulo miCirculo = new Circulo("Círculo Rojo", 12.0);
        Cuadrado miCuadrado = new Cuadrado("Cuadrado Azul", 9.0);
        RectanguloFigura miRectangulo = new RectanguloFigura("Rectángulo Verde", 6.0, 3.0);

        miCirculo.mostrarNombre();
        System.out.printf("Área del %s: %.2f\n", miCirculo.getNombre(), miCirculo.calcularArea());

        System.out.println();
        miCuadrado.mostrarNombre();
        System.out.printf("Área del %s: %.2f\n", miCuadrado.getNombre(), miCuadrado.calcularArea());

        System.out.println();
        miRectangulo.mostrarNombre();
        System.out.printf("Área del %s: %.2f\n", miRectangulo.getNombre(), miRectangulo.calcularArea());
    }
}
