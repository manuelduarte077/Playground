#include <stdio.h>
#include "module.h"

int main()
{
    int resultado = Suma(20, 20);
    printf("%d\n", resultado);

    resultado = Resta(20, 20);
    printf("%d\n", resultado);

    resultado = Multiplicacion(20, 20);
    printf("%d\n", resultado);

    resultado = Division(10, 2);
    printf("%d\n", resultado);

    return 0;
}