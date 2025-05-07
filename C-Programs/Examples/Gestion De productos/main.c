/*
Manipular los productos de un almacén. El sistema debe
permitir administrar las operaciones básicas (registrar, buscar, mostrar, modificar y
eliminar) sobre los productos, además de mostrar el nombre  y precio del producto con el
precio mayor, el nombre y precio del producto con el precio menor y el promedio de los
precios de los productos.
*/

#include <stdio.h>
#include <string.h>
#include <stdbool.h>
#define MAXIMOS_PRODUCTOS 100

struct Producto
{
    int precio;
    char nombre[20];
};

struct Producto productos[MAXIMOS_PRODUCTOS];

int cantidadProductos;

int buscarProducto(char nombre[20])
{
    bool isProduct = false;
    for (int i = 0; i < cantidadProductos; i++)
    {
        if (stricmp(productos[i].nombre, nombre) == 0)
        {
            isProduct = true;
            return i;
        }
    }

    if (!isProduct)
    {
        printf("El producto no existe.\n");
        return -1;
    }

    return 0;
}

void registrarProducto()
{
    struct Producto producto;

    printf("Ingresa el nombre del producto: ");
    scanf("%s", producto.nombre);

    printf("Ingresa el precio del producto: ");
    scanf("%d", &producto.precio);

    productos[cantidadProductos] = producto;
    cantidadProductos++;

    printf("Producto agregado correctamente.\n");
}

void eliminarProducto()
{
    char nombre[20];
    int productoIndex = -1;
    printf("Ingresa el nombre del producto que quieres eliminar: ");
    scanf("%s", nombre);
    productoIndex = buscarProducto(nombre);

    if (productoIndex != -1)
    {
        for (int i = productoIndex; i < cantidadProductos; i++)
        {
            productos[i] = productos[i + 1];
        }
        cantidadProductos--;
        printf("Producto eliminado correctamente.\n");
    }
    else
    {
        printf("El producto no existe.\n");
    }
}

void modificarProducto()
{
    char nombre[20];
    int productoIndex = -1;

    printf("Ingresa el nombre del producto");
    scanf("%s", nombre);
    productoIndex = buscarProducto(nombre);

    if (productoIndex != -1)
    {
        printf("\nIngresa el nuevo nombre: ");
        scanf("%s", productos[productoIndex].nombre);

        printf("\nIngresa el nuevo precio: ");
        scanf("%d", &productos[productoIndex].precio);

        printf("\nProducto modificado correctamente.\n");
    }
}

void imprimirProducto()
{
    char nombre[20];
    printf("Ingresa el nombre del producto que quieres buscar: ");
    scanf("%s", nombre);
    int productoIndex = buscarProducto(nombre);

    if (productoIndex != -1)
    {
        printf("Prducto\n");
        printf("Nombre: %s\n", productos[productoIndex].nombre);
        printf("Precio: %d\n", productos[productoIndex].precio);
    }
}

void mainMenu()
{
    printf("Sistema de gestion de productos\n");
    printf("\n1) Registrar producto");
    printf("\n2) Eliminar producto");
    printf("\n3) Modificar producto");
    printf("\n4) Buscar producto");
    printf("\n5) Salir\n");
}

int main()
{
    int option;

    do
    {
        mainMenu();
        scanf("%d", &option);

        switch (option)
        {
        case 1:
            registrarProducto();
            break;
        case 2:
            eliminarProducto();
            break;
        case 3:
            modificarProducto();
            break;
        case 4:
            imprimirProducto();
            break;
        case 5:
            printf("Saliendo...");
            break;
        default:
            break;
        }
    } while (option != 5);

    return 0;
}