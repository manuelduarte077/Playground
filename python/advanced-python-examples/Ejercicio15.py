# Problema: Verifica si dos cadenas son anagramas.

def son_anagramas(cadena1, cadena2):
    return sorted(cadena1) == sorted(cadena2)
    
# Ejemplo de uso
print(son_anagramas("roma", "amor"))  # True