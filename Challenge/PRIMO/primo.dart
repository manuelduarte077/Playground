void main(List<String> args) {
  esPrimo(55);
}

void esPrimo(int numero) {
  int contador = 0;

  // Contador de divisores
  for (int i = 1; i <= numero; i++) {
    if (numero % i == 0) {
      contador++;
    }
  }

  // Primo
  if (contador == 2) {
    print("El numero $numero es primo");
  } else {
    print("El numero $numero no es primo");
  }

  // Par o impar
  if (numero % 2 == 0) {
    print("El numero $numero es par");
  } else {
    print("El numero $numero es impar");
  }

  // Multiplo de 5
  if (numero % 5 == 0) {
    print("El numero $numero es multiplo de 5");
  } else {
    print("El numero $numero no es multiplo de 5");
  }
}
