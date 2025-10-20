#include <iostream>
using namespace std;

int sumaArreglo(int arr[], int size) {
    int suma = 0;
    for (int i = 0; i < size; i++) { // O(n)
        suma += arr[i]; // Sumar cada elemento del arreglo
    }
    
    return suma;
}

int main() {
    int numeros[] = {1, 2, 3, 4, 5}; // Arreglo de ejemplo
    int size = sizeof(numeros) / sizeof(numeros[0]); // Calcular el tamaño del arreglo

    cout << "La suma del arreglo es: " << sumaArreglo(numeros, size) << endl; // 15
    return 0;
}