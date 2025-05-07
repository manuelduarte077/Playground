#include <stdio.h>

int main()
{
    int limite_inferior = 5;
    int limite_superior = 20;
    int num, dentro = 0, fuera = 0, total = 0;

    while (1)
    {
        printf("Introduce un número (-1 para salir): ");
        scanf("%d", &num);

        if (num == -1)
        {
            break;
        }

        total++;

        if (num >= limite_inferior && num <= limite_superior)
        {
            dentro++;
        }
        else
        {
            fuera++;
        }
    }

    printf("Cantidad de números dentro del límite: %d\n", dentro);
    printf("Cantidad de números fuera del límite: %d\n", fuera);
    printf("Cantidad total de números pulsados: %d\n", total);

    return 0;
}
