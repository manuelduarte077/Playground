def son_anagramas(palabra1, palabra2):
    # Convertimos las palabras a minúsculas y eliminamos espacios en blanco
    palabra1 = palabra1.lower().replace(" ", "")
    palabra2 = palabra2.lower().replace(" ", "")
    
    # Verificamos si las palabras tienen la misma longitud
    if len(palabra1) != len(palabra2):
        return False
    
    # Ordenamos las letras de ambas palabras y comparamos
    return sorted(palabra1) == sorted(palabra2)

# Ejemplos de uso
resultado1 = son_anagramas("listen", "silent")
print(resultado1)  # True

resultado2 = son_anagramas("hello", "world")
print(resultado2)  # False
