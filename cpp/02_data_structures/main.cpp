#include <iostream>
#include <string>
using namespace std;

struct Person
{
  string name;
  int age;

  // Constructor
  Person(string n, int a)
  {
    name = n;
    age = a;
  }
};
int main()
{
  Person person("Manuel", 30); // variable de tipo Person
  Person *pointer = &person;   // puntero a la variable person

  pointer->name = "Manuel"; // asignar valor al campo name usando el puntero
  pointer->age = 30;        // asignar valor al campo age usando el puntero

  cout << "Nombre: " << person.name << endl; // acceder al campo name
  cout << "Edad: " << person.age << endl;    // acceder al campo age
}