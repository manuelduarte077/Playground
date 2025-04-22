package Fase1;

import java.util.ArrayList;

public class MiniBoss {
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<>();
        ArrayList<Integer> notes = new ArrayList<>();

        names.add("Ana");
        names.add("Luis");
        names.add("Carla");
        names.add("Pedro");
        names.add("Lucia");

        notes.add(85);
        notes.add(40);
        notes.add(95);
        notes.add(70);
        notes.add(60);

        for (int i = 0; i < names.size(); i++) {
            System.out.println(names.get(i) + ": " + notes.get(i));
        }

        // Cantidad de alumnos aprobados
        int count = 0;
        for (int i = 0; i < notes.size(); i++) {
            if (notes.get(i) >= 60) { // Si la nota es mayor o igual a 60
                count++;
            }
        }
        System.out.println("Cantidad de aprobados: " + count);

        // Promedio general
        double average = 0;
        for (int i = 0; i < notes.size(); i++) { // Sumar todas las notas
            average += notes.get(i); // Sumar cada nota al promedio
        }

        average /= notes.size();
        System.out.printf("Promedio General: %.2f\n", average);


        // Mejor estudiante
        int bestStudent = 0;
        for (int i = 1; i < notes.size(); i++) { // Comenzar desde el segundo estudiante
            if (notes.get(i) > notes.get(bestStudent)) { // Comparar con el mejor estudiante actual
                bestStudent = i;
            }
        }

        System.out.println("Mejor estudiante: " + names.get(bestStudent) + " " + notes.get(bestStudent));
    }
}
