#include <stdio.h>
#include <stdlib.h>

/* Definición del tipo de dato "Nodo" */
typedef struct node
{
    int data;
    struct node *next;
} Node;

/* Definición de la cola */
typedef struct queue
{
    Node *top;
    Node *end;
} Queue;

Queue *queue;

Node *nodoCreate()
{
    Node *nuevo = (Node *)malloc(sizeof(Node));
    if (nuevo == NULL)
    {
        printf("\nNo se pudo crear el nodo");
        return NULL;
    }
    else
    {
        nuevo->next = NULL;
        return nuevo;
    }
}

/* Función para crear una cola vacía */
Queue *createQueue()
{
    Queue *newQueue = (Queue *)malloc(sizeof(Queue));
    newQueue->top = NULL;
    newQueue->end = NULL;
    return newQueue;
}

/* Función para encolar un elemento en la cola */
void enqueue(int data)
{
    Node *newNode = nodoCreate();
    if (newNode != NULL)
    {
        newNode->data = data;

        if (queue->end == NULL)
        {
            queue->top = newNode;
            queue->end = newNode;
        }
        else
        {
            queue->end->next = newNode;
            queue->end = newNode;
        }
    }
}

/* Función para desencolar un elemento de la cola */
int dequeue()
{
    if (queue->top == NULL)
    {
        return -1;
    }

    int data = queue->top->data;
    Node *tempNode = queue->top;
    queue->top = queue->top->next;

    if (queue->top == NULL)
    {
        queue->end = NULL;
    }

    free(tempNode);
    return data;
}

/* Función para imprimir la cola */
void printQueue()
{
    Node *tempNode = queue->top;
    while (tempNode != NULL)
    {
        printf("%d ", tempNode->data);
        tempNode = tempNode->next;
    }
    printf("\n");
}

int main()
{
    queue = createQueue(); // Inicializar la cola

    /* Encolar algunos elementos en la cola */
    enqueue(10);
    enqueue(20);
    enqueue(30);
    enqueue(40);

    /* Imprimir la cola */
    printf("Elementos de la cola: ");
    printQueue();

    /* Desencolar algunos elementos de la cola */
    printf("Desencolando un elemento: %d\n", dequeue());
    printf("Desencolando un elemento: %d\n", dequeue());

    /* Imprimir la cola */
    printf("Elementos de la cola: ");
    printQueue();

    return 0;
}