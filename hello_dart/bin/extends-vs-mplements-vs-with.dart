/// Main Class [Vehicle]
class Vehicle {
  Vehicle(this.color);

  final String color;
  final String definition = 'Vehicle';
}

/// Use [extends] para crear una clase derivada y
/// [super] cuando desee hacer referencia a la superclase.

class Car extends Vehicle {
  /// Reference to the parent class

  Car(String color) : super(color);

  /// Tambien podemos sobreescribir funciones de la clase padre
  /// [definition] es una propiedad de la clase padre
  /// [Vehicle]

  @override
  String get definition => 'Car: ${super.definition}';
}

class Hatch extends Car {
  Hatch(String color) : super(color);
}
// Se usa Extends para crear una version mas especifica de una clase

/// Main Class [Vehicle]
/// Use [implements] para crear una clase que implementa una interfaz.

class Truck implements Vehicle {
  Truck(this.carColor);

  final String carColor;

  @override
  String get color => carColor;

  @override
  String get definition => '$carColor Truck';
}

main() {
  /// Extends
  final car = Car('red');
  print('Result: Car is a ${car.definition}');
  // Output -> Result: Car is a Vehicle

  /// Implements
  final truck = Truck('blue');
  print('Result: definition: ${truck.definition}');
  // Output -> Result: definition: red car
  print('Result: is Vehicle type: ${truck is Vehicle}');
  // Output -> is Vehicle type: true
}
