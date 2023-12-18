def es_primo(numero):
    if numero < 2:
        return False
    for i in range(2, int(numero**0.5) + 1):
        if numero % i == 0:
            return False
    return True

def imprimir_primos_entre_1_y_100():
    primos = [num for num in range(1, 101) if es_primo(num)]
    print("Números primos entre 1 y 100:", primos)

# Verificar si un número es primo
numero_a_verificar = int(input("Ingrese un número: "))
if es_primo(numero_a_verificar):
    print(f"{numero_a_verificar} es un número primo.")
else:
    print(f"{numero_a_verificar} no es un número primo.")

# Imprimir números primos entre 1 y 100
imprimir_primos_entre_1_y_100()
