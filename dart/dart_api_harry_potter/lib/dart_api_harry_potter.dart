import 'dart:convert';
import 'package:http/http.dart' as http;

void getCharacters() async {
  final url = 'https://hp-api.onrender.com/api/characters';

  final response = await http.get(Uri.parse(url));

  if (response.statusCode == 200) {
    final jsonResponse = jsonDecode(response.body);
    print(jsonResponse);
  } else {
    print('Request failed with status: ${response.statusCode}.');
  }
}
