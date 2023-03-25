/*
    Crear un programa que permita realizar las operaciones básicas de una calculadora
*/

#include <iostream>
using namespace std;

int main()
{

    int num1, num2, resultado;
    char operacion;

    cout << "Ingrese el primer numero: ";
    cin >> num1;

    cout << "Ingrese el segundo numero: ";
    cin >> num2;

    cout << "Ingrese la operacion a realizar: ";
    cin >> operacion;

    switch (operacion)
    {
    case '+':
        resultado = num1 + num2;
        cout << "El resultado es: " << resultado << endl;
        break;
    case '-':
        resultado = num1 - num2;
        cout << "El resultado es: " << resultado << endl;
        break;
    case '*':
        resultado = num1 * num2;
        cout << "El resultado es: " << resultado << endl;
        break;
    case '/':
        resultado = num1 / num2;
        cout << "El resultado es: " << resultado << endl;
        break;
    default:
        cout << "Operacion no valida" << endl;
        break;
    }

    return 0;
}