# Problema: Calcula la serie de Fibonacci hasta el n-ésimo término.

def fibonacci(n):
    serie = [0, 1]
    for i in range(2, n):
        serie.append(serie[-1] + serie[-2])
    return serie[:n]
    
# Ejemplo de uso
print(fibonacci(5))  # [0, 1, 1, 2, 3]