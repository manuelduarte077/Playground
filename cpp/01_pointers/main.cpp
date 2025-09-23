#include <iostream>
using namespace std;

int main()
{
  char character = 'A';       // variable de tipo char
  char *pointer = &character; // puntero a la variable character

  cout << (int *)&character << endl; // dirección del objeto
  cout << (int *)pointer << endl;    // dirección almacenada en pointer
  cout << *pointer << endl;          // valor apuntado ('A')
}