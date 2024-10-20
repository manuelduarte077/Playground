package Multithreading;

public class TiendaOnline {
    private int stock;

    public TiendaOnline(int stockInicial) {
        this.stock = stockInicial; // Inicializar el stock
    }

    // Metodo synchronized para controlar acceso concurrente al stock
    public synchronized boolean comprar(int cantidad) {
        if (stock >= cantidad) {
            System.out.println(Thread.currentThread().getName() + " está comprando " + cantidad + " productos.");
            stock -= cantidad;
            System.out.println(Thread.currentThread().getName() + " ha comprado " + cantidad + " productos. Stock restante: " + stock);
            return true;
        } else {
            System.out.println(Thread.currentThread().getName() + " no pudo comprar " + cantidad + " productos, pero no hay suficiente stock.");
            return false;
        }
    }

    // Metodo para obtener el stock actual
    public int getStock() {
        return stock;
    }
}
