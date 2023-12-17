List<int> fibonacci(int n) {
  List<int> fibSequence = [0, 1]; // Secuencia de Fibonacci

  while (fibSequence.length < n) {
    // Mientras la secuencia sea menor a n
    fibSequence.add(fibSequence[fibSequence.length - 1] +
            fibSequence[fibSequence.length -
                2] // Suma de los dos últimos números de la secuencia
        );
  }

  return fibSequence.sublist(0, n); // Retornar los primeros n números
}

void main() {
  // Imprimir los primeros 50 números de Fibonacci
  List<int> primeros50Fibonacci = fibonacci(50);
  print(primeros50Fibonacci);
}
