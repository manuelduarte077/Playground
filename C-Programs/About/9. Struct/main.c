#include <stdio.h>
#include <stdlib.h>
#include <unistd.h>
#define MAX_USERS 100

struct User
{
  char name[15];
  char username[20];
  int years;
};

void mainMenu();
void userTable(struct User users[], int *count);
void searchUser(struct User users[], int *count);
void deleteUser(struct User users[], int *count);
void editUser(struct User users[], int *count);
void newUser(struct User users[], int *count);

void mainMenu()
{
  printf("Sistema de usuarios\n\n");
  printf("1) Agregar usuario\n");
  printf("2) eliminar usuario\n");
  printf("3) Buscar usuario\n");
  printf("4) Editar usuario\n");
  printf("5) Ver tabla de usuarios\n");
  printf("6) Salir\n\n");
}

/* Funcion para imprimir a los usuarios registrados */
void printTableRow(char *str1, char *str2, char *str3)
{
  printf("| %15s | %20s | %5s |\n", str1, str2, str3);
}

void userTable(struct User users[], int *count)
{
  if (*count == 0)
  {
    printf("No hay usuarios registrados.\n");
    return;
  }

  printf("Tabla de usuarios:\n\n");
  printf("+-----------------+----------------------+-------+\n");
  printf("| Nombre          | Nombre de usuario    | Edad  |\n");
  printf("+-----------------+----------------------+-------+\n");

  for (int i = 0; i < *count; i++)
  {
    printTableRow(users[i].name, users[i].username, itoa(users[i].years, (char *)malloc(sizeof(char) * 20), 10));
  }

  printf("+-----------------+----------------------+-------+\n\n");
}

/* Funcion para buscar a los usuarios */
void searchUser(struct User users[], int *count)
{
  if (*count == 0)
  {
    printf("No hay usuarios registrados.\n");
    return;
  }

  char username[20];
  printf("Ingresa el nombre de usuario del usuario que deseas eliminar: ");
  scanf("%s", username);

  int index = -1;
  for (int i = 0; i < *count; i++)
  {
    if (strcmp(users[i].username, username) || strcmp(users[i].name, username) == 0)
    {
      index = i;
      break;
    }
  }

  if (index == -1)
  {
    printf("No se encontró ningún usuario con ese nombre de usuario.\n");
    return;
  }
  else
  {
    printf("Usuario #%d\n", index);
    printf("Nombre: %s\n", users[index].name);
    printf("Usuario: %s\n", users[index].username);
    printf("Edad: %d\n\n", users[index].years);
  }
}

/* Funcion para agregar a un nuevo usuario */
void newUser(struct User users[], int *count)
{
  if (*count >= MAX_USERS)
  {
    printf("No se pueden agregar más usuarios. Límite alcanzado.\n");
    return;
  }

  struct User user;

  printf("Escribe tu nombre: ");
  scanf("%s", user.name);

  printf("Escribe tu nombre de usuario: ");
  scanf("%s", user.username);

  printf("Escribe tu edad: ");
  scanf("%d", &user.years);

  users[*count] = user;

  (*count)++;

  printf("Usuario agregado correctamente.\n");
  sleep(1);      // Esperamos 3 segundos.
  system("cls"); // Limpiamos la consola.
}

/* Funcion para borrar a un usuario */
void deleteUser(struct User users[], int *count)
{
  if (*count == 0)
  {
    printf("No hay usuarios registrados.\n");
    return;
  }

  char username[20];
  printf("Ingresa el nombre de usuario del usuario que deseas eliminar: ");
  scanf("%s", username);

  int index = -1;
  for (int i = 0; i < *count; i++)
  {
    if (strcmp(users[i].username, username) == 0)
    {
      index = i;
      break;
    }
  }

  if (index == -1)
  {
    printf("No se encontró ningún usuario con ese nombre de usuario.\n");
    return;
  }

  // Desplaza todos los elementos después del elemento eliminado una posición hacia la izquierda
  for (int i = index; i < *count - 1; i++)
  {
    users[i] = users[i + 1];
  }

  (*count)--;
  printf("Usuario eliminado correctamente.\n");
  sleep(1);      // Esperamos 1 segundos.
  system("cls"); // Limpiamos la consola.
}

/* Funcion para editar a un usuario */
void editUser(struct User users[], int *count)
{
  char newUsername[20];
  char newName[15];
  int newYears;

  if (*count == 0)
  {
    printf("No hay usuarios registrados.\n");
    return;
  }

  char username[20];
  printf("Ingresa el nombre de usuario del usuario que deseas editar: ");
  scanf("%s", username);

  int index = -1;
  for (int i = 0; i < *count; i++)
  {
    if (strcmp(users[i].username, username) == 0)
    {
      index = i;
      break;
    }
  }

  if (index == -1)
  {
    printf("No se encontró ningún usuario con ese nombre de usuario.\n");
    return;
  }

  printf("Ingresa el nuevo nombre: ");
  scanf("%s", newName);

  printf("Ingresa el nuevo nombre de usuario: ");
  scanf("%s", newUsername);

  printf("Ingresa la nueva edad: ");
  scanf("%d", &newYears);

  // Actualizar los valores del usuario
  strcpy(users[index].name, newName);
  strcpy(users[index].username, newUsername);
  users[index].years = newYears;

  printf("Usuario editado correctamente.\n");
  sleep(1);      // Esperamos 1 segundos.
  system("cls"); // Limpiamos la consola.
}

int main()
{
  int option;
  int usersCount = 0;
  struct User users[MAX_USERS];

  do
  {
    mainMenu();
    printf("Selecciona una opcion: ");
    scanf("%i", &option);
    system("cls");

    switch (option)
    {
    case 1:
      newUser(users, &usersCount);
      break;
    case 2:
      deleteUser(users, &usersCount);
      break;
    case 3:
      searchUser(users, &usersCount);
      break;
    case 4:
      editUser(users, &usersCount);
      break;
    case 5:
      userTable(users, &usersCount);
      break;
    case 6:
      printf("6) Salir\n");
      break;
    default:
      printf("Opcion no valida\n");
      break;
    }
  } while (option != 6);

  return 0;
}
