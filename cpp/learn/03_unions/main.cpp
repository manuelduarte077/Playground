#include <iostream>

using namespace std;

int main() {
    /*
      * Una unión permite almacenar diferentes tipos de datos en la misma ubicación de memoria.
      * Solo uno de los miembros puede contener un valor en un momento dado.
      * El tamaño de la unión es igual al tamaño del miembro más grande.
    */
    union number_letter {
        int number;
        char letter;
    };

    number_letter x = {'A'}; // inicializar el campo letter
    cout << x.letter << endl; // acceder al campo letter

    number_letter y = {65}; // inicializar el campo number
    cout << y.number << endl; // acceder al campo number
}
