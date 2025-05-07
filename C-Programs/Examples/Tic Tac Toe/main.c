#include <stdio.h>
#include <string.h>
#include <stdlib.h>
#include <time.h>

void Loop(char c[3][3]);
void Intro(char c[3][3]);
int Ganador(char c[3][3]);
void Tablero(char c[3][3]);
void EnterNumber(char c[3][3]);
void CPUEnterNumber(char c[3][3]);

int main(int argc, char const *argv[])
{
    char c[3][3];

    Loop(c);

    system("pause");
    return 0;
}

void Loop(char c[3][3])
{
    int i, j;

    i = 0;

    Intro(c);

    do
    {
        system("cls");
        Tablero(c);
        if (i % 2 == 0)
        {
            EnterNumber(c);
        }
        else
        {
            CPUEnterNumber(c);
        }
        i++;
        j = Ganador(c);
    } while (i <= 9 && j == 2);

    system("cls");
    Tablero(c);

    if (j == 0)
    {
        printf("Felicidades, ganaste.\n\n");
    }
    else if (j == 1)
    {
        printf("Lo siento, perdiste.\n\n");
    }
    else
    {
        printf("Es un empate.\n\n");
    }
}

void Intro(char c[3][3])
{
    int i, j;

    char aux;
    aux = '1';

    for (i = 0; i < 3; i++)
    {
        for (j = 0; j < 3; j++)
        {
            c[i][j] = aux++;
        }
    }
}

void EnterNumber(char c[3][3])
{
    char aux;
    int i, j, k;

    do
    {
        do
        {
            printf("Coloca una ficha: ");
            fflush(stdin);
            scanf("%c", &aux);
        } while (aux < '1' || aux > '9');

        switch (aux)
        {
        case '1':
            i = 0;
            j = 0;

            if (c[i][j] == 'X' || c[i][j] == 'O')
            {
                k = 1;
                printf("La casilla esta ocupada, intentalo con otro nuemro\n\n");
            }
            break;

        case '2':
            i = 0;
            j = 1;

            if (c[i][j] == 'X' || c[i][j] == 'O')
            {
                k = 1;
                printf("La casilla esta ocupada, intentalo con otro nuemro\n\n");
            }
            break;

        case '3':
            i = 0;
            j = 2;

            if (c[i][j] == 'X' || c[i][j] == 'O')
            {
                k = 1;
                printf("La casilla esta ocupada, intentalo con otro nuemro\n\n");
            }
            break;

        case '4':
            i = 1;
            j = 0;

            if (c[i][j] == 'X' || c[i][j] == 'O')
            {
                k = 1;
                printf("La casilla esta ocupada, intentalo con otro nuemro\n\n");
            }
            break;

        case '5':
            i = 1;
            j = 1;

            if (c[i][j] == 'X' || c[i][j] == 'O')
            {
                k = 1;
                printf("La casilla esta ocupada, intentalo con otro nuemro\n\n");
            }
            break;

        case '6':
            i = 1;
            j = 2;

            if (c[i][j] == 'X' || c[i][j] == 'O')
            {
                k = 1;
                printf("La casilla esta ocupada, intentalo con otro nuemro\n\n");
            }
            break;

        case '7':
            i = 2;
            j = 0;

            if (c[i][j] == 'X' || c[i][j] == 'O')
            {
                k = 1;
                printf("La casilla esta ocupada, intentalo con otro nuemro\n\n");
            }
            break;

        case '8':
            i = 2;
            j = 1;

            if (c[i][j] == 'X' || c[i][j] == 'O')
            {
                k = 1;
                printf("La casilla esta ocupada, intentalo con otro nuemro\n\n");
            }
            break;

        case '9':
            i = 2;
            j = 2;

            if (c[i][j] == 'X' || c[i][j] == 'O')
            {
                k = 1;
                printf("La casilla esta ocupada, intentalo con otro nuemro\n\n");
            }
            break;

        default:
            break;
        }
    } while (k == 1);

    c[i][j] = 'X';
}

void CPUEnterNumber(char c[3][3])
{
    int i, j, k;
    char aux;
    srand(time(NULL));

    do
    {
        i = rand() % 3;
        j = rand() % 3;
        k = 0;

        if (c[i][j] == 'X' || c[i][j] == 'O')
        {
            k = 1;
            printf("La casilla esta ocupada, intentalo con otro nuemro\n\n");
        }
    } while (k == 1);

    c[i][j] = 'O';
}

void Tablero(char c[3][3])
{
    int i, j;
    for (i = 0; i < 3; i++)
    {
        for (j = 0; j < 3; j++)
        {
            if (j < 2)
            {
                printf(" %c |", c[i][j]);
            }
            else
            {
                printf(" %c", c[i][j]);
            }
        }
        if (i < 2)
        {
            printf("\n-----------\n");
        }
    }
    printf("\n\n");
}

int Ganador(char c[3][3])
{
    if (c[0][0] == 'X' || c[0][0] == 'O')
    {
        if (c[0][0] == c[0][1] && c[0][0] == c[0][2])
        {
            if (c[0][0] == 'X')
            {
                return 0; /* He ganado */
            }
            else
            {
                return 1; /* He perdido */
            }
        }

        if (c[0][0] == c[1][0] && c[0][0] == c[2][1])
        {
            if (c[0][0] == 'X')
            {
                return 0; /* He ganado */
            }
            else
            {
                return 1; /* He perdido */
            }
        }

        if (c[1][1] == 'X' || c[1][1] == 'O')
        {
            if (c[1][1] == c[0][0] && c[1][1] == c[2][2])
            {
                if (c[1][1] == 'X')
                {
                    return 0; /* He ganado */
                }
                else
                {
                    return 1; /* He perdido */
                }
            }

            if (c[1][1] == c[1][0] && c[1][1] == c[1][2])
            {
                if (c[1][1] == 'X')
                {
                    return 0; /* He ganado */
                }
                else
                {
                    return 1; /* He perdido */
                }
            }

            if (c[1][1] == c[2][0] && c[1][1] == c[0][2])
            {
                if (c[1][1] == 'X')
                {
                    return 0; /* He ganado */
                }
                else
                {
                    return 1; /* He perdido */
                }
            }

            if (c[1][1] == c[0][1] && c[1][1] == c[2][1])
            {
                if (c[1][1] == 'X')
                {
                    return 0; /* He ganado */
                }
                else
                {
                    return 1; /* He perdido */
                }
            }
        }

        if (c[2][2] == 'X' || c[2][2] == 'O')
        {
            if (c[2][2] == c[2][0] && c[2][2] == c[2][1])
            {
                if (c[2][2] == 'X')
                {
                    return 0; /* He ganado */
                }
                else
                {
                    return 1; /* He perdido */
                }
            }
            if (c[2][2] == c[0][2] && c[2][2] == c[1][2])
            {
                if (c[2][2] == 'X')
                {
                    return 0; /* He ganado */
                }
                else
                {
                    return 1; /* He perdido */
                }
            }
        }
    }
    return 2;
}