#include <iostream>
#include <string>

using namespace std;

class Person
{

  // Atributos privados
private:
  string *name; // Puntero a string
  int *age;     // Puntero a int

  // Métodos públicos
public:
  static int number_of_persons; // Variable de clase

  Person(string name, int age)
  {
    this->name = new string(name); // Asignación dinámica de memoria
    this->age = new int(age);      // Asignación dinámica de memoria
    number_of_persons += 1;
  }

  ~Person()
  {
    delete name; // Liberar memoria asignada dinámicamente
    delete age;  // Liberar memoria asignada dinámicamente
    cout << "Destruction" << endl;
  }

  void change_name(string name) { *(this->name) = name; } // Método para cambiar el nombre

  void change_age(int age) { *(this->age) = age; } // Método para cambiar la edad

  void say_hi() { cout << *name << endl; } // Método para saludar
};

int Person::number_of_persons = 0; // Inicialización de la variable de clase

int main()
{
  Person p = Person("Zero", 14);
  Person p2 = Person("Zero", 14);
  Person p3 = Person("Zero", 14);

  cout << Person::number_of_persons << endl; // Output: 3
  p.say_hi();
}