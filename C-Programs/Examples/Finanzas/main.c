#include <stdio.h>
#include <stdbool.h>
#include <string.h>
#define MAX_USERS 100

struct User
{
    char name[15];
    char lastName[15];
    float money;
};

void registerUser(struct User users[], int *count)
{
    struct User user;

    printf("Ingresa el nombre del usuario\n");
    scanf("%s", user.name);

    printf("Ingresa el apellido del usuario\n");
    scanf("%s", user.lastName);

    user.money = 100.0;

    users[*count] = user;

    (*count)++;
    printf("Usuario registrado correctamente\n");
}

int searchUser(struct User users[], int *count, char name[15])
{
    struct User user;
    bool isUser = false;

    for (int i = 0; i < *count; i++)
    {
        if (!strcmp(users[i].name, name))
        {
            isUser = true;
            return i;
        }
    }

    if (!isUser)
    {
        printf("El usuario no existe\n");
        return -1;
    }

    return 0;
}

void showMoney(struct User users[], int *count)
{
    char name[15];
    printf("Ingresa el nombre del usuario\n");
    scanf("%s", name);

    int userIndex = searchUser(users, count, name);

    if (userIndex != -1)
    {
        printf("Dinero de %s %s: %f", users[userIndex].name, users[userIndex].lastName, users[userIndex].money);
    }
}

void addMoney(struct User users[], int *count)
{
    char name[15];
    int deposito;

    printf("Ingresa el nombre del usuario\n");
    scanf("%s", name);

    int userIndex = searchUser(users, count, name);

    if (userIndex != -1)
    {
        printf("Ingresa la cantidad a depositar\n");
        scanf("%d", &deposito);

        users[userIndex].money += deposito;

        printf("Se depositaron %d pesos\nSaldo actual: %f pesos\n", deposito, users[userIndex].money);
    }
}

void removeMoney(struct User users[], int *count)
{
    char name[15];
    float retiro;

    printf("Ingresa el nombre del usuario\n");
    scanf("%s", name);

    int userIndex = searchUser(users, count, name);
    if (userIndex != -1)
    {
        printf("Ingresa la cantidad a retirar\n");
        scanf("%f", &retiro);

        if (retiro <= users[userIndex].money)
        {
            users[userIndex].money -= retiro;
            printf("Retiraste: %f\nTu saldo es de: %f\n", retiro, users[userIndex].money);
        }
        else
        {
            printf("Saldo insuficiente\n");
        }
    }
}

void mainMenu()
{
    printf("Sistema bancario\n");
    printf("\n1) Registrar usuario");
    printf("\n2) Ver dinero del usuario");
    printf("\n3) Depositar dinero");
    printf("\n4) Retirar dinero");
    printf("\n5) Salir\n");
}

int main()
{
    int option;
    int usersCount = 0;
    struct User users[MAX_USERS];

    do
    {
        mainMenu();
        scanf("%d", &option);
        switch (option)
        {
        case 1:
            registerUser(users, &usersCount);
            break;
        case 2:
            showMoney(users, &usersCount);
            break;
        case 3:
            addMoney(users, &usersCount);
            break;
        case 4:
            removeMoney(users, &usersCount);
            break;
        case 5:
            printf("Saliendo");
            break;

        default:
            printf("Opcion no valida");
            break;
        }
    } while (option != 5);

    return 0;
}