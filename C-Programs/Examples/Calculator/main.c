#include <stdio.h>
#include <math.h>

int main(int argc, char const *argv[])
{
    char operador;
    int a, b;

    printf("Ingrese un operador (+, -, *, /)\n");
    scanf("%c", &operador);

    printf("Ingrese un numero\n");
    scanf("%i", &a);

    printf("Ingrese otro numero\n");
    scanf("%i", &b);
    system("cls");

    switch (operador)
    {
    case '+':
        printf("Resultado: %d\n", a + b);
        break;

    case '-':
        printf("Resultado: %d\n", a - b);
        break;

    case '*':
        printf("Resultado: %d\n", a * b);
        break;

    case '/':
        printf("Resultado: %d\n", a / b);
        break;

    default:
        printf("El operador no es valido.");
        break;
    }

    system("pause");
    return 0;
}
