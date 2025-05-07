#include <stdio.h>
#include <math.h>
#include <time.h>

int main(int argc, char const *argv[])
{
    int i;
    char operador;

    printf("Ingrese un operador (p, a, t,)\n");
    scanf("%c", &operador);
    system("cls");

    srand(time(NULL));
    i = rand() % 3;

    switch (operador)
    {
    case 'p':
        printf("Seleccionaste piedra\n");
        if (i == 1)
        {
            printf("Yo tambien seleccione piedra\n\nEs un empate.\n\n");
        }
        if (i == 2)
        {
            printf("Yo seleccione papel\n\nLo siento, tu pierdes.\n\n");
        }
        if (i == 3)
        {
            printf("Yo seleccione tijera\n\nFelicidades, tu ganas.\n\n");
        }
        break;

    case 'a':
        printf("Seleccionaste papel\n");
        if (i == 1)
        {
            printf("Yo seleccione piedra\n\nFelicidades, tu ganas.\n\n");
        }
        if (i == 2)
        {
            printf("Yo tambien seleccione papel\n\nEs un empate.\n\n");
        }
        if (i == 3)
        {
            printf("Yo seleccione tijera\n\nLo siento, tu pierdes.\n\n");
        }
        break;

    case 't':
        printf("Seleccionaste tijera\n");
        if (i == 1)
        {
            printf("Yo seleccione piedra\n\nFelicidades, Lo siento, tu pierdes.\n\n");
        }
        if (i == 2)
        {
            printf("Yo tambien seleccione papel\n\nFelicidades, tu ganas.\n\n");
        }
        if (i == 3)
        {
            printf("Yo seleccione tijera\n\nEs un empate.\n\n");
        }
        break;

    default:
        printf("El operador no es valido.\n");
        break;
    }
    system("pause");
    return 0;
}