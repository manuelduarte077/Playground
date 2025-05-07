#include <stdio.h>
#include <stdlib.h>
#include <string.h>
#include <stdbool.h>

typedef struct User
{
    char name[15];
    struct User *sig, *ant;
} nodo;

nodo *start = NULL;

void userList();
void insertUser();
void modifyUser();
void removeUser();
nodo *nodoCreate();
nodo *searchUser(char name[15]);

int main()
{
    int option;
    do
    {
        printf("\n\nNoche de codigo\n\n1) Insertar\n2) Borrar\n3) Lista de usuarios\n4) Modificar\n5) Salir\n\nIngresa una opcion: ");
        scanf("%d", &option);
        switch (option)
        {
        case 1:
            insertUser();
            break;
        case 2:
            removeUser();
            break;
        case 3:
            userList();
            break;
        case 4:
            modifyUser();
            break;
        case 5:
            printf("Saliendo del programa.");
            break;
        default:
            printf("Opcion no valida");
            break;
        }
    } while (option != 5);

    return 0;
}

nodo *nodoCreate()
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

void insertUser()
{
    nodo *newUser;
    newUser = nodoCreate();
    if (newUser != NULL)
    {
        printf("\nIngresa el nombre del usuario: ");
        scanf("%s", newUser->name);
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

nodo *searchUser(char name[15])
{
    bool isUser = false;
    for (nodo *i = start; i != NULL; i = i->sig)
    {
        if (strcmp(name, i->name) == 0)
        {
            isUser = true;
            return i;
        }
    }
    if (!isUser)
    {
        printf("\nNo existe tal usuario.");
        return NULL;
    }
}

void removeUser()
{
    char name[15];
    if (start == NULL)
    {
        printf("\nNo hay usuarios registrados.");
    }
    else
    {
        printf("\nIngresa el nombre del usuario que quieres borrar: ");
        scanf("%s", name);
        nodo *user = searchUser(name);
        if (user != NULL)
        {
            if (user == start)
            {
                start = start->sig;
            }
            else if (user->sig == NULL)
            {
                user->ant->sig = NULL;
            }
            else
            {
                user->ant->sig = user->sig;
                user->sig->ant = user->ant;
            }
            printf("\nUsuario eliminado correctamente.");
        }
    }
}

void userList()
{
    if (start == NULL)
    {
        printf("\nNo hay usuarios registrados.");
    }
    else
    {
        for (nodo *i = start; i != NULL; i = i->sig)
        {
            printf("\nNombre: %s", i->name);
        }
    }
}

void modifyUser()
{
    char name[15];
    if (start == NULL)
    {
        printf("\nNo hay usuarios registrados");
    }
    else
    {
        printf("\nIngresa el nombre del usuario: ");
        scanf("%s", name);
        nodo *user = searchUser(name);
        if (user != NULL)
        {
            printf("\nIngresa el nuevo nombre: ");
            scanf("%s", user->name);
            printf("\nUsuario modificado correctamente.");
        }
    }
}