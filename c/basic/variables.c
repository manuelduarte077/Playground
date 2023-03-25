#include <stdio.h>

// Variables
int a, b, c; // Variables enteras

float f, g, h;

// constantes
const int pizza = 100u;       // ese u despues del 100 es un sufijo para decirle que va ser usigned
const int priceIphone = 999l; // que va ser long, le decimos eso con el sufijo l

// Usando define
#define PIZZACOST 560;
const char NEWLINE = '\n';

// Declaracion de variables externas
extern int x, w, y;

int main()

{

    printf("Variables");
    // inicializamos de las variables
    a = 1;
    b = 24;

    c = a + b;

    printf("Value of sum is: %d ", c);
    printf("%c", NEWLINE);

    // PIZZA
    printf("PIZZA %c", NEWLINE);

    float pizzaCost;
    int cantidad = 5;

    pizzaCost = cantidad * PIZZACOST;
    printf("Value of pizza is %f", pizzaCost);

    return 0;
}
