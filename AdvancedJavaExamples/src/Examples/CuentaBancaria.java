package Examples;

// Clase CuentaBancaria
public class CuentaBancaria {
    private String numeroCuenta;
    private double saldo;
    private String titular;

    // Constructor
    public CuentaBancaria(String numeroCuenta, String titular, double saldoInicial) {
        this.numeroCuenta = numeroCuenta;
        this.titular = titular;
        this.saldo = saldoInicial;
    }

    // Método para depositar dinero
    public void depositar(double cantidad) {
        if (cantidad > 0) {
            saldo += cantidad;
            System.out.println("Se han depositado " + cantidad + " en la cuenta.");
        } else {
            System.out.println("La cantidad debe ser positiva.");
        }
    }

    // Método para retirar dinero
    public void retirar(double cantidad) {
        if (cantidad > 0 && cantidad <= saldo) {
            saldo -= cantidad;
            System.out.println("Se han retirado " + cantidad + " de la cuenta.");
        } else {
            System.out.println("No se puede retirar esa cantidad.");
        }
    }

    // Método para mostrar el saldo
    public void mostrarSaldo() {
        System.out.println("Titular: " + titular + ", Saldo: " + saldo);
    }

    public static void main(String[] args) {
        CuentaBancaria cuenta1 = new CuentaBancaria("123456789", "Laura", 1000);

        cuenta1.mostrarSaldo();
        cuenta1.depositar(500); // Deposita 500
        cuenta1.mostrarSaldo();
        cuenta1.retirar(200); // Retira 200
        cuenta1.mostrarSaldo();
    }
}