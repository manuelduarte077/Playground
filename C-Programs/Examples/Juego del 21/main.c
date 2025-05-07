#include <time.h>
#include <stdio.h>
#include <stdlib.h>
#include <unistd.h>
#include <string.h>
#include <stdbool.h>

/* Estructura de las cartas */
typedef struct Baraja
{
    int numero;
    char tipo[10];
    struct Baraja *sig;
} baraja;

/* Estructura de los jugadores */
typedef struct Player
{
    char nickName[15];
    int numeroDado;
    baraja mazo[3];
} player;

/* Variable con la cantidad de jugadores */
int playerLength = 0;

baraja *barajaOriginal = NULL;
baraja *barajaBarajada = NULL;
player players[100];

/* Declaración de funciones utilizadas */
void play21();
void dealCards();
void pushPlayer();
baraja *nodoCreate();
void generateCards();
void printAllCards();
void seePlayerCards();
void shufflingCards();
void printAllPlayers();
void determineWinner();
void determineTurnWithDice();

void testMode()
{
    int option;
    do
    {
        printf("\n\nMENU\n\n1) Generar cartas\n2) Imprimir cartas\n3) Agregar jugador\n4) Imprimir jugadores\n5) Determinar turno\n6) Barajar cartas \n7) Repartir cartas\n8) Ver cartas repartidas\n9) Determinar ganador\n10) Salir\n\nIngresa la opcion: ");
        scanf("%d", &option);

        switch (option)
        {
        case 1:
            generateCards();
            break;
        case 2:
            printAllCards();
            break;
        case 3:
            pushPlayer();
            break;
        case 4:
            printAllPlayers();
            break;
        case 5:
            determineTurnWithDice();
            break;
        case 6:
            shufflingCards();
            break;
        case 7:
            dealCards();
            break;
        case 8:
            seePlayerCards();
            break;
        case 9:
            determineWinner();
            break;
        case 10:
            printf("\nSaliendo del programa...");
            exit(0);
            break;
        default:
            printf("\nOpcion no valida.");
            break;
        }
    } while (option != 10);
}

int main()
{
    int option;
    srand(time(NULL));
    printf("[]======> Black Jack <======[]\n\n1) Jugar\n2) Pruebas\n3) Salir\n\n[]======> Black Jack <======[]\n\nIngresa una opcion: ");
    scanf("%d", &option);

    do
    {
        switch (option)
        {
        case 1:
            play21();
            break;

        case 2:
            testMode();
            break;

        default:
            break;
        }
    } while (option != 3);

    return 0;
}

void play21()
{
    pushPlayer();
    generateCards();
    shufflingCards();
    determineTurnWithDice();
    dealCards();
    seePlayerCards();
    determineWinner();
    exit(0);
}

/* Funcion para crear los nodos */
baraja *nodoCreate()
{
    baraja *nuevaCarta = (baraja *)malloc(sizeof(baraja));
    if (nuevaCarta == NULL)
    {
        printf("\nNo se pudo crear la carta");
        return NULL;
    }
    else
    {
        nuevaCarta->sig = NULL;
        return nuevaCarta;
    }
}

/* Función para agregar jugadores al juego */
void pushPlayer()
{
    player nuevo;
    int numeroJugadores;
    printf("\nIngresa el numero de jugadores: ");
    scanf("%d", &numeroJugadores);

    for (int i = 0; i < numeroJugadores; i++)
    {
        printf("\nIngrsa el nombre del jugador: ");
        scanf("%s", nuevo.nickName);
        players[playerLength] = nuevo;
        playerLength++;
    }
}

/* Funcion para imprimir a todos los jugadores registrados */
void printAllPlayers()
{
    if (playerLength == 0)
    {
        printf("No hay jugadores registrados.");
    }
    else
    {
        for (int i = 0; i < playerLength; i++)
        {
            printf("\nNombre: %s\nDado: %d", players[i].nickName, players[i].numeroDado);
        }
    }
}

/* Función para generar la baraja de cartas */
void generateCards()
{
    /* Establecemos los tipos de cartas en un arreglo */
    char tipos[4][10] = {"Oro", "Basto", "Espada", "Copa"};
    printf("\nGenerando las cartas...");

    /* Recorremos los tipos */
    for (int i = 0; i < 4; i++)
    {
        /* Recorremos el numero de cartas por tipo */
        for (int j = 0; j < 12; j++)
        {
            /* Creamos una validacion para las cartas españolas */
            if (j != 8 && j != 9)
            {
                /* Creamos el nuevo nodo, establecemos valores y apilamos */
                baraja *nuevaCarta = nodoCreate();
                if (nuevaCarta != NULL)
                {
                    nuevaCarta->numero = j;
                    strcpy(nuevaCarta->tipo, tipos[i]);
                    nuevaCarta->sig = barajaOriginal;
                    barajaOriginal = nuevaCarta;
                }
            }
        }
    }

    printf("\nCartas generadas correctamente.");
}

void shufflingCards()
{
    printf("\nBarajando las cartas...");

    /* Establecemos la baraja barajeada en NULL para evitar la duplicacion de cartas */
    barajaBarajada = NULL;

    /* Creamos una variable para almacenar la longitud de las cartas barajeadas */
    int barajaBarajeadaLength = 0;

    /* Creamos un arreglo para almacenar los numeros aleatorios */
    int numerosUsados[40];
    int numerosUsadosLength = 0;

    int numeroAleatorio;
    do
    {
        /* Establecemos un valor a la variable con un numero aleatorio */
        numeroAleatorio = rand() % 40;

        bool numeroRepetido = false;

        /* Recorremos el arreglo de numeros usados */
        for (int i = 0; i < numerosUsadosLength; i++)
        {
            if (numerosUsados[i] == numeroAleatorio)
            {
                numeroRepetido = true;
                break;
            }
        }

        /* Si el numero no se repite continuamos */
        if (!numeroRepetido)
        {
            /* Agregamos al arreglo el numero aleatorio e incrementamos su variable longitud */
            numerosUsados[numerosUsadosLength] = numeroAleatorio;
            numerosUsadosLength++;

            /* Creamos un auxiliar para recorrer los nodos */
            baraja *aux = barajaOriginal;

            /* Accedemos a la carta mediante el numero aleatorio que actuaria como indice */
            for (int i = 0; i < numeroAleatorio; i++)
            {
                aux = aux->sig;
            }

            /* Creamos el nuevo nodo, establecemos valores y apilamos */
            baraja *nuevo = nodoCreate();
            if (nuevo != NULL)
            {
                nuevo->numero = aux->numero;
                strcpy(nuevo->tipo, aux->tipo);
                nuevo->sig = barajaBarajada;
                barajaBarajada = nuevo;
                barajaBarajeadaLength++;
            }
        }
    } while (barajaBarajeadaLength < 40);

    printf("\n¡Cartas barajadas correctamente!");
}

/* Funcion para determinar el ganador del juego */
void determineWinner()
{
    printf("\nDeterminando ganador...");
    if (playerLength == 0)
    {
        printf("No hay jugadores registrados.");
    }
    else
    {
        int cantidadGanadores = 0;
        char ganador[playerLength][15];
        for (int i = 0; i < playerLength; i++)
        {
            int sumatoria;
            for (int j = 0; j < 3; j++)
            {
                sumatoria += players[i].mazo[j].numero;
            }
            if (sumatoria == 21)
            {
                strcpy(ganador[cantidadGanadores], players[i].nickName);
                cantidadGanadores++;
            }
        }

        if (cantidadGanadores == 0)
        {
            printf("\nNadie gano el juego.");
        }
        else if (cantidadGanadores > 1)
        {
            printf("\nHubo un empate en el juego");
        }
        else
        {
            printf("\nEl ganador es: %s", ganador[0]);
        }
    }
}

/* Funcion para repartir las cartas a los jugadores */
void dealCards()
{
    printf("\nRepartiendo las cartas...");
    baraja *aux = barajaBarajada;
    if (playerLength == 0)
    {
        printf("\nNo hay jugadores registrados.");
    }
    else
    {
        for (int i = 0; i < playerLength; i++)
        {
            for (int j = 0; j < 3; j++)
            {
                aux = aux->sig;
                players[i].mazo[j] = *aux;
            }
        }
    }
    printf("\n¡Cartas repartidas correctamente!");
}

void seePlayerCards()
{
    if (playerLength == 0)
    {
        printf("\nNo hay jugadores registrados.");
    }
    else
    {
        for (int i = 0; i < playerLength; i++)
        {
            printf("\n\nCartas de %s:", players[i].nickName);
            for (int j = 0; j < 3; j++)
            {
                printf("\nTipo: %s\nNumero: %d", players[i].mazo[j].tipo, players[i].mazo[j].numero + 1);
            }
        }
    }
}

/* Función para mostrar todas las cartas generadas */
void printAllCards()
{
    if (barajaOriginal == NULL)
    {
        printf("\nNo hay registro de datos.");
    }
    else
    {
        int totalDeCartas = 0;
        baraja *i = barajaBarajada;
        while (i != NULL)
        {
            printf("\n\nTipo: %s\nNumero: %d", i->tipo, i->numero + 1);
            i = i->sig;
            totalDeCartas++;
        }
        printf("\n\nNumero de cartas: %d", totalDeCartas);
    }
}

/* Funcion para sacar el numero aleatorio del dado */
int lanzarDado()
{
    int i;
    i = rand() % 5;
    return i;
}

/* Funcion para determinar el turno del juegador con el numero de dado mas alto */
void determineTurnWithDice()
{
    if (playerLength == 0)
    {
        printf("\nNo hay jugadores registrados.");
    }
    else
    {
        char ganador[playerLength][15];
        char userWithMostDadoNum[15];
        int maxDado = 0;
        bool empate;

        for (int i = 0; i < playerLength; i++)
        {
            int dadoNumero = lanzarDado();
            printf("\nEl dado de %s cayo en %d", players[i].nickName, dadoNumero);
            players[i].numeroDado = dadoNumero;
        }

        for (int i = 0; i < playerLength; i++)
        {
            if (players[i].numeroDado > maxDado)
            {
                strcpy(userWithMostDadoNum, players[i].nickName);
                maxDado = players[i].numeroDado;
            }
        }

        printf("\nEl jugador que gano los dados es: %s", userWithMostDadoNum);
    }
}
