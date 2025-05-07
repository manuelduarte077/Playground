#include <stdio.h>

int main()
{
    int index = 0, numero;
    float total = 0, promedio;

    do
    {
        printf("Ingrese un numero: ");
        scanf("%d", &numero);

        total += numero;
        index++;
    } while (numero != 3);

    promedio = total / index;

    printf("El promedio es: %.2f", promedio);

    return 0;
}