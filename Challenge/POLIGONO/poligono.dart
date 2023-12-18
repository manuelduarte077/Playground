enum TipoPoligono { triangulo, cuadrado, rectangulo }

double calcularAreaPoligono(TipoPoligono tipo, List<double> args) {
  switch (tipo) {
    case TipoPoligono.triangulo:
      if (args.length != 2) {
        throw ArgumentError(
            'El triángulo requiere 2 argumentos: base y altura.');
      }
      double base = args[0];
      double altura = args[1];
      double area = 0.5 * base * altura;
      print("Área del triángulo: $area");
      return area;

    case TipoPoligono.cuadrado:
      if (args.length != 1) {
        throw ArgumentError('El cuadrado requiere 1 argumento: lado.');
      }
      double lado = args[0];
      double area = lado * lado;
      print("Área del cuadrado: $area");
      return area;

    case TipoPoligono.rectangulo:
      if (args.length != 2) {
        throw ArgumentError(
            'El rectángulo requiere 2 argumentos: base y altura.');
      }
      double base = args[0];
      double altura = args[1];
      double area = base * altura;
      print("Área del rectángulo: $area");
      return area;

    default:
      throw ArgumentError('Tipo de polígono no soportado.');
  }
}

void main() {
  calcularAreaPoligono(TipoPoligono.triangulo, [2, 3]);
  calcularAreaPoligono(TipoPoligono.cuadrado, [2]);
  calcularAreaPoligono(TipoPoligono.rectangulo, [2, 3]);
}
