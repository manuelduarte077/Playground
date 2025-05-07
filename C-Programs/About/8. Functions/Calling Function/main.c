#include <stdio.h>
#include <stdbool.h>

int IsOddOrEven(int num1, int num2);

int main()
{
    int num1, num2;
    printf("Ingresa un numero: ");
    scanf("%i", &num1);

    printf("Ingresa otro numero: ");
    scanf("%i", &num2);

    bool isOdd = IsOddOrEven(num1, num2);

    if (isOdd)
    {
        printf("La suma de los numeros es un numero impar\n\n");
    }
    else
    {
        printf("La suma de los numeros es un numero par\n\n");
    }

    system("pause");
    return 0;
}

int IsOddOrEven(int num1, int num2)
{
    if ((num1 + num2) % 2 != 0)
    {
        return true; /* Es impar */
    }
    else
    {
        return false; /* Es par */
    }
}