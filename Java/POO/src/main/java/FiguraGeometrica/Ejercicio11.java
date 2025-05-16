package FiguraGeometrica;

/*
    Enunciado:

    Crea un array o ArrayList de FiguraGeometrica.
    Añade objetos de tipo Circulo y Cuadrado (y RectanguloFigura si lo creaste) a la lista.
    Recorre la lista y llama al método calcularArea() de cada figura, demostrando el polimorfismo.
 */

import java.util.ArrayList;
import java.util.List;

class DemostracionPolimorfismoFiguras {
    public static void main(String[] args) {
        // Crear una lista de FiguraGeometrica
        List<FiguraGeometrica> figuras = new ArrayList<>();

        // Añadir diferentes tipos de figuras (objetos de subclases)
        figuras.add(new Circulo("Círculo A", 7.0));
        figuras.add(new Cuadrado("Cuadrado B", 5.0));
        figuras.add(new RectanguloFigura("Rectángulo C", 4.0, 8.0));
        figuras.add(new Circulo("Círculo D", 3.5));
        figuras.add(new Cuadrado("Cuadrado E", 10.0));

        System.out.println("Calculando áreas de diversas figuras (Polimorfismo):\n");

        // Recorrer la lista y llamar a calcularArea()
        // Java determina en tiempo de ejecución qué versión de calcularArea() llamar
        for (FiguraGeometrica figura : figuras) {
            figura.mostrarNombre(); // Método de la clase base
            // Aquí ocurre el polimorfismo:
            // Se llama al método calcularArea() específico de la clase del objeto actual (Circulo, Cuadrado, etc.)
            System.out.printf("Área: %.2f\n", figura.calcularArea());

            // También podemos verificar el tipo si necesitamos hacer algo específico de la subclase
            if (figura instanceof Circulo) {
                Circulo c = (Circulo) figura; // Downcasting seguro después de instanceof
                System.out.printf("  (Detalle Círculo) Radio: %.2f\n", c.getRadio());
            } else if (figura instanceof Cuadrado) {
                Cuadrado q = (Cuadrado) figura;
                System.out.printf("  (Detalle Cuadrado) Lado: %.2f\n", q.getLado());
            } else if (figura instanceof RectanguloFigura) {
                RectanguloFigura r = (RectanguloFigura) figura;
                System.out.printf("  (Detalle Rectángulo) Base: %.2f, Altura: %.2f\n", r.getBase(), r.getAltura());
            }

            System.out.println("--------------------");
        }
    }
}