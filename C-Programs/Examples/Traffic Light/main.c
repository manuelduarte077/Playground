#include <stdio.h>

int main()
{
    int semaforo;

    do
    {
        printf("Listado de colores de un semaforo:\n\n1. Rojo\n2. Verde\n3. Amarillo\n\nIntroduzca un numero: ");
        scanf("%i", &semaforo);
        system("cls");
    } while (semaforo > 3);

    switch (semaforo)
    {
    case 1:
        printf("Rojo significa \"No pasar\"\n\n");
        break;
    case 2:
        printf("Verde significa \"Adelante\"\n\n");
        break;
    case 3:
        printf("Amarillo significa \"Precaucion\"\n\n");
        break;

    default:
        break;
    }

    system("pause");
    return 0;
}