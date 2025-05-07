#include <stdio.h>

int main()
{
    int numero;
    printf("Ingresa un numero\n");
    scanf("%i", &numero);
    system("cls");
    
    if (numero % 2 == 0)
    {
        printf("El numero %i es par\n\n", numero);
    }
    else
    {
        printf("El numero %i es impar\n\n", numero);
    }

    system("pause");
    return 0;
}