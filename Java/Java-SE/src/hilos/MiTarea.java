package hilos;

class MiTarea implements Runnable {
    private String nombre;

    public MiTarea(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public void run() {
        // Código que se ejecutará en el hilo
        for (int i = 0; i < 5; i++) {
            System.out.println("Tarea " + nombre + ": Contador " + i);
            try {
                Thread.sleep(400);
            } catch (InterruptedException e) {
                System.err.println("Tarea " + nombre + " interrumpida.");
                Thread.currentThread().interrupt();
            }
        }
        System.out.println("Tarea " + nombre + " terminada.");
    }
}

