package Fase2.LinkedList;

public class MiLinkedList {
    private Nodo head;

    public MiLinkedList() {
        this.head = null;
    }

    // Agregar al final
    public void push(int value) {
        Nodo newNodo = new Nodo(value);

        if (head == null) {
            head = newNodo;
        } else {
            Nodo current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = newNodo;
        }
    }

    // Mostrar todos los nodos
    public void printList() {
        Nodo current = head;

        while (current != null) {
            System.out.print(current.valor + " -> ");
            current = current.next;
        }
        System.out.println("null");
    }

    // Buscar un valor
    public boolean isEmpty(int value) {
        Nodo current = head;

        while (current != null) {
            if (current.valor == value) {
                return true; // Valor encontrado
            }
            current = current.next;
        }
        return false; // Valor no encontrado
    }

    // Eliminar un nodo
    public void eliminar(int valor) {
        if (head == null) return; // Lista vacía

        // Caso especial: el valor está en la cabeza
        if (head.valor == valor) {
            head = head.next; // Saltamos el primer nodo
            return;
        }

        Nodo anterior = head;
        Nodo actual = head.next;

        while (actual != null) {
            if (actual.valor == valor) {
                anterior.next = actual.next; // Salta el nodo actual
                return;
            }
            anterior = actual;
            actual = actual.next;
        }
    }
}
