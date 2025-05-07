#include <stdio.h>

int main()
{
    int numero;

    printf("Ingresa un numero para obtener su tabla de multiplicar\n\n");
    scanf("%i", &numero);
    system("cls");
    printf("Tabla de multiplicar del numero %i\n\n", numero);

    for (int i = 1; i < 11; i++)
    {
        printf("%i x %i = %i\n", numero, i, numero * i);
    }

    system("pause");
    return 0;
}