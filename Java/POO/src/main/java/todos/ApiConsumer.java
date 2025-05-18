package todos;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.io.IOException;

import com.fasterxml.jackson.databind.ObjectMapper;

public class ApiConsumer {

    // URL de la API que vamos a consumir
    private static final String API_URL = "https://jsonplaceholder.typicode.com/todos/1";

    public static void main(String[] args) {
        // 1. Crear el cliente HTTP
        // HttpClient es inmutable y thread-safe, puedes reutilizarlo.
        HttpClient client = HttpClient.newBuilder()
                .version(HttpClient.Version.HTTP_2) // Opcional, usa HTTP/1.1 por defecto
                .followRedirects(HttpClient.Redirect.NORMAL) // Manejo de redirecciones
                .build();

        // 2. Crear la solicitud HTTP
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(API_URL))
                .header("Accept", "application/json") // Informamos que aceptamos JSON
                .GET() // Método GET (es el predeterminado, pero es bueno ser explícito)
                .build();

        System.out.println("Realizando petición a: " + API_URL);

        try {
            // 3. Enviar la solicitud y obtener la respuesta
            // HttpResponse.BodyHandlers.ofString() convierte el cuerpo de la respuesta en un String
            HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());

            // 4. Verificar el código de estado de la respuesta
            int statusCode = response.statusCode();
            System.out.println("Código de estado: " + statusCode);

            if (statusCode == 200) { // 200 OK significa éxito
                String responseBody = response.body();
                System.out.println("Cuerpo de la respuesta (JSON crudo):");
                System.out.println(responseBody);

                // 5. Parsear el JSON a un objeto Java usando Jackson
                ObjectMapper objectMapper = new ObjectMapper();
                Todo todoItem = objectMapper.readValue(responseBody, Todo.class);

                // 6. Mostrar los datos del objeto parseado
                System.out.println("\nDatos del Todo parseados:");
                System.out.println("ID de Usuario: " + todoItem.getUserId());
                System.out.println("ID del Todo: " + todoItem.getId());
                System.out.println("Título: " + todoItem.getTitle());
                System.out.println("Completado: " + todoItem.isCompleted());

                System.out.println("\nUsando el método toString() del objeto Todo:");
                System.out.println(todoItem);

            } else {
                System.out.println("Error al consumir la API. Código de estado: " + statusCode);
                System.out.println("Cuerpo de la respuesta (si hubo): " + response.body());
            }

        } catch (IOException e) {
            System.err.println("Error de E/S al realizar la petición HTTP: " + e.getMessage());
            // e.printStackTrace(); // Descomentar para ver el stack trace completo
        } catch (InterruptedException e) {
            System.err.println("La petición HTTP fue interrumpida: " + e.getMessage());
            Thread.currentThread().interrupt(); // Buena práctica restaurar el estado de interrupción
            // e.printStackTrace();
        } catch (Exception e) { // Captura general para otros errores (ej. parsing de Jackson)
            System.err.println("Ocurrió un error inesperado: " + e.getMessage());
            e.printStackTrace();
        }
    }
}