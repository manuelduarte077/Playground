#include <stdio.h>
#include <string.h>
#include <stdbool.h>

int main()
{
    char texto[180];
    int i, j, longitud;
    bool palindromo = true;
    printf("Ingresa una frase o palabra: ");
    scanf("%s", texto);

    longitud = strlen(texto); /* obtenemos la longitud de la cadena */

    /* recorremos la cadena de caracteres desde los extremos hacia el centro */
    for (i = 0, j = longitud - 1; i < j; i++, j--)
    {
        if (texto[i] != texto[j]) /* si los caracteres no son iguales */
        {
            palindromo = false; /* la cadena no es un palíndromo */
            break;              /* salimos del ciclo */
        }
    }

    if (palindromo) /* si no se encontraron caracteres diferentes */
    {
        printf("El texto ingresado es un palindromo\n");
    }
    else
    {
        printf("El texto ingresado no es un palindromo\n");
    }

    system("pause");
    return 0;
}