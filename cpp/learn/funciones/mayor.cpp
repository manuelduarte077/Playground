#include <iostream>
using namespace std;

int mayor(int a, int b) {
    return (a > b) ? a : b;
}

int main() {
    cout << "El mayor de 5 y 10 es: " << mayor(5, 10) << endl;
    return 0;
}
