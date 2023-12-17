function fibonacci(n) {
  let fibSequence = [0, 1];

  while (fibSequence.length < n) {
    fibSequence.push(
      fibSequence[fibSequence.length - 1] + fibSequence[fibSequence.length - 2]
    );
  }

  return fibSequence.slice(0, n);
}

// Imprimir los primeros 50 números de Fibonacci
const primeros50Fibonacci = fibonacci(50);
console.log(primeros50Fibonacci);
