import typing_extensions

my_list = [1, 2, 3, 4, 5]  # Lista de números

my_list = iter(my_list)  # Convertir la lista en un iterador

print(next(my_list))  # 1
print(next(my_list))  # 2
print(next(my_list))  # 3
print(next(my_list))  # 4


text = "Hola Mundo"  # Cadena de texto

text = iter(text)  # Convertir la cadena de texto en un iterador

for i in text:
    print(i)  # Hola Mundo


#
limit = 10  # Límite
odd_iter = iter(range(1, limit + 1, 2))  # Iterador de números impares

for i in odd_iter:
    print(i)  # Números impares del 1 al 10

odd_lambda = lambda x: x % 2 != 0  # Función lambda para números impares
for i in filter(odd_lambda, range(1, 11)):
    print(i)  # Números impares del 1 al 10


def my_generator():
    yield 1
    yield 2
    yield 3
    yield 4
    yield 5


for i in my_generator():
    print(i)  # 1 2 3 4 5


# Fibonacci
def fibonacci(n):
    a, b = 0, 1
    while a < n:
        yield a
        a, b = b, a + b


for num in fibonacci(10):
    print(num, end=" ")
