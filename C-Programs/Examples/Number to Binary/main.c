#include <stdio.h>
#include <stdlib.h>

int main()
{
    int numero, resto, i = 0;
    char binario[33]; /* se pueden representar números de hasta 32 bits */

    printf("Ingresa un numero: ");
    scanf("%i", &numero);

    if (numero < 0)
    {
        printf("El numero debe ser positivo\n");
        return 1; /* indicamos que hubo un error al usuario */
    }

    if (numero == 0)
    {
        printf("El numero en binario es 0\n");
        return 0; /* indicamos que todo salió bien */
    }

    while (numero > 0)
    {
        resto = numero % 2;         /* obtenemos el residuo de la división por 2 */
        binario[i++] = resto + '0'; /* agregamos el residuo a la cadena, convirtiéndolo a un dígito */
        numero /= 2;                /* dividimos el número por 2 */
    }

    binario[i] = '\0'; /* agregamos el caracter nulo al final de la cadena */

    /* invertimos los dígitos de la cadena */
    for (int j = 0; j < i / 2; j++)
    {
        char temp = binario[j];
        binario[j] = binario[i - j - 1];
        binario[i - j - 1] = temp;
    }

    printf("El numero en binario es %s\n", binario);

    system("pause");
    return 0;
}

/*
#include <stdio.h>
#include <stdlib.h>

int main()
{
    int numero;
    char binario[9];

    printf("Ingresa un numero: ");
    scanf("%i", &numero);

    itoa(numero, binario, 2);
    printf("El numero %d en binario es %s\n", numero, binario);

    system("pause");
    return 0;
}
*/