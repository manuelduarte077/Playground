package Examples.Polimorfismo.FiguraGeometrica;

// Clase base FiguraGeometrica
abstract class FiguraGeometrica {
    // Método abstracto para calcular el área
    public abstract double calcularArea();

    // Método abstracto para calcular el perímetro
    public abstract double calcularPerimetro();

    public void mostrarInformacion() {
        System.out.println("Área: " + calcularArea());
        System.out.println("Perímetro: " + calcularPerimetro());
    }
}

// Clase Círculo (hereda de FiguraGeometrica)
class Circulo extends FiguraGeometrica {
    private double radio;

    public Circulo(double radio) {
        this.radio = radio;
    }

    @Override
    public double calcularArea() {
        return Math.PI * Math.pow(radio, 2);
    }

    @Override
    public double calcularPerimetro() {
        return 2 * Math.PI * radio;
    }
}

// Clase Cuadrado (hereda de FiguraGeometrica)
class Cuadrado extends FiguraGeometrica {
    private double lado;

    public Cuadrado(double lado) {
        this.lado = lado;
    }

    @Override
    public double calcularArea() {
        return Math.pow(lado, 2);
    }

    @Override
    public double calcularPerimetro() {
        return 4 * lado;
    }
}

// Clase Triángulo (hereda de FiguraGeometrica)
class Triangulo extends FiguraGeometrica {
    private double base;
    private double altura;

    public Triangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }

    @Override
    public double calcularArea() {
        return (base * altura) / 2;
    }

    @Override
    public double calcularPerimetro() {
        // Suponemos un triángulo equilátero
        return 3 * base;
    }
}

