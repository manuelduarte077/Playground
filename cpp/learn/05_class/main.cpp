#include <iostream>
#include <string>

using namespace std;

/*
 * Classes
 * - Blueprint for creating objects
 * - Encapsulates data for the object
 * - Can contain methods to manipulate that data
 * - Supports inheritance and polymorphism
 */
class Car {
public:
    string brand;
    string model;
    int year;

    Car(string b, string m, int y) {
        brand = b;
        model = m;
        year = y;
    }

    // Metodo para mostrar la información del coche
    void displayInfo() {
        cout << "Brand: " << brand << ", Model: " << model << ", Year: " << year << endl;
    }
};

int main() {
    Car *c = new Car("Toyota", "Corolla", 2020); // Crear un objeto de la clase Car
    c->displayInfo(); // Salida: Brand: Toyota, Model: Corolla, Year: 2020
    delete c; // Liberar memoria asignada

    return 0;
}
