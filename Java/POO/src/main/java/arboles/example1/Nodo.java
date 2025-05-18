package arboles.example1;

/**
 * Clase que representa un nodo en un arbol binario.
 * Contiene un entero, un puntero a otro nodo que es el hijo izquierdo
 * y otro puntero a otro nodo que es el hijo derecho.
 *
 *
 */
class Nodo {
    int valor;
    Nodo izquierdo;
    Nodo derecho;

    /**
     * Constructor. Inicializa el nodo con el valor indicado.
     * Los punteros a los hijos se inicializan en null.
     * @param item el valor que se va a almacenar en el nodo.
     */
    public Nodo(int item) {
        this.valor = item;
        izquierdo = derecho = null;
    }
}