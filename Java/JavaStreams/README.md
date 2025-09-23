## 🚀 Java Streams y Functional Interfaces

## 📚 Descripción del Proyecto

Guía práctica para aprender **Java Streams** y **Functional Interfaces** (también conocidas como callbacks o lambdas).

### ¿Qué son los Streams?

Los **Streams** son una abstracción para procesar secuencias de elementos de manera funcional. Permiten realizar operaciones complejas sobre colecciones de datos de forma declarativa y eficiente.

### 🏗️ Características Principales

- **No modifican la fuente original** - Los streams son inmutables
- **Operaciones lazy** - Solo se ejecutan cuando es necesario
- **Pueden ser procesados una sola vez** - No se pueden reutilizar
- **Soporte para operaciones en paralelo** - Mejora el rendimiento

### 📋 Operaciones de Streams

#### 1. **Operaciones Intermedias** (Lazy)
- `filter()` - Filtra elementos
- `map()` - Transforma elementos
- `sorted()` - Ordena elementos
- `distinct()` - Elimina duplicados
- `limit()` - Limita elementos
- `skip()` - Omite elementos

#### 2. **Operaciones Terminales** (Eager)
- `forEach()` - Procesa cada elemento
- `collect()` - Recolecta en colección
- `reduce()` - Combina elementos
- `anyMatch()` - Verifica condición
- `allMatch()` - Verifica condición
- `noneMatch()` - Verifica condición

### 💻 Ejemplo Práctico: StreamExample.java

```java
List<String> names = Arrays.asList("Ana", "Luis", "Maria", "Pedro", "Juan", "Carla");

// Filtrado y transformación
names.stream()
    .filter(name -> name.length() > 4)        // Solo nombres largos
    .map(String::toUpperCase)                 // Convertir a mayúsculas
    .forEach(System.out::println);            // Imprimir resultado
```

---

## 🎭 Functional Interfaces (Callbacks)

### ¿Qué son las Functional Interfaces?

Las **Functional Interfaces** son interfaces que contienen exactamente **un método abstracto**. Permiten usar expresiones lambda y implementar el patrón de callback de manera elegante.

### 🔧 Tipos de Functional Interfaces

#### 1. **Consumer<T>** - Consumidor
```java
// Recibe un valor y no retorna nada
Consumer<String> printer = System.out::println;
printer.accept("Hola Mundo");
```

#### 2. **Function<T, R>** - Función
```java
// Recibe un valor y retorna un resultado
Function<Integer, String> converter = num -> "Número: " + num;
String result = converter.apply(42);
```

#### 3. **Predicate<T>** - Predicado
```java
// Recibe un valor y retorna un booleano
Predicate<String> validator = str -> str.length() > 5;
boolean isValid = validator.test("Hola Mundo");
```

#### 4. **Supplier<T>** - Proveedor
```java
// No recibe nada y retorna un valor
Supplier<Double> randomGenerator = Math::random;
double random = randomGenerator.get();
```

#### 5. **Runnable** - Ejecutable
```java
// No recibe nada y no retorna nada
Runnable task = () -> System.out.println("Ejecutando tarea");
task.run();
```

#### 6. **Callable<T>** - Llamable
```java
// No recibe nada y retorna un valor (puede lanzar excepción)
Callable<String> message = () -> "Mensaje del futuro";
String result = message.call();
```

### 🔄 Operadores Especializados

#### **UnaryOperator<T>** - Operador Unario
```java
// Recibe y retorna el mismo tipo
UnaryOperator<String> upperCase = String::toUpperCase;
String result = upperCase.apply("hola");
```

#### **BinaryOperator<T>** - Operador Binario
```java
// Recibe dos valores del mismo tipo y retorna uno del mismo tipo
BinaryOperator<Integer> adder = Integer::sum;
int result = adder.apply(5, 3);
```

#### **BiConsumer<T, U>** - Consumidor Binario
```java
// Recibe dos valores y no retorna nada
BiConsumer<String, Integer> printer = (str, num) -> 
    System.out.println(str + ": " + num);
printer.accept("Edad", 25);
```

#### **BiFunction<T, U, R>** - Función Binaria
```java
// Recibe dos valores y retorna un resultado
BiFunction<String, String, String> combiner = String::concat;
String result = combiner.apply("Hola", " Mundo");
```

#### **BiPredicate<T, U>** - Predicado Binario
```java
// Recibe dos valores y retorna un booleano
BiPredicate<String, Integer> validator = (str, len) -> str.length() > len;
boolean isValid = validator.test("Hola", 3);
```

---

## 🚀 Casos de Uso Prácticos

### 1. **Procesamiento de Listas**
```java
List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

// Filtrar pares, multiplicar por 2, y sumar
int sum = numbers.stream()
    .filter(n -> n % 2 == 0)      // Solo pares
    .map(n -> n * 2)              // Multiplicar por 2
    .reduce(0, Integer::sum);     // Sumar todo
```

### 2. **Validación de Datos**
```java
List<String> emails = Arrays.asList("user@email.com", "invalid", "admin@site.org");

// Verificar si todos los emails son válidos
boolean allValid = emails.stream()
    .allMatch(email -> email.contains("@") && email.contains("."));
```

### 3. **Transformación de Datos**
```java
List<Person> people = Arrays.asList(
    new Person("Ana", 25),
    new Person("Luis", 30),
    new Person("Maria", 28)
);

// Extraer solo los nombres
List<String> names = people.stream()
    .map(Person::getName)
    .collect(Collectors.toList());
```

---

## 📖 Estructura del Proyecto

```
src/main/java/dev/donmanuel/app/
├── streams/
│   └── StreamExample.java          # Ejemplos de operaciones de Streams
└── lambdas/
    ├── consumer/                   # Consumer<T>
    ├── function/                   # Function<T, R>
    ├── predicate/                  # Predicate<T>
    ├── supplier/                   # Supplier<T>
    ├── runnable/                   # Runnable
    ├── callable/                   # Callable<T>
    ├── unary/                      # UnaryOperator<T>
    ├── binary/                     # BinaryOperator<T>
    ├── biconsumer/                 # BiConsumer<T, U>
    ├── bifunction/                 # BiFunction<T, U, R>
    └── bipredicate/                # BiPredicate<T, U>
```

---

## 🎯 Ejercicios Prácticos

### Ejercicio 1: Filtrado y Transformación
```java
// Dada una lista de números, filtrar los mayores a 10,
// multiplicarlos por 2, y encontrar el máximo
List<Integer> numbers = Arrays.asList(5, 15, 8, 20, 12, 3, 25);
```

### Ejercicio 2: Validación Compleja
```java
// Crear un Predicate que valide si una cadena:
// - Tiene al menos 8 caracteres
// - Contiene al menos una mayúscula
// - Contiene al menos un número
```

### Ejercicio 3: Procesamiento de Objetos
```java
// Dada una lista de productos, filtrar los que están en stock,
// ordenarlos por precio, y extraer solo los nombres
```

---

## 🔍 Consejos de Aprendizaje

1. **Empieza Simple**: Comienza con operaciones básicas como `filter` y `map`
2. **Practica la Cadena**: Combina múltiples operaciones en un solo stream
3. **Usa Method References**: Aprovecha `String::toUpperCase` en lugar de `s -> s.toUpperCase()`
4. **Entiende la Lazy Evaluation**: Las operaciones intermedias no se ejecutan hasta que se llama a una terminal
5. **Experimenta con Paralelización**: Usa `parallelStream()` para operaciones costosas

---

## 📚 Recursos Adicionales

- [Java 8 Streams Tutorial](https://docs.oracle.com/javase/8/docs/api/java/util/stream/package-summary.html)
- [Functional Interfaces in Java](https://docs.oracle.com/javase/8/docs/api/java/util/function/package-summary.html)
- [Lambda Expressions](https://docs.oracle.com/javase/tutorial/java/javaOO/lambdaexpressions.html)



