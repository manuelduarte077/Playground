#include <iostream>
using namespace std;

int factorial(int n)
{
  int resultado = 1;

  for (int i = 1; i <= n; i++) // O(n)
  {
    resultado *= i; // resultado = resultado * i
  }

  return resultado;
}

int main() 
{
  cout << "Factorial de 5: " << factorial(5) << endl; // 120
  return 0;
}