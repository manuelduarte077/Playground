package Fase2;

public class QueueTest {
    public static void main(String[] args) {
        MiQueue cola = new MiQueue();

        cola.enqueue(10);
        cola.enqueue(20);
        cola.enqueue(30);

        cola.printQueue();         // [10, 20, 30]
        System.out.println(cola.dequeue()); // 10
        System.out.println(cola.peek());    // 20
        cola.printQueue();         // [20, 30]
    }
}
