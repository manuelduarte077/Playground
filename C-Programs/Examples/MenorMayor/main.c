#include <stdio.h>

#define SIZE 42 // Tamaño del array

void ordenar(int arr[], int n); // Prototipo de la funcion de ordenamiento

int main()
{
  int arr[SIZE] = {3, 15, 24, 28, 33, 35, 38, 42, 43, 38, 36, 34, 29, 25, 17, 7, 34, 36, 39, 44, 31, 26, 20, 11, 13, 22, 27, 47, 39, 37, 34, 32, 35, 28, 38, 41, 48, 15, 32, 13}; // Array de numeros a ordenar

  ordenar(arr, SIZE); // Llamado a la funcion de ordenamiento

  printf("Numeros ordenados de forma creciente: "); // Impresion de los numeros ordenados
  for (int i = 0; i < SIZE; i++)
  {
    printf("%d ", arr[i]);
  }

  return 0;
}

void ordenar(int arr[], int n) // Implementacion de la funcion de ordenamiento
{
  int temp;
  for (int i = 0; i < n - 1; i++) // Iteracion de la burbuja
  {
    for (int j = 0; j < n - i - 1; j++)
    {
      if (arr[j] > arr[j + 1]) // Comparacion de numeros adyacentes
      {
        temp = arr[j];
        arr[j] = arr[j + 1];
        arr[j + 1] = temp;
      }
    }
  }
}
