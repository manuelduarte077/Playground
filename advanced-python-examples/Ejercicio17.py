# Problema: Encuentra los números impares en un rango dado.

def impares_en_rango(inicio, fin):
    return [n for n in range(inicio, fin + 1) if n % 2 != 0]
    
# Ejemplo de uso
print(impares_en_rango(1, 10))  # [1, 3, 5, 7, 9]