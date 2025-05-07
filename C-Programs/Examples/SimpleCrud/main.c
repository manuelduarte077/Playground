#include <stdio.h>
#include <string.h>
#include <stdbool.h>

#define MAX_USERS 100

int userLength = 0;

struct Birthday
{
    int day;
    int month;
    int year;
};

struct User
{
    int _id;
    int years;
    char name[15];
    char lastName[15];
    struct Birthday birthday;
};

void loop();

int search(struct User (*user)[], int _id);
void agregar(struct User (*user)[]);
void eliminar(struct User (*user)[]);
void editar(struct User (*user)[]);
void userList(struct User (*user)[]);

int main()
{
    loop();
    return 0;
}

void loop()
{
    int option;
    struct User user[MAX_USERS];

    do
    {
        printf("\n\nSistema de usuarios\n\n1) agregar usuario\n2) eliminar usuario\n3) lista de usuarios\n4) salir del sistema\n5) Editar usuario\n\n");
        scanf("%d", &option);
        switch (option)
        {
        case 1:
            agregar(&user);
            break;
        case 2:
            eliminar(&user);
            break;
        case 3:
            userList(&user);
            break;
        case 4:
            printf("Saliendo del sistema...");
            break;
        case 5:
            editar(&user);
            break;
        default:
            printf("La opcion no existe.");
            break;
        }
    } while (option != 4);
}

int search(struct User (*user)[], int _id)
{
    bool isUser = false;
    for (int i = 0; i < userLength; i++)
    {
        if ((*user)[i]._id == _id)
        {
            isUser = true;
            return i;
        }
    }
    if (!isUser)
    {
        return -1;
    }
}

void agregar(struct User (*user)[])
{
    printf("Escribe el nombre del usuario\n");
    scanf("%s", (*user)[userLength].name);
    printf("Escribe el apellido del usuario\n");
    scanf("%s", (*user)[userLength].lastName);
    printf("Escribe la edad del usuario\n");
    scanf("%d", &(*user)[userLength].years);
    printf("Dia de nacimiento del usuario\n");
    scanf("%d", &(*user)[userLength].birthday.month);
    printf("Mes de nacimiento del usuario\n");
    scanf("%d", &(*user)[userLength].birthday.day);
    printf("Anio de nacimiento del usuario\n");
    scanf("%d", &(*user)[userLength].birthday.year);
    (*user)[userLength]._id = userLength + 1;
    userLength++;
}

void eliminar(struct User (*user)[])
{
    int _id;
    printf("Escribe el id del usuario que quieres eliminar\n");
    scanf("%d", &_id);

    int userIndex = search(user, _id);
    if (userIndex != -1)
    {
        for (int i = userIndex; i < userLength - 1; i++)
        {
            (*user)[i] = (*user)[i + 1];
        }
        userLength--;
    }
    else
    {
        printf("El usuario no existe");
    }
}

void editar(struct User (*user)[])
{
    char newStringValue[20];
    int option, _id, userIndex, newNumberValue;
    printf("Escribe el id del usuario que quieres editar\n");
    scanf("%d", &_id);

    userIndex = search(user, _id);

    if (userIndex != -1)
    {
        do
        {
            printf("Que quieres editar\n\n1) Nombre: %s\n2) Apellido: %s\n3) Edad: %d\n4) Fecha de nacimiento: %d/%d/%d\n5) Atras\n\n",
                   (*user)[userIndex].name,
                   (*user)[userIndex].lastName,
                   (*user)[userIndex].years,
                   (*user)[userIndex].birthday.day,
                   (*user)[userIndex].birthday.month,
                   (*user)[userIndex].birthday.year);
            scanf("%d", &option);
            switch (option)
            {
            case 1:
                printf("Escribe el nuevo nombre:\n");
                scanf("%s", newStringValue);
                strcpy((*user)[userIndex].name, newStringValue);
                break;
            case 2:
                printf("Escribe el nuevo apellido:\n");
                scanf("%s", newStringValue);
                strcpy((*user)[userIndex].lastName, newStringValue);
                break;
            case 3:
                printf("Escribe la nueva edad:\n");
                scanf("%d", &newNumberValue);
                (*user)[userIndex].years = newNumberValue;
                break;
            case 4:
                printf("Escribe el nuevo dia de nacimiento:\n");
                scanf("%d", &newNumberValue);
                (*user)[userIndex].birthday.day = newNumberValue;

                printf("Escribe el nuevo mes de nacimiento:\n");
                scanf("%d", &newNumberValue);
                (*user)[userIndex].birthday.month = newNumberValue;

                printf("Escribe el nuevo anio de nacimiento:\n");
                scanf("%d", &newNumberValue);
                (*user)[userIndex].birthday.year = newNumberValue;
                break;
            case 5:
                break;
            default:
                printf("Opcion invalida. Intenta de nuevo.\n");
                break;
            }
        } while (option != 5);
    }
    else
    {
        printf("El usuario no existe\n");
    }
}

void userList(struct User (*user)[])
{
    for (int i = 0; i < userLength; i++)
    {
        printf("\nId: %d", (*user)[i]._id);
        printf("\nNombre: %s", (*user)[i].name);
        printf("\nApellido: %s", (*user)[i].lastName);
        printf("\nAdad: %d", (*user)[i].years);
        printf("\nFecha de nacimiento: %d/%d/%d", (*user)[i].birthday.day, (*user)[i].birthday.month, (*user)[i].birthday.year);
    }
    return;
}
