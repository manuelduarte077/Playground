import 'package:test/test.dart';
import 'package:http/http.dart' as http;
import 'dart:convert';

void main() {
  group('API tests', () {
    test('Test API request', () async {
      final response = await http.get(
        Uri.parse('https://hp-api.onrender.com/api/characters'),
      );

      expect(response.statusCode, equals(200));

      final jsonResponse = jsonDecode(response.body);
      expect(jsonResponse, isList);

      final firstCharacter = jsonResponse[0];
      expect(firstCharacter, isMap);
    });

    test('Test API request with invalid URL', () async {
      final response = await http.get(
        Uri.parse('https://hp-api.onrender.com/api/characterss'),
      );

      expect(response.statusCode, equals(404));
    });
  });
}
