#include <stdio.h>
#include <string.h>
#include <stdbool.h>

int main()
{
    char texto[180];
    bool pangrama = true;
    char abecedario[26] = {0}; /* Inicializamos en 0s */

    printf("Ingrese una frase o palabra: ");
    scanf("%[^\n]", texto);

    for (int i = 0; i < strlen(texto); i++)
    {
        /* Si el caracter es una letra */
        if (isalpha(texto[i]))
        {
            char c = tolower(texto[i]); /* Convertir a minúsculas */
            abecedario[c - 'a'] = '_';  /* Marcar letra encontrada */
        }
    }

    /* Verificar si todas las letras han sido encontradas */
    for (int i = 0; i < 26; i++)
    {
        if (abecedario[i] != '_') /* Si hay una letra no encontrada */
        {
            pangrama = false; /* No es un pangrama */
            break;            /* Salir del ciclo */
        }
    }

    if (pangrama)
    {
        printf("El texto ingresado es un pangrama.\n");
    }
    else
    {
        printf("El texto ingresado no es un pangrama.\n");
    }

    system("pause");
    return 0;
}