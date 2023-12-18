function esPrimo(numero) {
  if (numero < 2) {
    return false;
  }
  for (let i = 2; i <= Math.sqrt(numero); i++) {
    if (numero % i === 0) {
      return false;
    }
  }
  return true;
}

function imprimirPrimosEntre1y100() {
  const primos = [];
  for (let i = 1; i <= 100; i++) {
    if (esPrimo(i)) {
      primos.push(i);
    }
  }
  console.log("Números primos entre 1 y 100:", primos);
}

// Verificar si un número es primo
const numeroAVerificar = 17;
if (esPrimo(numeroAVerificar)) {
  console.log(`${numeroAVerificar} es un número primo.`);
} else {
  console.log(`${numeroAVerificar} no es un número primo.`);
}

// Imprimir números primos entre 1 y 100
imprimirPrimosEntre1y100();
