#include <stdio.h>
#include <string.h>

int main(int argc, char const *argv[])
{
    int mark[5] = {1, 2, 3, 4, 5}; // Array of integers
    char name[20] = "John Doe"; // Array of characters (string)
    
    for (int i = 0; i < 5; i++)
    {
        printf("%d ", mark[i]);
    }
    
    printf("\nName: %s\n", name);
    
    return 0;
}
