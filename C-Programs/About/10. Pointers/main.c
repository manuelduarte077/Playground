#include <stdio.h>

int main()
{
    int a = 10;
    int *b = &a;
    printf("%d", *b);

    *b = 30;
    printf("%d", *b);
    return 0;
}