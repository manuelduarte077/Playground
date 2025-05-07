#include <stdio.h>
#include <stdlib.h>
#include <string.h>
#include <stdbool.h>

typedef struct Nodo
{
    char nombre[15];
    char numero[12];
    char correo[25];
    char apellido[15];
    struct Nodo *sig, *ant;
} nodo;

void addUser();
void userList();
void printfUser();
void modifyUser();
void removeUser();
nodo *nodoCreate();
nodo *searchUser(char name[15]);

nodo *inicio = NULL;

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
        nuevo->ant = NULL;
        nuevo->sig = NULL;
        return nuevo;
    }
}

void addUser()
{
    nodo *nuevo = nodoCreate();
    nodo *i;

    if (nuevo != NULL)
    {
        printf("Ingresa el nombre del usuario: ");
        scanf("%s", nuevo->nombre);

        printf("Ingresa el apellido del usuario: ");
        scanf("%s", nuevo->apellido);

        printf("Ingresa el correo del usuario: ");
        scanf("%s", nuevo->correo);

        printf("Ingresa el numero de telefono del usuario: ");
        scanf("%s", nuevo->numero);

        if (inicio == NULL)
        {
            inicio = nuevo;
        }
        else
        {
            nodo *ultimo = inicio;
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
    if (inicio == NULL)
    {
        printf("No hay usuarios registrados");
    }
    else
    {
        nodo *i = inicio;
        while (i != NULL)
        {
            printf("Nombre: %s", i->nombre);
            i = i->sig;
        }
    }
}

void printfUser()
{
    if (inicio == NULL)
    {
        printf("\nNo hay usuarios registrados");
    }
    else
    {
        char name[15];
        nodo *encontrado;
        printf("Ingresa el nombre del usuario que quieres buscar");
        scanf("%s", name);
        encontrado = searchUser(name);
        if (encontrado != NULL)
        {
            printf("Nombre: ", encontrado->nombre);
        }
    }
}

void modifyUser()
{
    if (inicio == NULL)
    {
        printf("\nNo hay usuarios registrados");
    }
    else
    {
        char name[15];
        nodo *encontrado;
        printf("Ingresa el nombre del usuario que quieres buscar");
        scanf("%s", name);
        encontrado = searchUser(name);
        if (encontrado != NULL)
        {
            printf("Ingresa el nuevo nombre: ");
            scanf("%s", encontrado->nombre);
            printf("Datos modificados correctamente");
        }
    }
}

void removeUser()
{
    if (inicio == NULL)
    {
        printf("\nNo hay usuarios registrados");
    }
    else
    {
        char name[15];
        nodo *encontrado;
        printf("Ingresa el nombre del usuario que quieres eliminar");
        scanf("%s", name);
        encontrado = searchUser(name);
        if (encontrado != NULL)
        {
            if (encontrado == inicio)
            {
                inicio = inicio->sig;
            }
            else if (encontrado->sig == NULL)
            {
                encontrado->ant->sig = NULL;
            }
            else
            {
                encontrado->ant->sig = encontrado->sig;
                encontrado->sig->ant = encontrado->ant;
            }
            printf("Usuario eliminado correctamente");
        }
    }
}

nodo *searchUser(char name[15])
{
    bool isUser = false;
    if (inicio == NULL)
    {
        printf("\nNo hay usuarios registrados");
    }
    else
    {
        nodo *i = inicio;
        while (i != NULL)
        {
            if (strcmp(i->nombre, name) == 0)
            {
                isUser = true;
                return i;
            }
            i = i->sig;
        }
        if (!isUser)
        {
            printf("\nNo hay resultados para su busqueda.");
            return NULL;
        }
    }
}
