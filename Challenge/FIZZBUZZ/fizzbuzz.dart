void main() {
  fizzBuzz(100);
}

void fizzBuzz(int number) {
  ///
  for (int i = 1; i <= number; i++) {
    if (i % 15 == 0) {
      // 3*5 = 15
      print('FizzBuzz');
    } else if (i % 5 == 0) {
      // 5
      print('Buzz');
    } else if (i % 3 == 0) {
      // 3
      print('Fizz');
    } else {
      print(i);
    }
  }

  print('Done');
}
