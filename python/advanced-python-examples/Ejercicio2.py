# Problema: Calcula el factorial de un número dado.

def factorial(n):
    resultado = 1
    for i in range(1, n + 1):
        resultado *= i
    return resultado
    
# Ejemplo de uso
print(factorial(5))  # 120