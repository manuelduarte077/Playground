def fibonacci(n):
    fib_sequence = [0, 1]

    while len(fib_sequence) < n:
        fib_sequence.append(fib_sequence[-1] + fib_sequence[-2])

    return fib_sequence[:n]

# Imprimir los primeros 50 números de Fibonacci
primeros_50_fibonacci = fibonacci(50)
print(primeros_50_fibonacci)
