# Problema: Suma todos los números en un rango dado.

def suma_rango(inicio, fin):
    return sum(range(inicio, fin + 1))
    
# Ejemplo de uso
print(suma_rango(1, 5))  # 15