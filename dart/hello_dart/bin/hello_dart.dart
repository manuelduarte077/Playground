import 'dart:math';

void main() {
  print('Hello, Dart Apprentice reader!');

  /// Is this a function ()?
  arithmeticOperations();
}

/// Simple Operations [arithmeticOperations]

void arithmeticOperations() {
  /// Addition = 8
  print(2 + 6);

  // Subtraction = 8
  print(10 - 2);

  // Multiplication = 8
  print(2 * 4);

  // Division = 2.5
  print(24 / 3);

  /// Other Operations
  print(((8000 / (5 * 10)) - 32) ~/ (29 % 5));

  ///
  print(350 / (5 + 2));

  /// 0.7071067811865475
  print(sin(45 * pi / 180));

  /// -0.7071067811865475
  print(cos(135 * pi / 180));

  /// Raiz cuadrada de 2
  print(sqrt(2));

  /// Maximo de 2 numeros
  print(max(5, 10));

  /// Minimo de 2 numeros
  print(min(-5, -10));

  /// Combinacion de funciones
  print(max(sqrt(2), pi / 2));
}
