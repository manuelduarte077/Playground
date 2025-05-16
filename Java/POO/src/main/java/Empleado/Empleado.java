package Empleado;

public class Empleado {
    protected String nombre;
    protected double salarioBase;

    public Empleado(String nombre, double salarioBase) {
        this.nombre = nombre;
        this.salarioBase = salarioBase > 0 ? salarioBase : 0;
    }

    public String getNombre() {
        return nombre;
    }

    public double getSalarioBase() {
        return salarioBase;
    }

    public void setSalarioBase(double salarioBase) {
        if (salarioBase > 0) {
            this.salarioBase = salarioBase;
        }
    }

    public double calcularSalario() {
        return salarioBase;
    }

    public void mostrarDetalles() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Salario Base: " + salarioBase);
        System.out.println("Salario Calculado: $" + calcularSalario());
    }

}
