package Examples.Herencia.Empleado;

// Clase base Empleado
class Empleado {
    protected String nombre;
    protected double sueldo;

    // Constructor
    public Empleado(String nombre, double sueldo) {
        this.nombre = nombre;
        this.sueldo = sueldo;
    }

    // Método para mostrar la información del empleado
    public void mostrarInformacion() {
        System.out.println("Nombre: " + nombre + ", Sueldo: " + sueldo);
    }

    // Método para calcular el sueldo (puede ser sobrescrito)
    public double calcularSueldo() {
        return sueldo;
    }
}

// Clase Gerente (hereda de Empleado)
class Gerente extends Empleado {
    private double bono;

    public Gerente(String nombre, double sueldo, double bono) {
        super(nombre, sueldo);
        this.bono = bono;
    }

    // Método sobrescrito para calcular el sueldo con el bono
    @Override
    public double calcularSueldo() {
        return sueldo + bono; // El sueldo del gerente es el sueldo base más el bono
    }

    @Override
    public void mostrarInformacion() {
        super.mostrarInformacion(); // Llama al metodo de la clase base
        System.out.println("Bono: " + bono);
    }
}

// Clase Obrero (hereda de Empleado)
class Obrero extends Empleado {
    private int horasExtra;

    // Constructor
    public Obrero(String nombre, double sueldo, int horasExtra) {
        super(nombre, sueldo);
        this.horasExtra = horasExtra;
    }

    // Método sobrescrito para calcular el sueldo con horas extras
    @Override
    public double calcularSueldo() {
        return sueldo + (horasExtra * 10); // Supongamos que cada hora extra vale 10
    }

    @Override
    public void mostrarInformacion() {
        super.mostrarInformacion();
        System.out.println("Horas extra: " + horasExtra);
    }
}

