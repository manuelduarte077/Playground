#include <iostream>
using namespace std;

int factorial(int n) {
    if (n == 0 || n == 1) return 1; // caso base
    return n * factorial(n - 1);    // llamada recursiva
}

int main() {
    cout << "5! = " << factorial(5) << endl; // 120
    return 0;
}