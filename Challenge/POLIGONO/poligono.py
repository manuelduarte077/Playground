def calcular_area_poligono(tipo, *args):
    # *args es una tupla con los argumentos que se pasan a la función

    # tipo es el tipo de polígono
    if tipo.lower() == "triangulo" and len(args) == 2: # len(args) es el número de argumentos
        base, altura = args
        area = 0.5 * base * altura
        print(f"Área del triángulo: {area}")
        return area
    elif tipo.lower() == "cuadrado" and len(args) == 1: # len(args) es el número de argumentos
        lado = args[0]
        area = lado * lado
        print(f"Área del cuadrado: {area}")
        return area
    elif tipo.lower() == "rectangulo" and len(args) == 2: # len(args) es el número de argumentos
        base, altura = args
        area = base * altura
        print(f"Área del rectángulo: {area}")
        return area
    else:
        print("Tipo de polígono no soportado o número incorrecto de argumentos.")
        return None # Si no se cumple ninguna de las condiciones anteriores, se retorna None

# Ejemplos de uso
calcular_area_poligono("triangulo", 4, 6)
calcular_area_poligono("cuadrado", 5)
calcular_area_poligono("rectangulo", 3, 8)
