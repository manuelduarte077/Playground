package Examples.Polimorfismo.Empleados;

// Interfaz Bonificable
interface Bonificable {
    void asignarBono(double bono);

    double obtenerSueldoTotal();
}

// Clase base Empleado
class Empleado {
    protected String nombre;
    protected double sueldo;

    public Empleado(String nombre, double sueldo) {
        this.nombre = nombre;
        this.sueldo = sueldo;
    }

    public void mostrarInformacion() {
        System.out.println("Empleado: " + nombre + ", Sueldo: " + sueldo);
    }

    public double calcularSueldo() {
        return sueldo;
    }
}

// Clase Gerente (hereda de Empleado e implementa Bonificable)
class Gerente extends Empleado implements Bonificable {
    private double bono;

    public Gerente(String nombre, double sueldo) {
        super(nombre, sueldo);
        this.bono = 0;
    }

    @Override
    public void asignarBono(double bono) {
        this.bono = bono;
    }

    @Override
    public double obtenerSueldoTotal() {
        return sueldo + bono;
    }

    @Override
    public void mostrarInformacion() {
        super.mostrarInformacion();
        System.out.println("Sueldo total con bono: " + obtenerSueldoTotal());
    }
}

// Clase Obrero (hereda de Empleado)
class Obrero extends Empleado {
    private int horasExtra;

    public Obrero(String nombre, double sueldo, int horasExtra) {
        super(nombre, sueldo);
        this.horasExtra = horasExtra;
    }

    public double calcularSueldoConHorasExtra() {
        return sueldo + (horasExtra * 10); // Suponemos que cada hora extra vale 10
    }

    @Override
    public void mostrarInformacion() {
        super.mostrarInformacion();
        System.out.println("Sueldo con horas extra: " + calcularSueldoConHorasExtra());
    }
}

