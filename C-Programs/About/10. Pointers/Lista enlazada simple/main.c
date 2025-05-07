#include <stdio.h>
#include <stdlib.h>
#include <string.h>
#include <stdbool.h>

typedef struct Nodo
{
    char name[15];
    char lastName[15];
    struct Nodo *sig;
} nodo;

nodo *start = NULL;

void addUser();
void userList();
void printfUser();
void modifyUser();
void removeUser();
nodo *nodoCreate();
nodo *searchUser(char name[15]);

int main()
{
    int option;
    do
    {
        printf("\nUser system\n\n1) Add user\n2) Remove user\n3) Modify user\n4) Search user\n5) User list\n6) Exit\n\nSelect a option: ");
        scanf("%d", &option);
        switch (option)
        {
        case 1:
            addUser();
            break;
        case 2:
            removeUser();
            break;
        case 3:
            modifyUser();
            break;
        case 4:
            printfUser();
            break;
        case 5:
            userList();
            break;
        case 6:
            printf("Saliendo del programa...");
            break;
        default:
            printf("Opcion no valida");
            break;
        }
    } while (option != 6);

    return 0;
}

nodo *nodoCreate()
{
    nodo *nuevo = (nodo *)malloc(sizeof(nodo));
    if (nuevo == NULL)
    {
        printf("No se pudo crear el nodo");
        return NULL;
    }
    else
    {
        nuevo->sig = NULL;
        return nuevo;
    }
}

nodo *searchUser(char name[15])
{
    bool isUser = false;
    nodo *i = start;
    if (start == NULL)
    {
        printf("\nNo hay usuarios registrados.");
        return NULL;
    }
    else
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
            printf("\nUsuario no encontrado.");
            return NULL;
        }
    }
}

void addUser()
{
    nodo *nuevo = nodoCreate();

    if (nuevo != NULL)
    {
        printf("Ingresa el nombre del usuario: ");
        scanf("%s", nuevo->name);

        printf("Ingresa el apellido del usuario: ");
        scanf("%s", nuevo->lastName);
        if (start == NULL)
        {
            start = nuevo;
        }
        else
        {
            nodo *ultimo = start;
            while (ultimo->sig != NULL)
            {
                ultimo = ultimo->sig;
            }
            ultimo->sig = nuevo;
        }
        printf("\nUsuario registrado correctamente.");
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
        nodo *i = start;
        while (i != NULL)
        {
            printf("Nombre: %s\nApellido: %s\n", i->name, i->lastName);
            i = i->sig;
        }
    }
}

void removeUser()
{
    char name[15];
    nodo *i = start, *x = NULL;

    if (start == NULL)
    {
        printf("\nNo hay usuarios registrados.");
    }
    else
    {
        printf("Ingresa el nombre del usuario que quieres buscar: ");
        scanf("%s", name);

        nodo *encontrado = searchUser(name);
        if (encontrado != NULL)
        {
            if (encontrado == start)
            {
                start = encontrado->sig;
            }
            else
            {
                while (i != NULL)
                {
                    if (i->sig == encontrado)
                    {
                        x = i;
                        break;
                    }
                    i = i->sig;
                }
                if (x != NULL)
                {
                    x->sig = encontrado->sig;
                    free(encontrado);
                }
            }
            printf("\nUsuario eliminado correctamente.");
        }
        else
        {
            printf("\nNo hay resultados.");
        }
    }
}

void modifyUser()
{
    char name[15];
    if (start == NULL)
    {
        printf("\nNo hay usuarios registrados.");
    }
    else
    {
        printf("\nIngresa el nombre del usuario que quieres modificar: ");
        scanf("%s", name);
        nodo *encontrado = searchUser(name);

        if (encontrado != NULL)
        {
            printf("\nIngresa el nuevo nombre: ");
            scanf("%s", encontrado->name);
            printf("\nIngresa el nuevo apellido: ");
            scanf("%s", encontrado->lastName);
            printf("\nUsuario modificado correctamente.");
        }
        else
        {
            printf("\nNo hay resultados.");
        }
    }
}

void printfUser()
{
    char name[15];
    if (start != NULL)
    {
        printf("\nIngresa el nombre del usuario: ");
        scanf("%s", name);
        nodo *encontrado = searchUser(name);
        if (encontrado != NULL)
        {
            printf("\nNombre: %s\nApellido: %s", encontrado->name, encontrado->lastName);
        }
    }
    else
    {
        printf("\nNo hay usuarios registrados.");
    }
}