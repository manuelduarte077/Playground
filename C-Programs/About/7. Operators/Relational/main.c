#include <stdio.h>

int main()
{
    int num1, num2;

    printf("Ingresa un numero: ");
    scanf("%i", &num1);

    printf("Ingresa otro numero: ");
    scanf("%i", &num2);

    /* Podemos saber cual numero es mayor y cual es menor */
    if (num1 > num2)
    {
        printf("%i es mayor que %i\n\n", num1, num2);
    }
    else if (num1 < num2)
    {
        printf("%i es menor que %i\n\n", num1, num2);
    }
    else if (num1 == num2)
    {
        printf("Los numeros ingresados son los mismos\n\n");
    }

    /* Podemos saber si el numero es mayor o igual o menor e igual */
    if (num1 >= num2)
    {
        printf("%i es mayor o igual que %i\n\n", num1, num2);
    }
    else if (num1 <= num2)
    {
        printf("%i es menor o igual que %i\n\n", num1, num2);
    }

    /* Tambien si el numero ingresado es par o impar */
    if (num1 % 2 != 0)
    {
        printf("%i Es un numero impar\n\n", num1);
    }
    else
    {
        printf("%i Es un numero par\n\n", num1);
    }

    if (num2 % 2 != 0)
    {
        printf("%i Es un numero impar\n\n", num2);
    }
    else
    {
        printf("%i Es un numero par\n\n", num2);
    }
}