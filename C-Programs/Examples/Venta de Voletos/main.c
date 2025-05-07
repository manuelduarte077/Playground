/* Venta de Boletos. Realizar un programa que permita administrar la venta
de boletos en un teatro. El precio de cada boleto depende de la edad del comprador. El
precio del boleto de las personas con edades comprendidas entre 12 y 45 años es el doble
del precio de las personas menores de 12 años. El precio del boleto para las personas
mayores a 45 años es la mitad de las personas menores de 12 años. Si se trata de un
estudiante, no importa la edad, el monto es fijo. Mostrar el total de boletos vendidos y el
monto de ganancias obtenidos al final del día.  */

#include <stdio.h>
#include <stdbool.h>
#define MAXIMOS_BOLETOS 100
#define MONTO_FIJO 10

struct User
{
    int edad;
    char name[15];
    bool student;
    int monto;
};

void venderBoleto(struct User users[], int *boletosVendidos, int *maximosBoletos)
{
    struct User user;
    char option;

    printf("Ingresa tu nombre: ");
    scanf("%s", user.name);

    printf("Ingresa tu edad: ");
    scanf("%d", &user.edad);
    getchar(); // Lee y descarta el carácter de salto de línea

    printf("Eres estudiante? (s/n): ");
    scanf("%c", &option);

    if (option == 's')
    {
        user.student = true;
    }
    else
    {
        user.student = false;
    }

    if (user.edad >= 12 && user.edad <= 45)
    {
        user.monto = MONTO_FIJO * 2;
    }
    else if (user.edad > 45)
    {
        user.monto = MONTO_FIJO / 2;
    }
    else if (user.edad < 12)
    {
        user.monto = MONTO_FIJO;
    }

    users[*boletosVendidos] = user;

    (*boletosVendidos)++;
    (*maximosBoletos)--;

    printf("Boleto vendido correctamente.\n");
}

void verGanancias(struct User users[], int *boletosVendidos)
{
    int ganancias = 0;

    for (int i = 0; i < *boletosVendidos; i++)
    {
        ganancias += users[i].monto;
    }

    printf("El total de ganancias es: %d", ganancias);
}

void mainMenu()
{
    printf("\nSistema de gestion de boletos\n");
    printf("\n1) Vender boleto");
    printf("\n2) Ver ganancias");
    printf("\n3) Ver cantidad de boletos vendidos");
    printf("\n4) Ver boletos restantes");
    printf("\n5) Finalizar dia (salir)\n");
}

int main()
{
    int option, maximosBoletos = MAXIMOS_BOLETOS, boletosVendidos = 0;
    struct User users[MAXIMOS_BOLETOS];

    do
    {
        mainMenu();
        printf("\nIngresa una opcion: ");
        scanf("%d", &option);

        switch (option)
        {
        case 1:
            venderBoleto(users, &boletosVendidos, &maximosBoletos);
            break;
        case 2:
            verGanancias(users, &boletosVendidos);
            break;
        case 3:
            printf("\nLa cantidad de boletos vendidos es: %d", boletosVendidos);
            break;
        case 4:
            printf("\nLa cantidad de boletos restantes es: %d", maximosBoletos);
            break;
        case 5:
            printf("\nSaliendo...");
            break;
        default:
            printf("\nLa opcion no es valida");
            break;
        }
    } while (option != 5 || maximosBoletos = 0);

    return 0;
}