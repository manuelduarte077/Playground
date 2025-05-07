#include <stdio.h>

int main()
{
    int numero;
    printf("Ingresa un numero: ");

    scanf("%i", &numero);
    system("cls");

    printf("Lista de numeros imapres de 0 a %i\n\n", numero);

    for (int i = 0; i < numero; i++)
    {
        if (i % 2 != 0)
        {
            printf("%i\n", i);
        }
    }

    system("pause");
    return 0;
}