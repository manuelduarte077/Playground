/* ¿Puedes resolver el clásico problema de FizzBuzz?
Escribe un programa que imprima los números del 1 al 100,
pero para múltiplos de 3, imprime "Fizz" en lugar del número,
y para múltiplos de 5, imprime "Buzz".
Para números que son múltiplos de 3 y 5, imprima "FizzBuzz".

 ¡Que te diviertas! */
#include <stdio.h>

int main()
{
    for (int i = 0; i < 100; i++)
    {
        if (i % 3 == 0)
        {
            printf("\nFizz");
        }
        else if (i % 5 == 0)
        {
            printf("\nBuzz");
        }
        else if (i % 3 == 0 && i % 5 == 0)
        {
            printf("\nFizzBuzz");
        }
        else
        {
            printf("\n%d", i);
        }
    }

    return 0;
}