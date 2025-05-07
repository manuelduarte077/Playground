#include <stdio.h>
#include <time.h>
#include <unistd.h>

int main()
{
    int i;

    srand(time(NULL));
    i = rand() % 5;

    printf("El dado cayo en %d", i);

    return 0;
}