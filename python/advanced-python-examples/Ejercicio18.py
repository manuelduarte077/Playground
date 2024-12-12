# Problema: Encuentra la longitud de la palabra más larga en una lista de palabras.

def longitud_palabra_mas_larga(palabras):
    return max(len(palabra) for palabra in palabras)
    
# Ejemplo de uso
print(longitud_palabra_mas_larga(["hola", "mundo", "python"]))  # 6