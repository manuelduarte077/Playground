#include <stdio.h>
#include <stdbool.h>

typedef struct Obj
{
    int data;
} obj;

int dataLength = 0;
obj data[];

void push();
void read();
void search();
void splice();

int main()
{
    int option;

    do
    {
        printf("\nCrud con arreglos\n\n1) Crear\n2) Imprimir\n3) Buscar\n4) Borrar\n5) Salir\n\nIngresa una opcion: ");
        scanf("%d", &option);
        switch (option)
        {
        case 1:
            push();
            break;
        case 2:
            read();
            break;
        case 3:
            search();
            break;
        case 4:
            splice();
            break;
        case 5:
            printf("\nSaliendo del programa...");
            break;
        default:
            printf("\nOpcion no valida...");
            break;
        }
    } while (option != 5);

    return 0;
}

void push()
{
    obj nuevo;
    printf("\nIngrsa el dato: ");
    scanf("%d", &nuevo.data);
    data[dataLength] = nuevo;
    dataLength++;
};

void read()
{
    if (dataLength == 0)
    {
        printf("No hay datos registrados.");
    }
    else
    {
        for (int i = 0; i < dataLength; i++)
        {
            printf("\nDato: %d", data[i].data);
        }
    }
};

int find(int dataSearch)
{
    bool isData = false;
    for (int i = 0; i < dataLength; i++)
    {
        if (data[i].data == dataSearch)
        {
            isData = true;
            return i;
        }
    }
    if (!isData)
    {
        printf("\nDato no encontrado.");
        return -1;
    }
}

void search()
{
    if (dataLength == 0)
    {
        printf("No hay datos registrados.");
    }
    else
    {
        int dataSearch;
        printf("\n\nIngresa el dato que quieres buscar: ");
        scanf("%d", &dataSearch);

        int index = find(dataSearch);

        if (index != -1)
        {
            printf("Dato: %d", data[index].data);
        }
    }
};

void splice()
{
    if (dataLength == 0)
    {
        printf("No hay datos registrados.");
    }
    else
    {
        int dataSearch;
        printf("\n\nIngresa el dato que quieres eliminar: ");
        scanf("%d", &dataSearch);

        int index = find(dataSearch);

        if (index != -1)
        {
            for (int i = index; i < dataLength; i++)
            {
                data[i] = data[i + 1];
            }
            dataLength--;
        }
    }
};
