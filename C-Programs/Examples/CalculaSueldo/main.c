/*
Calculando sueldo. El sueldo neto de un vendedor de una importante
empresa de Maturín se calcula como la suma del sueldo básico más el 5% de cada venta
realizada. Determine el sueldo neto de cada vendedor sabiendo que existen en la tienda 4
vendedores y que cada uno realizó 15 ventas al mes.
*/

#include <stdio.h>
#define MAX_VENDEDORES 4
#define MAX_VENTAS 14

struct Vendedor
{
    char name[15];
    int ventas[MAX_VENTAS];
    float sueldo;
};

int main()
{
    float sueldoBasico, sueldoFinal, gananciaPorVenta;
    int totalVendedores = 0;
    struct Vendedor vendedores[MAX_VENDEDORES];
    struct Vendedor vendedor;

    printf("Ingresa el sueldo basico: ");
    scanf("%f", &sueldoBasico);

    for (int i = 0; i < MAX_VENDEDORES; i++)
    {
        vendedor.sueldo = sueldoBasico;
        printf("Ingresa el nombre del vendedor %d: ", i + 1);
        scanf("%s", vendedor.name);

        // Pedir información de ventas para cada vendedor
        for (int j = 0; j < MAX_VENTAS; j++)
        {
            printf("Ingresa el precio de la venta #%d: ", j + 1);
            scanf("%d", &vendedor.ventas[j]);
        }
        vendedores[i] = vendedor; // Guardar el vendedor en el arreglo
        totalVendedores++;
    }

    // Calcular sueldo final para cada vendedor y mostrar los resultados
    for (int i = 0; i < totalVendedores; i++)
    {
        sueldoFinal = sueldoBasico; // Inicializar el sueldoFinal en el sueldo básico
        for (int j = 0; j < MAX_VENTAS; j++)
        {
            gananciaPorVenta = vendedores[i].ventas[j] * 5.0 / 100.0; // Calcular la ganancia por venta
            sueldoFinal += gananciaPorVenta;                          // Agregar la ganancia al sueldoFinal
        }
        printf("Sueldo del vendedor %s: %.2f\n", vendedores[i].name, sueldoFinal);
    }

    return 0;
}