package Empleado;

public class Desarrollador extends Empleado {
    private int horasExtra;
    private double tarifaHoraExtra;

    public Desarrollador(String nombre, double salarioBase, int horasExtra, double tarifaHoraExtra) {
        super(nombre, salarioBase);
        this.horasExtra = horasExtra >= 0 ? horasExtra : 0;
        this.tarifaHoraExtra = tarifaHoraExtra > 0 ? tarifaHoraExtra : 0;
    }

    public int getHorasExtra() {
        return horasExtra;
    }

    public void setHorasExtra(int horasExtra) {
        if (horasExtra >= 0) {
            this.horasExtra = horasExtra;
        }
    }

    public double getTarifaHoraExtra() {
        return tarifaHoraExtra;
    }

    public void setTarifaHoraExtra(double tarifaHoraExtra) {
        if (tarifaHoraExtra > 0) {
            this.tarifaHoraExtra = tarifaHoraExtra;
        }
    }

    @Override
    public double calcularSalario() {
        return super.calcularSalario() + (horasExtra * tarifaHoraExtra);
    }

    @Override
    public void mostrarDetalles() {
        System.out.println("Cargo: Desarrollador");
        super.mostrarDetalles();
        System.out.println("Horas Extra: " + horasExtra);
        System.out.println("Tarifa Hora Extra: $" + tarifaHoraExtra);
        System.out.println("Salario Final (con horas extra): $" + calcularSalario());
    }
}
