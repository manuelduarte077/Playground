fun busquedaBinaria(arr: IntArray, objetivo: Int): Int {
    var inicio = 0;
    var fin = arr.size - 1;


    while (inicio <= fin) {
        val medio = inicio + (fin - inicio) / 2;

        when {
            arr[medio] == objetivo -> return medio
            arr[medio] < objetivo -> inicio = medio + 1
            else -> fin = medio - 1
        }
    }

    return -1;
}

fun main() {
    val numeros = intArrayOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
    val resultado = busquedaBinaria(numeros, 7);
    println("Elemento encontrado en la posicion: $resultado");
}
