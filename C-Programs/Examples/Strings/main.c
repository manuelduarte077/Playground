#include <stdio.h>
#include <string.h>

int main(int argc, char const *argv[])
{
    /* Para declarar datos de entrada */
    char name[20];
    char apellido[20];

    /* Para obener los datos de entrada */
    printf("Escribe tu nombre:\n");
    scanf("%s", &name);

    printf("Escribe tu apellido\n");
    scanf("%s", &apellido);

    /* Para imprimir los datos de entrada */
    printf("Tu nombre es: %s %s\n", name, apellido);
    system("PAUSE");

    return 0;
}
