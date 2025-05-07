/* #1 Importar dependencias */
#include <stdio.h>
#include <stdlib.h>
#include <string.h>
#include <stdbool.h>

/* #2 Crear estructura de datos */
typedef struct Nodo
{
    char name[15];
    char lastName[15];
    struct Nodo *sig, *ant;
} nodo;

/* #3 Crear un apuntador inicial */
nodo *start = NULL;

/* #4 Definir funciones */
void addUser();
void userList();
void printfUser();
void modifyUser();
void removeUser();
nodo *nodoCreate();
nodo *searchUser(char name[15]);

/* #5 Crear la main con el menu */
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

/* Creamos un nuevo nodo con malloc */
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
        nuevo->ant = NULL;
        return nuevo;
    }
}

/* Funcion para buscar usuario */
nodo *searchUser(char name[15])
{
    /* Variable que indica si encontro el usuario */
    bool isUser = false;

    /* Creamos un indice y lo igualamos al inicio */
    nodo *i = start;

    /* Si el inicio es NULL quiere decir que no hay usuarios */
    if (start == NULL)
    {
        printf("\nNo hay usuarios registrados.");
        return NULL;
    }
    else
    {
        /* Recorremos el indice hasta llegar al ultimo */
        while (i != NULL)
        {
            /* Comparamos el nombre segun el indice con la cadena de caracteres "name" */
            if (strcmp(i->name, name) == 0)
            {
                /* Cambiamos la variable y retornamos el indice encontrado */
                isUser = true;
                return i;
            }
            /* Actualizamos el indice al siguiente */
            i = i->sig;
        }
        /* Si no encontro retornamos NULL */
        if (!isUser)
        {
            printf("\nUsuario no encontrado.");
            return NULL;
        }
    }
}

/* Funcion para agregar un usuario */
void addUser()
{
    /* Creamos un nuevo nodo */
    nodo *nuevo = nodoCreate();

    /* Si el nodo no es igual a NULL, pedimos los datos requeridos */
    if (nuevo != NULL)
    {
        printf("Ingresa el nombre del usuario: ");
        scanf("%s", nuevo->name);

        printf("Ingresa el apellido del usuario: ");
        scanf("%s", nuevo->lastName);

        /* Si no hay usuarios, hacemos que el inicio sea el nuevo */
        if (start == NULL)
        {
            start = nuevo;
        }
        else
        {
            /* Buscamos el ultimo nodo*/
            nodo *ultimo = start;
            while (ultimo->sig != NULL)
            {
                ultimo = ultimo->sig;
            }
            /* Asignamos los datos correspondientes */
            ultimo->sig = nuevo;
            nuevo->ant = ultimo;
        }
        printf("\nUsuario registrado correctamente.");
    }
}

void userList()
{
    /* Verificamos que existan usuarios */
    if (start == NULL)
    {
        printf("\nNo hay usuarios registrados.");
    }
    else
    {
        /* Recorremos los nodos e imprimimos los datos */
        nodo *i = start;
        while (i != NULL)
        {
            printf("Nombre: %s\nApellido: %s\n", i->name, i->lastName);
            i = i->sig;
        }
    }
}

/* Funcion para eliminar un usuario */
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
            else if (encontrado->sig == NULL)
            {
                encontrado->ant->sig = NULL;
            }
            else
            {
                encontrado->ant->sig = encontrado->sig;
                encontrado->sig->ant = encontrado->ant;
            }
        }
        printf("\nUsuario eliminado correctamente.");
    }
}

/* Funcion para modificar los datos de un usuario */
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

/* Funcion para imprimir un usuario en especifico */
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