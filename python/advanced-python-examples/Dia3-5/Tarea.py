import random


def adivina_el_numero():
    # Generar un número aleatorio entre 1 y 100
    numero_a_adivinar = random.randint(1, 100)
    intentos = 0

    print("¡Bienvenido al juego de adivinar el número!")
    print("Estoy pensando en un número entre 1 y 100.")
    print("Intenta adivinarlo.")

    while True:
        # Pedir al usuario que ingrese un número
        intento = int(input("Introduce tu intento: "))
        intentos += 1  # Aumentar el contador de intentos

        # Comparar el intento con el número a adivinar
        if intento < numero_a_adivinar:
            print("Demasiado bajo. Intenta de nuevo.")
        elif intento > numero_a_adivinar:
            print("Demasiado alto. Intenta de nuevo.")
        else:
            print(f"¡Felicidades! Adivinaste el número en {intentos} intentos.")
            break


# Ejecutar el juego
adivina_el_numero()

