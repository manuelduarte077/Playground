package arboles;

/**
 * Clase que representa un nodo de un árbol binario.
 * Un nodo contiene un entero, un puntero a otro nodo que es el hijo izquierdo
 * y otro puntero a otro nodo que es el hijo derecho.
 */
class Nodo {
    private int dato;
    private Nodo izquierda, derecha;

    /**
     * Constructor que inicializa el nodo con un entero.
     *
     * @param dato el entero que se va a almacenar en el nodo
     */
    public Nodo(int dato) {
        this.dato = dato;
        this.izquierda = this.derecha = null;
    }

    /**
     * Devuelve el entero almacenado en el nodo.
     *
     * @return el entero almacenado en el nodo
     */
    public int getDato() {
        return dato;
    }

    /**
     * Devuelve el nodo izquierdo.
     *
     * @return el nodo izquierdo
     */
    public Nodo getIzquierda() {
        return izquierda;
    }

    /**
     * Establece el nodo izquierdo.
     *
     * @param izquierda el nodo izquierdo
     */
    public void setIzquierda(Nodo izquierda) {
        this.izquierda = izquierda;
    }

    /**
     * Devuelve el nodo derecho.
     *
     * @return el nodo derecho
     */
    public Nodo getDerecha() {
        return derecha;
    }

    /**
     * Establece el nodo derecho.
     *
     * @param derecha el nodo derecho
     */
    public void setDerecha(Nodo derecha) {
        this.derecha = derecha;
    }

    /**
     * Imprime en consola el entero almacenado en el nodo.
     */
    public void imprimirDato() {
        System.out.println(this.getDato());
    }
}

/**
 * Clase que representa un árbol binario.
 * Un árbol binario tiene un nodo raíz que es el nodo principal del árbol.
 * Los nodos del árbol pueden tener un hijo izquierdo y un hijo derecho.
 * Los hijos son también nodos del árbol.
 */
class Arbol {
    private Nodo raiz;

    /**
     * Constructor que inicializa el árbol sin nodos.
     */
    public Arbol() {

    }

    /**
     * Verifica si un entero existe en el árbol.
     *
     * @param busqueda el entero que se busca
     * @return true si el entero existe en el árbol, false en caso contrario
     */
    public boolean existe(int busqueda) {
        return existe(this.raiz, busqueda);
    }

    /**
     * Verifica si un entero existe en el árbol recursivamente.
     *
     * @param n        el nodo actual
     * @param busqueda el entero que se busca
     * @return true si el entero existe en el árbol, false en caso contrario
     */
    private boolean existe(Nodo n, int busqueda) {
        if (n == null) {
            return false;
        }
        if (n.getDato() == busqueda) {
            return true;
        } else if (busqueda < n.getDato()) {
            return existe(n.getIzquierda(), busqueda);
        } else {
            return existe(n.getDerecha(), busqueda);
        }
    }

    /**
     * Inserta un entero en el árbol.
     * Si el árbol está vacío, crea un nodo con el entero y lo establece como raíz.
     * Si el entero es menor que el de la raíz, lo inserta en el subárbol izquierdo.
     * Si el entero es mayor que el de la raíz, lo inserta en el subárbol derecho.
     *
     * @param dato el entero que se va a insertar
     */
    public void insertar(int dato) {
        if (this.raiz == null) {
            this.raiz = new Nodo(dato);
        } else {
            this.insertar(this.raiz, dato);
        }
    }

    /**
     * Inserta un entero en el árbol recursivamente.
     *
     * @param padre el nodo actual
     * @param dato  el entero que se va a insertar
     */
    private void insertar(Nodo padre, int dato) {
        if (dato > padre.getDato()) {
            if (padre.getDerecha() == null) {
                padre.setDerecha(new Nodo(dato));
            } else {
                this.insertar(padre.getDerecha(), dato);
            }
        } else {
            if (padre.getIzquierda() == null) {
                padre.setIzquierda(new Nodo(dato));
            } else {
                this.insertar(padre.getIzquierda(), dato);
            }
        }
    }

    /**
     * Recorre el árbol en preorden y ejecuta el método imprimirDato() en cada nodo.
     */
    private void preorden(Nodo n) {
        if (n != null) {
            n.imprimirDato();
            preorden(n.getIzquierda());
            preorden(n.getDerecha());
        }
    }

    /**
     * Recorre el árbol en inorden y ejecuta el método imprimirDato() en cada nodo.
     */
    private void inorden(Nodo n) {
        if (n != null) {
            inorden(n.getIzquierda());
            n.imprimirDato();
            inorden(n.getDerecha());
        }
    }

    /**
     * Recorre el árbol en postorden y ejecuta el método imprimirDato() en cada nodo.
     */
    private void postorden(Nodo n) {
        if (n != null) {
            postorden(n.getIzquierda());
            postorden(n.getDerecha());
            n.imprimirDato();
        }
    }

    /**
     * Recorre el árbol en preorden y ejecuta el método imprimirDato() en cada nodo.
     */
    public void preorden() {
        this.preorden(this.raiz);
    }

    /**
     * Recorre el árbol en inorden y ejecuta el método imprimirDato() en cada nodo.
     */
    public void inorden() {
        this.inorden(this.raiz);
    }

    /**
     * Recorre el árbol en postorden y ejecuta el método imprimirDato() en cada nodo.
     */
    public void postorden() {
        this.postorden(this.raiz);
    }
}