#include <stdio.h>
int opt1 = 0;
int opt2 = 0;

int main()
{
    printf("bienvenido a C store :\n");
    printf("opcion 0 para C bebidas \n");
    printf("opcion 1 para C comidas \n");
    printf("opcion 2 para C postres \n");

    switch (opt1)
    {

    case 0:
        printf("usted eligio la opcion 0, vera nuestro menu de bebidas elija una:\n");

        printf("opcion 0 para C cola cero \n");
        printf("opcion 1 para C cola normal \n");
        printf("opcion 2 para C pina colada \n");

        switch (opt2)
        {
        case 0:
            printf("usted eligio una C cola cero, mmm rico");
            break;

        default:
            break;
        }
        break;

    case 1:
        /* Dispersar, correr a los intrusos */
        break;
    case 2:
        /* Dispersar, correr a los intrusos */
        break;

    default:
        break;
    };

    return 0;
}
