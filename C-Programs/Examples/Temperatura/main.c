#include <stdio.h>

int main()
{
    int tempMaximaDelMes, tempMediaDeHoy, tempMaxima;

    printf("Ingrese la temperatura maxima del mes: ");
    scanf("%d", &tempMaximaDelMes);

    printf("Ingrese la temperatura media de hoy: ");
    scanf("%d", &tempMediaDeHoy);

    if (tempMediaDeHoy > tempMaximaDelMes)
    {
        tempMaxima = tempMediaDeHoy;
    }
    else
    {
        tempMaxima = tempMaximaDelMes;
    }

    printf("temperatura maxima del mes: %d grados \nTemperatura maxima de hoy: %d grados\nLa temperatura maxima final es: %d grados", tempMaxima, tempMediaDeHoy, tempMaxima);

    return 0;
}