from dataclasses import dataclass, field


@dataclass
class Person:
    name: str
    age: int = field(default=0)

    def __post_init__(self):
        if self.age < 0:
            raise ValueError("Age cannot be negative")


# Ejemplo 1: Creación válida
try:
    person1 = Person(name="John Doe", age=25)
    print(person1)  # Output esperado: Person(name='John Doe', age=25)
except ValueError as e:
    print(f"Error: {e}")

# Ejemplo 2: Usando el valor por defecto de 'age'
try:
    person2 = Person(name="Alice")
    print(person2)  # Output esperado: Person(name='Alice', age=0)
except ValueError as e:
    print(f"Error: {e}")

# Ejemplo 3: Edad negativa (lanza error)
try:
    person3 = Person(name="Bob", age=-10)
    print(person3)  # Esto no se ejecutará debido al error
except ValueError as e:
    print(f"Error: {e}")  # Output esperado: Error: Age cannot be negative

# Ejemplo 4: Creación válida con otra persona
try:
    person4 = Person(name="Charlie", age=40)
    print(person4)  # Output esperado: Person(name='Charlie', age=40)
except ValueError as e:
    print(f"Error: {e}")
