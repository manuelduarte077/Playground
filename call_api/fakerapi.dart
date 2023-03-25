import 'dart:convert';

import 'package:http/http.dart' as http;

void main() async {
  getAndPrintPersons();
}

const baseUrl = 'https://fakerapi.it/api/v1/persons';

void getAndPrintPersons() async {
  final res = await http.get(Uri.parse(baseUrl));
  final data = json.decode(res.body)['data'];
  int index = 1;
  data.forEach((person) {
    String firstName = person['firstname'];
    String lastName = person['lastname'];

    print('$index: $firstName $lastName');
    index++;
  });
}
