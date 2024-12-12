# Problema: Encuentra los números primos en un rango dado.

def es_primo(n):
    if n < 2:
        return False
    for i in range(2, int(n**0.5) + 1):
        if n % i == 0:
            return False
    return True

def primos_en_rango(inicio, fin):
    return [n for n in range(inicio, fin + 1) if es_primo(n)]
    
# Ejemplo de uso
print(primos_en_rango(10, 20))  # [11, 13, 17, 19]