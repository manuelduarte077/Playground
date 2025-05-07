#include <stdio.h>

int main()
{
    int libros, precio = 32;

    printf("Ingresa la cantidad de libros a comprar: ");
    scanf("%d", &libros);

    printf("Por la compra de %d libros debes pagar %d$", libros, precio * libros);

    return 0;
}