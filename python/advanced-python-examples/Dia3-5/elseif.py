edad = 20

if edad < 18:
    print("Eres menor de edad.")
elif edad < 65:
    print("Eres adulto.")
else:
    print("Eres un adulto mayor.")


# Bucle for que imprime cada número del 1 al 5
for i in range(1, 6):
    print("Número:", i)

# Bucle while que cuenta hacia atrás desde 5
contador = 5
while contador > 0:
    print("Contador:", contador)
    contador -= 1


# Función que suma dos números y devuelve el resultado
def nombre_funcion(parametro1, parametro2):
    resultado = parametro1 + parametro2

    return resultado


# Hola, Ana
def saludo(nombre):
    mensaje = "Hola, " + nombre
    return mensaje


print(saludo("Ana"))


# Variable global
mensaje_global = "Hola desde fuera de la función"


def funcion():
    # Variable local
    mensaje_local = "Hola desde dentro de la función"
    print(mensaje_local)


funcion()
print(mensaje_global)
# print(mensaje_local)  # Esto generaría un error porque mensaje_local no es accesible aquí

