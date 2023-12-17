fun fibonacci(n: Int): List<Long> {
    val fibSequence = mutableListOf(0L, 1L)

    while (fibSequence.size < n) {
        val nextNumber = fibSequence[fibSequence.size - 1] + fibSequence[fibSequence.size - 2]
        fibSequence.add(nextNumber)
    }

    return fibSequence.take(n)
}

fun main() {
    // Imprimir los primeros 50 números de Fibonacci
    val primeros50Fibonacci = fibonacci(50)
    println(primeros50Fibonacci)
}
