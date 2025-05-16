package Empleado;

public class Gerente extends Empleado {
    private double bono;

    public Gerente(String nombre, double salarioBase, double bono) {
        super(nombre, salarioBase);
        this.bono = bono > 0 ? bono : 0;
    }

    public double getBono() {
        return bono;
    }

    public void setBono(double bono) {
        if (bono > 0) {
            this.bono = bono;
        }
    }

    @Override
    public double calcularSalario() {
        return super.calcularSalario() + bono; // Salario base del empleado + bono
        // o podría ser: return this.salarioBase + bono;
    }

    @Override
    public void mostrarDetalles() {
        System.out.println("Cargo: Gerente");
        super.mostrarDetalles(); // Llama al mostrarDetalles de Empleado
        System.out.println("Bono: $" + bono);
        System.out.println("Salario Final (con bono): $" + calcularSalario());
    }
}
