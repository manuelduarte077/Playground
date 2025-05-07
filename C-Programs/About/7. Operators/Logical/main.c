#include <stdio.h>

int main()
{
    int num1, num2;

    printf("Ingresa un numero: ");
    scanf("%i", &num1);

    printf("Ingresa otro numero: ");
    scanf("%i", &num2);

    /* && es el operador Y - AND */
    if (num2 > 10 && num1 > 10)
    {
        printf("Los numeros ingresados son mayores que 10.\n\n");
    }

    /* || es el operador O - Or */
    if (num2 > 10 || num1 > 10)
    {
        printf("Uno de los numeros ingresados es mayor a 10\n\n");
    }

    /* ! es el operador NO - NOT */
    if (!(num1 && num2))
    {
        printf("Condition is true, because NOT reversed the logical condition\n");
    }

    system("pause");
    return 0;
}