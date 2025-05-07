package hilos;

public class EjemploBasicoRunnable {
    public static void main(String[] args) {
        System.out.println("Hilo principal iniciando.");

        MiTarea tarea1 = new MiTarea("X");
        MiTarea tarea2 = new MiTarea("Y");

        Thread hilo1 = new Thread(tarea1);
        Thread hilo2 = new Thread(tarea2);

        hilo1.start();
        hilo2.start();

        System.out.println("Hilo principal continuando...");

        try {
            hilo1.join();
            hilo2.join();
        } catch (InterruptedException e) {
            System.err.println("Hilo principal interrumpido mientras esperaba.");
            Thread.currentThread().interrupt();
        }

        System.out.println("Hilo principal terminado.");
    }
}
