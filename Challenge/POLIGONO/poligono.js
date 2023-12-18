function calcularAreaPoligono(tipo, ...args) {
  switch (tipo.toLowerCase()) {
    case "triangulo":
      if (args.length === 2) {
        const [base, altura] = args;
        const area = 0.5 * base * altura;
        console.log(`Área del triángulo: ${area}`);
        return area;
      }
      break;
    case "cuadrado":
      if (args.length === 1) {
        const lado = args[0];
        const area = lado * lado;
        console.log(`Área del cuadrado: ${area}`);
        return area;
      }
      break;
    case "rectangulo":
      if (args.length === 2) {
        const [base, altura] = args;
        const area = base * altura;
        console.log(`Área del rectángulo: ${area}`);
        return area;
      }
      break;
  }

  console.log(
    "Tipo de polígono no soportado o número incorrecto de argumentos."
  );
  return null;
}

// Ejemplos de uso
calcularAreaPoligono("triangulo", 4, 6);
calcularAreaPoligono("cuadrado", 5);
calcularAreaPoligono("rectangulo", 3, 8);
