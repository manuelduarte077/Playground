#include <stdio.h>
#include <stdlib.h>
#include <stdbool.h>
#include <string.h>

int booksLength = 0;

typedef struct nodoLista
{
    int _id;
    char nombre[25];
    char autor[25];
    char descripcion[40];
    float precio;
    struct nodoLista *sig;
} nodo;

int registrar(nodo **inicio);
int mostrar(nodo *inicio);
void mostrarLibro(nodo *inicio);
nodo *buscar(nodo *inicio, char nombre[25]);
int modificar(nodo **inicio);
int eliminar(nodo **inicio);

int main()
{
    nodo *inicio = NULL;
    int option; // Se inicializa la variable "option"
    do
    {
        printf("Gestion de libros\n\n1) Registrar\n2) Mostrar lista\n3) Buscar\n4) Eliminar\n5) Modificar\n6) Salir\n\nIngresa una opcion: ");
        scanf("%d", &option); // Se lee la opción ingresada por el usuario
        switch (option)
        {
        case 1:
            registrar(&inicio); // Se pasa un puntero a puntero de nodo
            break;
        case 2:
            mostrar(inicio);
            break;
        case 3:
            mostrarLibro(inicio);
            break;
        case 4:
            eliminar(&inicio);
            break;
        case 5:
            modificar(&inicio);
            break;
        case 6:
            printf("Saliendo...\n");
            break;
        default:
            printf("Opcion no valida\n");
        }
    } while (option != 6);
    return 0;
}

void mostrarLibro(nodo *inicio)
{
    char nombre[25];
    printf("\nIngresa el nombre del libro que quieres buscar: ");
    scanf("%s", nombre);
    nodo *encontrado = buscar(inicio, nombre); // Se guarda el nodo encontrado en una variable
    if (encontrado != NULL)
    {
        printf("Id: %d\nNombre: %s\nDescripcion: %s\nAutor: %s\nPrecio: %f\n\n", encontrado->_id, encontrado->nombre, encontrado->descripcion, encontrado->autor, encontrado->precio);
    }
    else
    {
        printf("No se encontraron resultados.\n");
    }
}

int registrar(nodo **inicio)
{
    nodo *nuevo;
    nodo *ultimo = NULL; // Se inicializa a NULL para evitar errores

    for (nodo *i = *inicio; i != NULL; i = i->sig)
    {
        ultimo = i;
    }

    nuevo = (nodo *)malloc(sizeof(nodo)); // Se castea a nodo* para evitar errores
    if (nuevo == NULL)
    {
        printf("No se pudo crear el nodo.\n");
        return (-1);
    }
    else
    {
        nuevo->_id = booksLength + 1;
        nuevo->sig = NULL;
        printf("\nIngresa el nombre del libro: ");
        scanf("%s", nuevo->nombre);
        printf("\nIngresa la descripcion del libro: ");
        scanf("%s", nuevo->descripcion);
        printf("\nIngresa el nombre del autor: ");
        scanf("%s", nuevo->autor);
        printf("\nIngresa el precio del libro: ");
        scanf("%f", &nuevo->precio); // Se recibe el valor como apuntador a float
        if (*inicio == NULL)
        {
            *inicio = nuevo;
        }
        else
        {
            ultimo->sig = nuevo;
        }
        booksLength++; // Se incrementa el contador de libros
    }
    return 0;
}

int mostrar(nodo *inicio)
{
    nodo *i = inicio;

    if (i == NULL)
    {
        printf("No hay libros registrados.\n");
        return -1;
    }
    else
    {
        while (i != NULL)
        {
            printf("Id: %d\nNombre: %s\nDescripcion: %s\nAutor: %s\nPrecio: %f\n\n", i->_id, i->nombre, i->descripcion, i->autor, i->precio);
            i = i->sig;
        }
    }
    return 0;
}

nodo *buscar(nodo *inicio, char nombre[25])
{
    nodo *i = inicio;

    if (i == NULL)
    {
        return NULL;
    }
    else
    {
        while (i != NULL)
        {
            if (strcmp(i->nombre, nombre) == 0) // Se usa la función strcmp para comparar cadenas
            {
                return i;
            }
            i = i->sig;
        }
        return NULL;
    }
}

int modificar(nodo **inicio)
{
    nodo *i = *inicio, *encontrado = NULL; // Se necesita asignar un NULL por defecto
    char nombre[25];
    if (i == NULL)
    {
        printf("No hay libros registrados.\n");
        return -1;
    }
    else
    {
        printf("\nIngresa el nombre del libro que quieres modificar: ");
        scanf("%s", nombre);
        encontrado = buscar(i, nombre);

        if (encontrado == NULL)
        {
            printf("No hay resultados.\n");
        }
        else
        {
            printf("Ingresa el nuevo nombre: ");
            scanf("%s", encontrado->nombre); // No se necesita usar el operador '&' porque 'encontrado' ya es un puntero
        }
    }
    return 0;
}

int eliminar(nodo **inicio)
{
    char nombre[25];
    nodo *i = *inicio, *encontrado = NULL, *anterior = NULL;
    if (i == NULL)
    {
        printf("No hay libros registrados.\n");
        return -1;
    }
    else
    {
        printf("\nIngresa el nombre del libro que quieres eliminar: ");
        scanf("%s", nombre);
        encontrado = buscar(i, nombre);
        if (encontrado == NULL)
        {
            printf("No se encontraron resultados.\n");
            return -1;
        }
        else
        {

            if (encontrado == *inicio)
            { // Si se va a eliminar el nodo inicio, se actualiza el inicio de la lista
                *inicio = encontrado->sig;
            }
            else
            {
                anterior = i;
                while (i != NULL)
                {
                    if (i == encontrado)
                    { // Se busca el nodo anterior al encontrado
                        anterior->sig = i->sig;
                        break;
                    }
                    anterior = i;
                    i = i->sig;
                }
            }
            free(encontrado);
            printf("Libro eliminado correctamente.\n");
        }
    }
    return 0;
}