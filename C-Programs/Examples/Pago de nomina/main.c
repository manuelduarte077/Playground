/*
Un empresario paga la nómina semanalmente y
necesita conocer la cantidad de dinero con la que debe contar en su cuenta y el sueldo
semanal de cada uno de sus empleados. A cada trabajador se le paga por horas trabajadas
de acuerdo a los siguientes criterios:
De 1-40 horas, 2000 bs
De 41-60 horas, 2500 bs
Más de 60 horas 3000 bs.
La empresa tiene 20 empleados. El sistema debe recibir el número de cédula del
empleado, nombre, horas trabajadas
*/

#include <stdio.h>
#define MAXIMO_EMPLEADOS 2

struct Empleado
{
    int cedula;
    char nombre[15];
    int horasTrabajadas;
    int sueldoSemanal;
};

int main()
{
    int dineronNecesitado;
    struct Empleado empleados[MAXIMO_EMPLEADOS];

    for (int i = 0; i < MAXIMO_EMPLEADOS; i++)
    {
        printf("Ingresa la cedula del empleado #%d: ", i + 1);
        scanf("%d", &empleados[i].cedula);

        printf("Ingresa el nombre del empleado #%d: ", i + 1);
        scanf("%s", empleados[i].nombre);

        printf("Las horas trabajadas de la semana del empleado #%d: ", i + 1);
        scanf("%d", &empleados[i].horasTrabajadas);
    }

    for (int i = 0; i < MAXIMO_EMPLEADOS; i++)
    {
        if (empleados[i].horasTrabajadas >= 1 && empleados[i].horasTrabajadas <= 40)
        {
            empleados[i].sueldoSemanal = 2000;
            dineronNecesitado += 2000;
        }
        else if (empleados[i].horasTrabajadas > 41 && empleados[i].horasTrabajadas <= 60)
        {
            empleados[i].sueldoSemanal = 2500;
            dineronNecesitado += 2500;
        }
        else
        {
            empleados[i].sueldoSemanal = 3000;
            dineronNecesitado += 3000;
        }
    }

    for (int i = 0; i < MAXIMO_EMPLEADOS; i++)
    {
        printf("\nSueldo semanal del empleado %s: %dbs\n", empleados[i].nombre, empleados[i].sueldoSemanal);
    }

    printf("Dinero necesitado para pagar a todos los empleados: %dbs", dineronNecesitado);

    return 0;
}