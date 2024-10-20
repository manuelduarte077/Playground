Los streams en Java son una poderosa API introducida en Java 8 como parte del paquete java.util.stream. Los streams
permiten trabajar con colecciones de datos de manera declarativa, similar a cómo se trabaja con consultas en bases de
datos o con las operaciones funcionales en otros lenguajes de programación. Un stream no es una estructura de datos en
sí misma, sino una secuencia de elementos que se pueden procesar, transformar y filtrar de manera eficiente.

Explicación paso a paso:

1. Crear la lista de empleados:
    - Definimos la clase Empleado con dos atributos: nombre y salario.
    - Creamos una lista de empleados utilizando Arrays.asList(), que incluye cinco empleados con sus respectivos nombres
      y salarios.

```java
List<Empleado> empleados = Arrays.asList(
        new Empleado("Ana", 4000),
        new Empleado("Juan", 3500),
        new Empleado("Pedro", 5000),
        new Empleado("Lucía", 4500),
        new Empleado("Luis", 3000)
);
```

2. Filtrar empleados que ganan más de 4000:
    - Usamos el método stream() para convertir la lista de empleados en un stream.
    - Luego aplicamos el método filter() para obtener solo los empleados cuyo salario es mayor a 4000.
    - Finalmente, usamos collect(Collectors.toList()) para volver a convertir el stream en una lista.

```java
List<Empleado> empleadosFiltrados = empleados.stream()
        .filter(e -> e.getSalario() > 4000)
        .collect(Collectors.toList());
```

- ¿Qué hace esto?: Filtra la lista de empleados para que solo queden los que ganan más de $4000.

3. Mapear los nombres de los empleados a una nueva lista:
    - Usamos el método map() para transformar cada empleado en su nombre.
    - Esto genera un nuevo stream solo con los nombres.
    - Luego, recolectamos estos nombres en una lista usando collect(Collectors.toList()).

```java
List<String> nombresEmpleados = empleados.stream()
        .map(Empleado::getNombre)
        .collect(Collectors.toList());
```

- ¿Qué hace esto?: Extrae los nombres de los empleados y los coloca en una nueva lista.

4. Calcular el salario promedio:
    - Usamos Collectors.averagingDouble() para calcular el salario promedio de los empleados.
    - Esto toma el salario de cada empleado y lo promedia.

```java
double salarioPromedio = empleados.stream()
        .collect(Collectors.averagingDouble(Empleado::getSalario));
```

- ¿Qué hace esto?: Calcula el salario promedio de todos los empleados en la lista.

5. Ordenar la lista por salario de forma descendente:
    - Usamos sorted() con un Comparator que compara los salarios de los empleados.
    - La comparación se hace de forma descendente utilizando reversed().
    - Luego, recolectamos los empleados ordenados en una lista.

```java
List<Empleado> empleadosOrdenados = empleados.stream()
        .sorted(Comparator.comparingDouble(Empleado::getSalario).reversed())
        .collect(Collectors.toList());
```

- ¿Qué hace esto?: Ordena la lista de empleados de mayor a menor salario.

**Caso de uso real**

Este tipo de operaciones es muy útil en sistemas de gestión de recursos humanos o nómina, donde es necesario filtrar,
mapear y analizar datos de empleados. Por ejemplo, una empresa podría:

- Filtrar empleados con salarios por encima de cierto umbral para considerar ajustes salariales o bonos.
- Generar una lista de nombres para un reporte o listado.
- Calcular el salario promedio para establecer presupuestos futuros.
- Ordenar empleados según sus salarios para visualizar qué empleados están en la parte superior de la escala salarial.