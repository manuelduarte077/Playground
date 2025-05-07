package hilos;

public class EjemploBasicoThread {
    public static void main(String[] args) {
        System.out.println("Hilo principal: " + Thread.currentThread().getName());

        MiHilo tread1 = new MiHilo("A");
        MiHilo tread2 = new MiHilo("B");

        tread1.start(); // inicia la ejecucio del hilo1
        tread2.start();

        System.out.println("Hilo principal continuando: " + Thread.currentThread().getName());

        try {
            tread1.join();
            tread2.join();
        } catch (InterruptedException e) {
            System.err.println("Hilo principal interrumpido mientras esperaba.");
            Thread.currentThread().interrupt();
        }

        System.out.println("Hilo principal terminado: " + Thread.currentThread().getName());
    }
}
