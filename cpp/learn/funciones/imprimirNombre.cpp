#include <iostream>
using namespace std;

void imprimirNombre(string nombre)
{
  cout << "¡Hola, " << nombre << "!" << endl;
}

int main()
{
  imprimirNombre("Manuel"); // Call the function with a name
  imprimirNombre("Carlos");

  return 0;
}