package Encapsulamiento;

class CuentaBancariaEncapsulada {
    // Atributos privados
    private String numeroDeCuenta; // Solo se asigna en constructor, solo get
    private double saldo;         // Se modifica con depositar/retirar, solo get
    private String titular;       // Get y Set

    // Constructor
    public CuentaBancariaEncapsulada(String numeroDeCuenta, String titular, double saldoInicial) {
        this.numeroDeCuenta = numeroDeCuenta;
        this.titular = titular;
        if (saldoInicial >= 0) {
            this.saldo = saldoInicial;
        } else {
            this.saldo = 0;
            System.out.println("El saldo inicial no puede ser negativo. Se estableció a 0.");
        }
    }

    // Métodos Get
    public String getNumeroDeCuenta() {
        return numeroDeCuenta;
    }

    public double getSaldo() {
        return saldo;
    }

    public String getTitular() {
        return titular;
    }

    // Método Set para titular
    public void setTitular(String titular) {
        this.titular = titular;
    }

    // Método para depositar dinero
    public void depositar(double cantidad) {
        if (cantidad > 0) {
            this.saldo += cantidad;
            System.out.println("Depósito de $" + cantidad + " realizado. Saldo actual: $" + this.saldo);
        } else {
            System.out.println("La cantidad a depositar debe ser positiva.");
        }
    }

    // Método para retirar dinero
    public void retirar(double cantidad) {
        if (cantidad > 0) {
            if (this.saldo >= cantidad) {
                this.saldo -= cantidad;
                System.out.println("Retiro de $" + cantidad + " realizado. Saldo actual: $" + this.saldo);
            } else {
                System.out.println("Saldo insuficiente. No se puede retirar $" + cantidad);
            }
        } else {
            System.out.println("La cantidad a retirar debe ser positiva.");
        }
    }

    // Método para consultar información (ya no se llama consultarSaldo para evitar confusión con el getter)
    public void mostrarInformacionCuenta() {
        System.out.println("Titular: " + this.titular);
        System.out.println("Número de Cuenta: " + this.numeroDeCuenta);
        System.out.println("Saldo disponible: $" + this.saldo);
    }
}

public class Ejercicio6 {
    public static void main(String[] args) {
        CuentaBancariaEncapsulada miCuenta = new CuentaBancariaEncapsulada("987654321", "Laura Pausini", 2000.00);
        miCuenta.mostrarInformacionCuenta();

        System.out.println("\nTitular actual: " + miCuenta.getTitular());
        miCuenta.setTitular("Laura Pausini de Incognito");
        System.out.println("Nuevo titular: " + miCuenta.getTitular());

        // No podemos hacer esto directamente:
        // miCuenta.saldo = 50000; // Error: saldo has private access
        // miCuenta.numeroDeCuenta = "1111"; // Error: numeroDeCuenta has private access

        miCuenta.depositar(300.00);
        miCuenta.retirar(100.00);

        System.out.println("\nInformación final de la cuenta:");
        miCuenta.mostrarInformacionCuenta();
        System.out.println("Saldo obtenido con getSaldo(): $" + miCuenta.getSaldo());
        System.out.println("Número de cuenta con getNumeroDeCuenta(): " + miCuenta.getNumeroDeCuenta());
    }
}