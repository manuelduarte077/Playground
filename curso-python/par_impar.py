def par_impar(n):
    return "par" if n % 2 == 0 else "impar"


print(par_impar(2))  # par
print(par_impar(3))  # impar


def factorial(n):
    result = 1  # 1
    for i in range(1, n + 1):  # 1, 2, 3, 4, 5
        result *= i  # 1, 2, 6
    return result  # 6


print(factorial(5))  # 120


def maximo(lista):
    return max(lista)  # 9


print(maximo([1, 2, 3, 9, 4]))  # 9


def invertir(lista):
    return lista[::-1]  # [4, 3, 2, 1]


print(invertir([1, 2, 3, 4]))  # [4, 3, 2, 1]


def es_palindromo(palabra):
    return palabra == palabra[::-1]  # True


print(es_palindromo("reconocer"))  # True


def es_primo(n):
    if n < 2:
        return False
    for i in range(2, int(n**0.5) + 1):
        if n % i == 0:
            return False
    return True


def primos_en_rango(inicio, fin):
    return [n for n in range(inicio, fin + 1) if es_primo(n)]


print(primos_en_rango(1, 10))  # [2, 3, 5, 7]


# Convertir a binario
def binario(n):
    return bin(n)[2:]


print(binario(10))  # 1010


# Convertir a hexadecimal
def hexadecimal(n):
    return hex(n)[2:]


print(hexadecimal(10))  # a


# Convertir a Mayúsculas
def mayusculas(palabra):
    return palabra.upper()


print(mayusculas("hola"))  # HOLA


# Contar vocales
def contar_vocales(palabra):
    return sum(1 for letra in palabra if letra in "aeiou")


print(contar_vocales("hola"))  # 2


# Lista de numeros pares
def pares(n):
    return [i for i in range(n) if i % 2 == 0]


print(pares(10))  # [0, 2, 4, 6, 8]


# Promedio de una Lista
def promedio(lista):
    return sum(lista) / len(lista)


print(promedio([1, 2, 3, 4, 5]))  # 3.0


# Tabla de multiplicar


def tabla_multiplicar(n):
    return [n * i for i in range(1, 11)]


print(tabla_multiplicar(5))  # [5, 10, 15, 20, 25, 30, 35, 40, 45, 50]


# Si es anagrama
def es_anagrama(palabra1, palabra2):
    return sorted(palabra1) == sorted(palabra2)


print(es_anagrama("roma", "amor"))  # True


# Contar palabras
def contar_palabras(frase):
    return len(frase.split())


print(contar_palabras("Hola mundo"))  # 2


# Calcular el fibonacci de un número


def fibonacci(n):
    serie = [0, 1]
    for i in range(2, n):
        serie.append(serie[-1] + serie[-2])
    return serie[:n]


print(fibonacci(5))  # [0, 1, 1, 2, 3]
print(fibonacci(10))  # 55
