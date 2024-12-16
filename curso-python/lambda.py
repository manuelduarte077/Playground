add = lambda a, b: a + b  # Función lambda para sumar
print(add(10, 4))

multiply = lambda a, b: a * b  # Función lambda para multiplicar
print(multiply(80, 5))

# Cuadrado de cada numero
numbers = range(11)  # Rango de números
squared_numbers = list(map(lambda x: x**2, numbers))  # Lista de cuadrados
print("Cuadrados:", squared_numbers)

# Pares
even_numbers = list(filter(lambda x: x % 2 == 0, numbers))  # Lista de pares
print("Pares:", even_numbers)
