#include <iostream>
using namespace std;

int multiplicar(int a, int b)
{
  return a * b; // Return the product of a and b
}

int main()
{
  int resultado = multiplicar(5, 3); // Call the function with 5 and 3
  cout << "La multiplicacion es: " <<  resultado << endl; // Print the result

  return 0;
}