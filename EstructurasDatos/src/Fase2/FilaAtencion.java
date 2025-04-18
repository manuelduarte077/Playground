package Fase2;
//  Simular una fila de atención al cliente (usando Queue)

public class FilaAtencion {
    public static void main(String[] args) {
        MiQueue fila = new MiQueue();

        fila.enqueue(101); // Cliente 101 llega
        fila.enqueue(102); // Cliente 102 llega
        fila.enqueue(103); // Cliente 103 llega

        System.out.println("Atendiendo cliente: " + fila.dequeue()); // 101
        System.out.println("Siguiente en fila: " + fila.peek());     // 102
        System.out.println("Clientes en espera: ");
        fila.printQueue(); // [102, 103]
    }
}