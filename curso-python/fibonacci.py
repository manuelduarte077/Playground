# reto
def sumatoria(n):
    if n == 0:
        return 0
    else:
        return n + sumatoria(n - 1)


# Probar la función con varios valores
for i in range(11):
    print(f"Sumatoria de {i} es: {sumatoria(i)}")
