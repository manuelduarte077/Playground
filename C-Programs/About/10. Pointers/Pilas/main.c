#include <stdio.h>
#include <string.h>
#include <stdlib.h>
#include <stdbool.h>

typedef struct Nodo
{
    int dato;
    struct nodo *sig;
} nodo;

nodo *top = NULL;
int dataLength = 0;

void create();
void printAll();
void sumatoria();
void desapilar();
nodo *nodoCreate();
void printAllWithLength();

int main()
{
    int option;
    do
    {
        printf("\n\nMENU\n\n1) Crear\n2) Imprimir\n3) Desapilar\n4) Imprimir con length\n5) Sumatoria\n6) Salir\n\nIngresa la opcion: ");
        scanf("%d", &option);

        switch (option)
        {
        case 1:
            create();
            break;
        case 2:
            printAll();
            break;
        case 3:
            desapilar();
            break;
        case 4:
            printAllWithLength();
            break;
        case 5:
            sumatoria();
            break;
        case 6:
            printf("\nSaliendo del programa...");
            break;
        default:
            printf("\nOpcion no valida.");
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
        printf("\nNo se pudo crear el nodo");
        return NULL;
    }
    else
    {
        nuevo->sig = NULL;
        return nuevo;
    }
}

void create()
{
    nodo *nuevo = nodoCreate();
    if (nuevo != NULL)
    {
        printf("\nIngresa el dato: ");
        scanf("%d", &nuevo->dato);
        nuevo->sig = top;
        top = nuevo;
        dataLength++;
    }
};

void desapilar()
{
    if (top == NULL)
    {
        printf("No hay datos registrados");
    }
    else
    {
        nodo *aux = top;
        if (aux->sig == NULL)
        {
            top = NULL;
        }
        top = aux->sig;
        free(aux);
        dataLength--;
    }
}

void printAll()
{
    if (top == NULL)
    {
        printf("\nNo hay registro de datos.");
    }
    else
    {
        nodo *i = top;
        while (i != NULL)
        {
            printf("\nDato: %d", i->dato);
            i = i->sig;
        }
    }
};

void sumatoria()
{
    int total = 0;
    if (top == NULL)
    {
        printf("\nNo hay registro de datos.");
    }
    else
    {
        nodo *i = top;
        while (i != NULL)
        {
            total = total + i->dato;
            i = i->sig;
        }
        printf("Sumatoria de los datos: %d", total);
    }
}

void printAllWithLength()
{
    if (top == NULL)
    {
        printf("\nNo hay registro de datos.");
    }
    else
    {
        nodo *aux = top;
        for (int i = 0; i < dataLength; i++)
        {
            printf("\nDato: %d", aux->dato);
            aux = aux->sig;
        }
    }
}