package Fase2.LinkedList;

public class PruebaLista {
    public static void main(String[] args) {
        MiLinkedList lista = new MiLinkedList();
        lista.push(10);
        lista.push(20);
        lista.push(30);
        lista.push(40);

        System.out.println("Lista original:");
        lista.printList(); // 10 → 20 → 30 → 40 → null

        lista.eliminar(30);
        System.out.println("Después de eliminar 30:");
        lista.printList(); // 10 → 20 → 40 → null

        lista.eliminar(10);
        System.out.println("Después de eliminar 10:");
        lista.printList(); // 20 → 40 → null
    }
}