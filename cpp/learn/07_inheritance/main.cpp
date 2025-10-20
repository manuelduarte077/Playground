#include <iostream>
#include <string>

using namespace std;

class Animal {
public:
    string name;
    int age;

    Animal(string n, int a) {
        name = n;
        age = a;
    }

    void displayInfo() {
        cout << "Name: " << name << ", Age: " << age << endl;
    }
};

class Dog : public Animal {
public:
    string breed;

    Dog(string n, int a, string b) : Animal(n, a) {
        breed = b;
    }

    void displayInfo() {
        Animal::displayInfo();
        cout << "Breed: " << breed << endl;
    }
};

int main() {
    Dog *d = new Dog("Buddy", 3, "Golden Retriever");
    d->displayInfo(); // Output: Name: Buddy, Age: 3, Breed: Golden Retriever
    delete d; // Free allocated memory
    return 0;
}
