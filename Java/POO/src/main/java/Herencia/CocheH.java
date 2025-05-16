package Herencia;

public class CocheH extends Vehiculo {
    private int numeroDePuertas;
    private int velocidadActual;

    public CocheH(String marca, String modelo, int numeroDePuertas) {
        super(marca, modelo);
        this.numeroDePuertas = numeroDePuertas;
        this.velocidadActual = 0;
    }

    public int getNumeroDePuertas() {
        return numeroDePuertas;
    }

    public int getVelocidadActual() {
        return velocidadActual;
    }

    public void acelerar(int incremento) {
        if (incremento > 0) {
            this.velocidadActual += incremento;
            System.out.println("El coche " + marca + " " + modelo + " aceleró a " + this.velocidadActual + " km/h.");
        }
    }

    public void frenar(int decremento) {
        if (decremento > 0) {
            this.velocidadActual -= decremento;
            if (this.velocidadActual < 0) {
                this.velocidadActual = 0;
            }
            System.out.println("El coche " + marca + " " + modelo + " frenó a " + this.velocidadActual + " km/h.");
        }
    }

    @Override // Anotación para indicar que se sobrescribe un método de la clase padre
    public void arrancar() {
        // super.arrancar(); // Opcionalmente, llamar al método del padre
        System.out.println("El coche " + marca + " " + modelo + " con " + numeroDePuertas + " puertas ha arrancado (método sobrescrito).");
    }

    public void mostrarInfoCoche() {
        System.out.println("Coche: " + getMarca() + " " + getModelo() + ", Puertas: " + numeroDePuertas);
    }
}
