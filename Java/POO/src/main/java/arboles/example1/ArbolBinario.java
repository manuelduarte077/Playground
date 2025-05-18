package arboles.example1;

/**
 * Clase que representa un árbol binario.
 * Tiene un nodo raíz que es el nodo principal del árbol.
 * Los nodos del árbol pueden tener un hijo izquierdo y un hijo derecho.
 * Los hijos son también nodos del árbol.
 */
class ArbolBinario {
    /**
     * Nodo raíz del árbol.
     */
    Nodo raiz;

    /**
     * Constructor del árbol binario.
     * Inicializa la raíz del árbol a null.
     */
    ArbolBinario() {
        raiz = null;
    }

    /**
     * Inserta un valor en el árbol.
     * Si el árbol está vacío, crea un nodo con el valor y lo establece como raíz.
     * Si el valor es menor que el de la raíz, lo inserta en el subárbol izquierdo.
     * Si el valor es mayor que el de la raíz, lo inserta en el subárbol derecho.
     * @param valor el valor a insertar
     */
    void insertar(int valor) {
        raiz = insertarRec(raiz, valor);
    }

    /**
     * Inserta un valor en el árbol recursivamente.
     * @param raiz el nodo actual del árbol
     * @param valor el valor a insertar
     * @return el nodo insertado
     */
    Nodo insertarRec(Nodo raiz, int valor) {
        if (raiz == null) {
            raiz = new Nodo(valor);
            return raiz;
        }

        if (valor < raiz.valor)
            raiz.izquierdo = insertarRec(raiz.izquierdo, valor);
        else if (valor > raiz.valor)
            raiz.derecho = insertarRec(raiz.derecho, valor);

        return raiz;
    }

    /**
     * Imprime el árbol en orden inorder.
     * Primero imprime el subárbol izquierdo, luego el valor de la raíz y finalmente el subárbol derecho.
     */
    void inorder() {
        inorderRec(raiz);
    }

    /**
     * Imprime el árbol en orden inorder recursivamente.
     * @param raiz el nodo actual del árbol
     */
    void inorderRec(Nodo raiz) {
        if (raiz != null) {
            inorderRec(raiz.izquierdo);
            System.out.print(raiz.valor + " ");
            inorderRec(raiz.derecho);
        }
    }
}
