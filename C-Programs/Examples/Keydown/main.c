#include <stdio.h>
#include <conio.h>

int main()
{
    char ch;
    printf("Presiona una tecla (ESC para salir)...\n");
    do
    {
        ch = getch();                       // Almacena la tecla oprimida en ch
        printf("Tecla oprimida: %c\n", ch); // Imprime la tecla oprimida
    } while (ch != 27);                     // Sale del loop cuando se presiona la tecla Esc (código ASCII 27)
    printf("Adios!\n");
    return 0;
}