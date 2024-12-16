to_do = [
    "Estudiar para el examen",
    "Hacer la tarea",
    "Hacer la comida",
    "Hacer ejercicio",
    "Dormir",
    "Leer un libro",
]

print(to_do)
numbers = [1, 2, 3, 4, 5, 6, 7, 8, 9, 10, "a"]
print(numbers)

numbers.append(11)  # Agrega un elemento al final de la lista
print(len(numbers))  # 12

# Slice
print(numbers[0:5])  # [1, 2, 3, 4, 5]
print(numbers[5:])  # [6, 7, 8, 9, 10, 'a', 11]

# Insert
numbers.insert(5, "b")  # Inserta un elemento en la posición 5
print(numbers)  # [1, 2, 3, 4, 5, 'b', 6, 7, 8, 9, 10, 'a', 11]

# Remove
numbers.remove("b")  # Elimina el elemento "b"
print(numbers)  # [1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 'a', 11]

# Pop
numbers.pop()  # Elimina el último elemento de la lista

# Extend
numbers.extend([11, 12, 13])  # Agrega varios elementos al final de la lista
print(numbers)  # [1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 'a', 11, 12, 13]

# Clear
numbers.clear()  # Elimina todos los elementos de la lista

# Copy
numbers = [1, 2, 3, 4, 5]
numbers_copy = numbers.copy()  # Copia la lista

# Count
numbers = [1, 2, 3, 4, 5, 1, 1, 1]
print(numbers.count(1))  # 4

# Index
print(numbers.index(3))  # 2

# Reverse
print(numbers)  # [1, 2, 3, 4, 5, 1, 1, 1]
numbers.reverse()
print(numbers)  # [1, 1, 1, 1, 5, 4, 3, 2, 1]

del numbers[0]  # Elimina el primer elemento
print(numbers)  # [1, 1, 1, 5, 4, 3, 2, 1]

del numbers[0:3]  # Elimina los elementos de la posición 0 a 3
print(numbers)  # [5, 4, 3, 2, 1]

# Sort
numbers.sort()  # Ordena la lista
print(numbers)  # [1, 2, 3, 4, 5]


# Iterar
for number in numbers:
    print(number)
