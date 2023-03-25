#include <stdio.h>

int opt1 = 2;
int opt2 = 0;

int main()
{
    printf("bienvenida C store:\n");
    printf("opcion 0 para C bebidas \n");
    printf("opcion 1 para C comidas \n");
    printf("opcion 2 para c postres \n");

    // este programa genera menus segun lo que el usuario elija
    if (opt1 == 0)
    {
        // opcion 0 para C bebidas
        printf("Usted eligio la opcion 0, vera nuestro menu de bebidas elija una:\n");
        printf("Opcion 0 para C cola cero \n");
        printf("Opcion 1 para C cola normal \n");
        printf("Opcion 2 para C pina colada \n");

        if (opt2 == 0)
            printf("Usted eligio una C cola cero, umm rico");
        else if (opt2 == 1)
            printf("Usted eligio una C cola normal, umm rico");
        else if (opt2 == 2)
            printf("Usted eligio una C pina colada, umm rico");
        else
            printf("Ups, solo tenemos 3 tipos de bebidas, marca la alternativa correcta porfavor");
    }
    else if (opt1 == 1)
    {
        // opcion 1 para C comidas
        printf("Usted eligio la opcion 1, vera nuestro menu de comidas:\n");
        printf("Opcion 0 para pollo a la brasa \n");
        printf("Opcion 1 para ceviche \n");
        printf("Opcion 2 para lomo saltado\n");

        if (opt2 == 0)
            printf("Usted eligio un pollo a la brasa \n");
        else if (opt2 == 1)
            printf("Usted eligio un ceviche \n");
        else if (opt2 == 2)
            printf("Usted eligio un lomo saltado \n");
        else
            printf("Ups, solo tenemos 3 tipos de comidas, marca la alternativa correcta porfavor");
    }
    else if (opt1 == 2)
    {
        // opcion 2 para C postres
        printf("Usted eligio la opcion 2, vera nuestra carta de postres;\n");
        printf("Opcion 0 para mazamorra morada \n");
        printf("Opcion 1 para torta de leche \n");
        printf("Opcion 2 para empanada  de carne \n");

        if (opt2 == 0)
            printf("Usted eligio una mazamorra morada \n");
        else if (opt2 == 1)
            printf("Usted eligio una torta de leche");
        else if (opt2 == 2)
            printf("Usted eligio una empanada de carne");
        else
            printf("Ups, solo tenemos 3 tipos de postres, marca la alternativa correcta porfavor");
    }
    else
        printf("Ups, solo tenemos bebidas, comidas y postres. Te agradecemos por tu preferencia");
    // mensaje de manejo de opcion invalida

    return 0;
}