#include <stdio.h>
#include <string.h>
#include <stdbool.h>
#define NUM_CAMPOS 4
#define NUM_PERSONAS 100

struct DatosPersona
{
    char nombre[50];
    char apellido[50];
    char colorOjos[20];
    char colorCabello[20];
} datos[NUM_PERSONAS];

int userLength = 0;
char *nombresCampos[NUM_CAMPOS] = {"nombre", "apellido", "color de ojos", "color de cabello"};

void mostrarUsuario();
void eliminarUsuario();
void registrarUsuario();
bool validateUsersCount();
void mostrarListaDeUsuarios();
int buscarUsuario(char nombre[50]);

int main()
{
    int opcion;
    do
    {
        printf("\nGestion de usuarios\n\n1) Registrar usuario\n2) Mostrar lista de usuarios\n3) Eliminar usuario\n4) Buscar usuario\n5) Salir\n\nIngresa una opcion: ");
        scanf("%d", &opcion);
        switch (opcion)
        {
        case 1:
            registrarUsuario();
            break;
        case 2:
            mostrarListaDeUsuarios();
            break;
        case 3:
            eliminarUsuario();
            break;
        case 4:
            mostrarUsuario();
            break;
        case 5:
            printf("Saliendo...");
            break;
        default:
            printf("Opcion no valida");
        }
    } while (opcion != 5);

    return 0;
}

bool validateUsersCount()
{
    if (userLength == 0)
    {
        printf("No hay usuarios registrados.");
    }

    return userLength != 0;
}

int buscarUsuario(char nombre[50])
{
    int low = 0;
    int high = userLength - 1;

    while (low <= high)
    {
        int mid = (low + high) / 2;

        if (strcmp(datos[mid].nombre, nombre) == 0)
        {
            return mid;
        }
        else if (strcmp(datos[mid].nombre, nombre) < 0)
        {
            low = mid + 1;
        }
        else
        {
            high = mid - 1;
        }
    }

    printf("Ese usuario no existe.\n");
    return -1;
}

void registrarUsuario()
{
    char *campos[NUM_CAMPOS] = {datos[userLength].nombre, datos[userLength].apellido, datos[userLength].colorOjos, datos[userLength].colorCabello};

    for (int i = 0; i < NUM_CAMPOS; i++)
    {
        printf("Ingrese su %s: ", nombresCampos[i]);
        scanf("%s", campos[i]);
    }

    userLength++;
    printf("Usuario registrado correctamente");
}

void mostrarListaDeUsuarios()
{
    int userCountValidator = validateUsersCount();
    if (userCountValidator)
    {
        for (int i = 0; i < userLength; i++)
        {
            char *campos[NUM_CAMPOS] = {datos[i].nombre, datos[i].apellido, datos[i].colorOjos, datos[i].colorCabello};

            for (int j = 0; j < NUM_CAMPOS; j++)
            {
                printf("%s: %s\n", nombresCampos[j], campos[j]);
            }
        }
    }
}

void mostrarUsuario()
{
    char nombre[50];
    int userCountValidator = validateUsersCount();

    if (userCountValidator)
    {
        printf("Ingresa el nombre del usuario que quieres buscar: ");
        scanf("%s", nombre);
        int userIndex = buscarUsuario(nombre);

        if (userIndex != -1)
        {
            char *campos[NUM_CAMPOS] = {datos[userIndex].nombre, datos[userIndex].apellido, datos[userIndex].colorOjos, datos[userIndex].colorCabello};
            for (int j = 0; j < NUM_CAMPOS; j++)
            {
                printf("%s: %s\n", nombresCampos[j], campos[j]);
            }
        }
    }
}

void eliminarUsuario()
{
    char nombre[50];
    int userCountValidator = validateUsersCount();

    if (userCountValidator)
    {
        printf("Ingresa el nombre del usuario que quieres eliminar: ");
        scanf("%s", nombre);
        int userIndex = buscarUsuario(nombre);

        if (userIndex != -1)
        {
            datos[userIndex] = datos[userIndex - 1];
            userLength--;
            printf("Usuario eliminado correctamente.");
        }
    }
}
