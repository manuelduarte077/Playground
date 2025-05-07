#include <stdio.h>
#include <stdlib.h>

int main()
{
    int numero;
    float resultado;
    char unidad, option;

    do
    {
        printf("Ingresa el numero que quieras convertir\n\n");
        scanf("%i", &numero);
        system("cls");
    } while (numero <= 0);

    do
    {
        printf("%i que?\n\n", numero);
        printf("s: segundos\nm: minutos\nh: horas\nd: dias\n\n");
        scanf("%c", &unidad);
        system("cls");
    } while (unidad != 's' && unidad != 'm' && unidad != 'h' && unidad != 'd');

    do
    {
        printf("Puedes convertir %i%c a:\n\ns: segundos\nm: minutos\nh: horas\nd: dias\n\n", numero, unidad);
        scanf("%c", &option);
        system("cls");
    } while (option != 's' && option != 'm' && option != 'h' && option != 'd');

    switch (unidad)
    {
    case 's':
        if (option == 's')
        {
            printf("No puedes convertir segundos a segundos\n\n");
        }

        if (option == 'm')
        {
            resultado = numero / 60.0;
            printf("%i segundos son %.2f minutos\n\n", numero, resultado);
        }

        if (option == 'h')
        {
            resultado = numero / 3600.0;
            printf("%i segundos son %.2f horas\n\n", numero, resultado);
        }

        if (option == 'd')
        {
            resultado = numero / 86400.0;
            printf("%i segundos son %.2f dias\n\n", numero, resultado);
        }
        break;

    case 'm':
        if (option == 'm')
        {
            printf("No puedes convertir minutos a minutos\n\n");
        }

        if (option == 's')
        {
            resultado = numero * 60;
            printf("%i minutos son %.2f segundos\n\n", numero, resultado);
        }

        if (option == 'h')
        {
            resultado = numero / 60.0;
            printf("%i minutos son %.2f horas\n\n", numero, resultado);
        }

        if (option == 'd')
        {
            resultado = numero / 1440.0;
            printf("%i minutos son %.2f dias\n\n", numero, resultado);
        }
        break;

    case 'h':
        if (option == 'h')
        {
            printf("No puedes convertir horas a horas\n\n");
        }

        if (option == 's')
        {
            resultado = numero * 3600.0;
            printf("%i horas son %.2f segundos\n\n", numero, resultado);
        }

        if (option == 'm')
        {
            resultado = numero * 60.0;
            printf("%i horas son %.2f minutos\n\n", numero, resultado);
        }

        if (option == 'd')
        {
            resultado = numero / 24.0;
            printf("%i horas son %.2f dias\n\n", numero, resultado);
        }
        break;

    case 'd':
        if (option == 'd')
        {
            printf("No puedes dias a dias\n\n");
        }

        if (option == 's')
        {
            resultado = numero * 86400;
            printf("%i dias son %.2f segundos\n\n", numero, resultado);
        }

        if (option == 'm')
        {
            resultado = numero * 1440.0;
            printf("%i dias son %.2f minutos\n\n", numero, resultado);
        }

        if (option == 'h')
        {
            resultado = numero / 24.0;
            printf("%i dias son %.2f horas\n\n", numero, resultado);
        }
        break;
    default:
        printf("La unidad ingresada no es valida\n\n");
        break;
    }

    system("pause");
    return 0;
}