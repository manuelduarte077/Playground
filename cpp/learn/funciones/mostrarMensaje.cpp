#include <iostream>
using namespace std;

void mostrarMensaje(string mensaje = "Defecto") {
    cout << mensaje << endl;
}

int main() {
    mostrarMensaje("Hola Manuel");
    mostrarMensaje(); // usa el valor por defecto
    return 0;
}
