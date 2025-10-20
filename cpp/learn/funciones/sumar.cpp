#include <iostream>
using namespace std;

int sumar(int a, int b) {
    return a + b; // Return the sum of a and b
}

int main() {
    int resultado = sumar(5, 3); // Call the function with 5 and 3
    cout << "La suma es: " << resultado << endl; // Print the result

    return 0;
}
