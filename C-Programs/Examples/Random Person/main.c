#include <stdio.h>
#include <time.h>
#include <unistd.h>

char *HairColor();
char *Intelligency();
char *Apariency();

int main()
{
    char *hairColor = HairColor();
    char *intelligency = Intelligency();
    char *apariency = Apariency();
    printf("Generando personaje...\n");
    sleep(1);
    system("cls");
    printf("Tu personaje:\n\n");
    printf("Color de cabello: %s\n", hairColor);
    printf("Apariencia: %s \n", apariency);
    printf("Inteligencia: %s\n\n", intelligency);
    system("pause");
    return 0;
}

char *HairColor()
{
    int i;
    char *colors[] = {"Rojo.", "Azul.", "Morado.", "Negro.", "Blando."};
    srand(time(NULL));
    i = rand() % 5;
    return colors[i];
}

char *Intelligency()
{
    int i;
    char *colors[] = {"Bruto.", "Inteligente.", "Idiota.", "Diego.", "Pajuo."};
    srand(time(NULL));
    i = rand() % 5;
    return colors[i];
}

char *Apariency()
{
    int i;
    char *colors[] = {"Feo.", "Horrible.", "Bonito.", "Bello nojoda.", "Mas feo que un mojon."};
    srand(time(NULL));
    i = rand() % 5;
    return colors[i];
}
