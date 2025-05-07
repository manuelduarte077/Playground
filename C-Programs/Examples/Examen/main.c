#include <stdio.h>
#include <stdlib.h>
#include <string.h>
#include <stdbool.h>

typedef struct User
{
    int years;
    char name[15];
    char lastName[15];
    struct User *sig, *ant;
} nodo;

nodo *start = NULL;

void userList();
void editUser();
void printUser();
void deleteUser();
void createUser();
nodo *createNodo();
nodo *searchUser(char name[15]);

int main()
{
    int option;
    do
    {
        printf("\n\nSistema de usuarios:\n\n1) Crear\n2) Eliminar\n3) Editar\n4) Mostrar\n5) Lista\n6) Salir\n\nIngresa una opcion: ");
        scanf("%d", &option);
        switch (option)
        {
        case 1:
            createUser();
            break;
        case 2:
            deleteUser();
            break;
        case 3:
            editUser();
            break;
        case 4:
            printUser();
            break;

        case 5:
            userList();
            break;
        case 6:
            printf("\nSaliendo...");
            break;

        default:
            printf("\nOpcion no valida");
            break;
        }
    } while (option != 6);

    return 0;
}

nodo *createNodo()
{
    nodo *newNodo = (nodo *)malloc(sizeof(nodo));
    if (newNodo == NULL)
    {
        printf("\nNo se pudo crear el nodo.");
        return NULL;
    }
    else
    {
        newNodo->sig = NULL;
        newNodo->ant = NULL;
        return newNodo;
    }
}

nodo *searchUser(char name[15])
{
    nodo *i = start;
    bool isUser = false;
    if (start != NULL)
    {
        while (i != NULL)
        {
            if (strcmp(i->name, name) == 0)
            {
                isUser = true;
                return i;
            }
            i = i->sig;
        }
        if (!isUser)
        {
            printf("\nUsuario no encontrado");
            return NULL;
        }
    }
}

void createUser()
{
    nodo *newUser;
    newUser = createNodo();
    if (newUser != NULL)
    {
        printf("\nIngresa el nombre del usuario: ");
        scanf("%s", newUser->name);

        printf("\nIngresa el apellido del usuario: ");
        scanf("%s", newUser->lastName);

        printf("\nIngresa la edad del usuario: ");
        scanf("%d", &newUser->years);

        if (start == NULL)
        {
            start = newUser;
        }
        else
        {
            nodo *ultimo = start;
            while (ultimo->sig != NULL)
            {
                ultimo = ultimo->sig;
            }
            ultimo->sig = newUser;
            newUser->ant = ultimo;
        }
        printf("\nUsuario registrado correctamente.");
    }
}

void deleteUser()
{
    char name[15];
    nodo *encontrado;
    if (start != NULL)
    {
        printf("\nIngresa el nombre del usuario que quieres eliminar: ");
        scanf("%s", name);
        encontrado = searchUser(name);
        if (encontrado != NULL)
        {
            if (encontrado == start)
            {
                start = encontrado->sig;
            }
            else if (encontrado->sig == NULL)
            {
                encontrado->ant->sig = NULL;
            }
            else
            {
                encontrado->sig->ant = encontrado->ant;
                encontrado->ant->sig = encontrado->sig;
            }
            free(encontrado);
            printf("\nUsuario eliminado correctamente");
        }
    }
}

void printUser()
{
    char name[15];
    nodo *user;
    if (start != NULL)
    {
        printf("\nIngresa el nombre del usuario que quieres mostrar: ");
        scanf("%s", name);

        user = searchUser(name);
        if (user != NULL)
        {
            printf("Datos del usuario:\n\nNombre: %s\nApellido: %s\nEdad: %d", user->name, user->lastName, user->years);
        }
    }
}

void editUser()
{
    char name[15];
    nodo *user;
    if (start != NULL)
    {
        printf("\nIngresa el nombre del usuario que quieres mostrar: ");
        scanf("%s", name);

        user = searchUser(name);
        if (user != NULL)
        {
            printf("\nIngresa el nuevo nombre del usuario: ");
            scanf("%s", user->name);

            printf("\nIngresa el nuevo apellido del usuario: ");
            scanf("%s", user->lastName);

            printf("\nIngresa la nueva edad del usuario: ");
            scanf("%d", &user->years);

            printf("\nUsuario editado correctamente");
        }
    }
}

void userList()
{
    nodo *i = start;
    if (start != NULL)
    {
        while (i != NULL)
        {
            printf("Datos del usuario:\n\nNombre: %s\nApellido: %s\nEdad: %d", i->name, i->lastName, i->years);
            i = i->sig;
        }
    }
    else
    {
        printf("\nNo hay usuarios registrados");
    }
}