#include <stdio.h>

float obtenerEstrellas(float puntuacion)
{
    /* Definir puntuacion maxima */
    float puntuacionMaxima = 100.0;

    /* Dividir puntuacion entre puntuacion maxima y multiplicar por el numero de estrellas */
    float numEstrellas = puntuacion / puntuacionMaxima * 5.0;
    return numEstrellas;
}

int main()
{
    /* Sumatoria de todas las puntuaciones segun las caracteristicas del apartamento */
    float puntuacion = 100.0;

    /* Obtener numero de estrellas del apartamento */
    float numEstrellas = obtenerEstrellas(puntuacion);
    printf("La puntuacion de %.1f corresponde a %.2f estrellas\n", puntuacion, numEstrellas);
    return 0;
}