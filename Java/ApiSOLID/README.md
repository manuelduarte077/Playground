🧠 Principios SOLID aplicados

- Single Responsibility
Cada clase tiene una sola responsabilidad (modelo, cliente HTTP, servicio, etc.)

- Open/Closed
Puedes extender con otras APIs sin modificar las existentes.

- Liskov Substitution
Puedes sustituir implementaciones del servicio (ej. MockService) sin romper el código.

- Interface Segregation
Definimos una interfaz pequeña y específica (ApiService).

- Dependency Inversion
Main depende de la interfaz, no de la implementación concreta.
