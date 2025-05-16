class CuentaBancaria {
    // Atributos (en el ejercicio 6 se harán privados explícitamente para encapsulamiento)
    String numeroDeCuenta;
    double saldo;
    String titular;

    // Constructor
    public CuentaBancaria(String numeroDeCuenta, String titular, double saldoInicial) {
        this.numeroDeCuenta = numeroDeCuenta;
        this.titular = titular;
        this.saldo = saldoInicial;
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

    // Método para consultar saldo
    public double consultarSaldo() {
        System.out.println("Titular: " + this.titular);
        System.out.println("Número de Cuenta: " + this.numeroDeCuenta);
        System.out.println("Saldo disponible: $" + this.saldo);

        return this.saldo;
    }
}

public class Ejercicio4 {
    public static void main(String[] args) {
        CuentaBancaria miCuenta = new CuentaBancaria("123456789", "Carlos Ruiz", 1000.00);
        miCuenta.consultarSaldo();

        System.out.println();
        miCuenta.depositar(500.00);
        miCuenta.retirar(200.00);
        miCuenta.retirar(1500.00); // Intento de retirar más del saldo
        miCuenta.depositar(-50);   // Intento de depositar negativo

        System.out.println("\nSaldo final:");
        miCuenta.consultarSaldo();
    }
}