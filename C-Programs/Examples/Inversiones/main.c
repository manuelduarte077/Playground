#include <stdio.h>
#include <string.h>

struct Producto
{
    int code;
    char name[15];
    float price[3];
    int cantidadVenta[3];
    int existencia[3];
};

void registrar(struct Producto producto[])
{
    for (int i = 0; i < 4; i++)
    {
        producto[i].code = i + 1;
        printf("Nombre del producto %d: ", i + 1);
        scanf("%s", producto[i].name);
        for (int j = 0; j < 3; j++)
        {
            printf("Precio %d del producto %d: ", j + 1, i + 1);
            scanf("%f", &producto[i].price[j]);
            printf("Cantidad venta %d del producto %d: ", j + 1, i + 1);
            scanf("%d", &producto[i].cantidadVenta[j]);
            printf("Existencia %d del producto %d: ", j + 1, i + 1);
            scanf("%d", &producto[i].existencia[j]);
        }
    }
    mostarTotales(producto);
}

void mostarTotales(struct Producto producto[])
{
    float ganancia, total = 0;
    for (int i = 0; i < 4; i++)
    {
        ganancia = 0;
        for (int j = 0; j < 3; j++)
        {
            ganancia += producto[i].cantidadVenta[j] * producto[i].price[j];
        }
        printf("Ganancias totales del producto %s: %.2f\n", producto[i].name, ganancia);
        printf("Ganancia con un 10%%: %.2f\n", ganancia * 0.10);
        printf("Ganancia con un 20%%: %.2f\n", ganancia * 0.20);
        printf("Ganancia con un 25%%: %.2f\n", ganancia * 0.25);
        total += ganancia;
    }
    printf("Ganancia total de la empresa: %.2f", total);
}

int main()
{
    struct Producto productos[4];
    printf("Inversiones mi marca\n");
    registrar(productos);
    return 0;
}