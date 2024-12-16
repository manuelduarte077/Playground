squares = [x**2 for x in range(1, 11)]  # Lista de comprensión
# print("Cuadrados:", squares)

celsius = [0, 10, 20, 30, 40]  # Lista de celsius
fahrenheit = [(temp * 9 / 5) * 32 for temp in celsius]  # Lista de comprensión
# print("Temperatura en F:", fahrenheit) # Temperatura en F

# Numeros pares
evens = [x for x in range(1, 21) if x % 2 == 0]  # Lista de comprensión
# print(evens)

matrix = [[1, 2, 3], [4, 5, 6], [7, 8, 9]]  # Matriz

transposed = [
    [row[i] for row in matrix] for i in range(len(matrix[0]))
]  # Lista de comprensión

print(matrix)
# print(transposed)

transposed = []  # Lista de comprensión
for i in range(len(matrix[0])):  # Rango de la longitud de la primera fila de la matriz
    transposed_row = []  # Lista vacía

    for row in matrix:  # Recorrer las filas de la matriz
        transposed_row.append(
            row[i]
        )  # Agregar el elemento i de la fila a la fila transpuesta
    transposed.append(
        transposed_row
    )  # Agregar la fila transpuesta a la matriz transpuesta

print(transposed)


vec = [-4, -2, 0, 2, 4]
# create a new list with the values doubled
[x * 2 for x in vec]

# filter the list to exclude negative numbers
[x for x in vec if x >= 0]

# apply a function to all the elements
[abs(x) for x in vec]

# call a method on each element
freshfruit = ["  banana", "  loganberry ", "passion fruit  "]
[weapon.strip() for weapon in freshfruit]

# create a list of 2-tuples like (number, square)
[(x, x**2) for x in range(6)]

# flatten a list using a listcomp with two 'for'
vec = [[1, 2, 3], [4, 5, 6], [7, 8, 9]]
[num for elem in vec for num in elem]
