package Multithreading;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        // Inicializar la tienda con un stock de 10 productos
        TiendaOnline tienda = new TiendaOnline(10); // Stock inicial: 10

        // CountDownLatch para sincronizar la finalización de todas las compras
        int numeroClientes = 5; // Número de clientes concurrentes
        CountDownLatch latch = new CountDownLatch(numeroClientes);

        // ExecutorService para manejar los hilos de los clientes
        ExecutorService executor = Executors.newFixedThreadPool(numeroClientes);

        // Crear 5 clientes que intentarán comprar productos al mismo tiempo
        for (int i = 0; i < numeroClientes; i++) {
            int cantidadCompra = (i + 1); // Los clientes comprarán cantidades crecientes (1, 2, 3, etc.)
            executor.submit(new Cliente(tienda, cantidadCompra, latch));
        }

        // Esperar a que todos los clientes hayan terminado de comprar
        latch.await();

        // Finalizar el ExecutorService
        executor.shutdown();

        System.out.println("Todas las compras han sido procesadas. Stock final: " + tienda.getStock());
    }
}
