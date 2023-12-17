#include <iostream>

void fibonacci(int n)
{
  unsigned long long fib_sequence[n];
  fib_sequence[0] = 0;
  fib_sequence[1] = 1;

  for (int i = 2; i < n; i++)
  {
    fib_sequence[i] = fib_sequence[i - 1] + fib_sequence[i - 2];
  }

  // Imprimir los primeros 50 números de Fibonacci
  for (int i = 0; i < n; i++)
  {
    std::cout << fib_sequence[i] << " ";
  }
}

int main()
{
  fibonacci(50);
  return 0;
}
