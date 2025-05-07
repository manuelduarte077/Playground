package hilos;

class MiHilo extends Thread {
    private String name;

    public MiHilo(String name) {
        this.name = name;
    }

    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println("Hilo " + name + ": Contador " + i);
            try {
                Thread.sleep(500); // Pausa el hilo actual por 500 ms
            } catch (InterruptedException e) {
                System.err.println("Hilo " + name + " interrumpido.");
                Thread.currentThread().interrupt(); // Restablece el estado de interrupción
            }
        }
        System.out.println("Hilo " + name + " terminado.");
    }
}

