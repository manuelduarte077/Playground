package Multithreading;

import java.util.concurrent.CountDownLatch;

class Cliente implements Runnable {

    private final TiendaOnline tienda;
    private final int cantidadCompra;
    private final CountDownLatch latch;

    public Cliente(TiendaOnline tienda, int cantidadCompra, CountDownLatch latch) {
        this.tienda = tienda;
        this.cantidadCompra = cantidadCompra;
        this.latch = latch;
    }

    @Override
    public void run() {
        try {
            tienda.comprar(cantidadCompra); // Intentar comprar productos
        } finally {
            latch.countDown(); // Reducir el conteo del CountDownLatch
        }
    }
}
