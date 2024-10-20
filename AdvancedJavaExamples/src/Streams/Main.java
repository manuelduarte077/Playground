package Streams;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        // Crear una lista de empleados
        List<Empleado> empleados = Arrays.asList(
                new Empleado("Ana", 4000),
                new Empleado("Juan", 3500),
                new Empleado("Pedro", 5000),
                new Empleado("Lucía", 4500),
                new Empleado("Luis", 3000)
        );

        // 1. Filtrar empleados que ganan más de 4000
        List<Empleado> empleadosFiltrados = empleados.stream()
                .filter(e -> e.getSalario() > 4000)
                .toList();

        System.out.println("Empleados con salario mayor a $4000:");
        empleadosFiltrados.forEach(System.out::println);

        // 2. Mapear los nombres de los empleados a una nueva lista
        List<String> nombresEmpleados = empleados.stream()
                .map(Empleado::getNombre)
                .collect(Collectors.toList());

        System.out.println("\nLista de nombres de empleados:");
        nombresEmpleados.forEach(System.out::println);

        // 3. Calcular el salario promedio
        double salarioPromedio = empleados.stream()
                .collect(Collectors.averagingDouble(Empleado::getSalario));

        System.out.println("\nSalario promedio: $" + salarioPromedio);

        // 4. Ordenar la lista de empleados por salario de forma descendente
        List<Empleado> empleadosOrdenados = empleados.stream()
                .sorted(Comparator.comparingDouble(Empleado::getSalario).reversed())
                .collect(Collectors.toList());

        System.out.println("\nEmpleados ordenados por salario (de mayor a menor):");
        empleadosOrdenados.forEach(System.out::println);
    }
}