package country;

import java.net.URI;
import java.net.URLEncoder;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.nio.charset.StandardCharsets;
import java.io.IOException;
import java.util.List;
import java.util.Scanner;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

public class UniversityApiConsumer {

    private static final String API_BASE_URL = "http://universities.hipolabs.com/search?country=";

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingresa el nombre del país para buscar universidades (ej: Spain, United States): ");
        String countryNameInput = scanner.nextLine();

        if (countryNameInput == null || countryNameInput.trim().isEmpty()) {
            System.out.println("No se ingresó un nombre de país.");
            scanner.close();
            return;
        }

        try {
            // Codificar el nombre del país para que sea seguro en una URL
            String encodedCountryName = URLEncoder.encode(countryNameInput.trim(), StandardCharsets.UTF_8.toString());
            String apiUrlWithQuery = API_BASE_URL + encodedCountryName;

            HttpClient client = HttpClient.newBuilder().build();
            HttpRequest request = HttpRequest.newBuilder()
                    .uri(URI.create(apiUrlWithQuery))
                    .header("Accept", "application/json")
                    .GET()
                    .build();

            System.out.println("\nRealizando petición a: " + apiUrlWithQuery);

            HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());
            int statusCode = response.statusCode();
            System.out.println("Código de estado: " + statusCode);

            if (statusCode == 200) {
                String responseBody = response.body();
                // System.out.println("Respuesta JSON cruda:\n" + responseBody); // Descomentar para ver JSON

                ObjectMapper objectMapper = new ObjectMapper();
                // Para deserializar una lista de objetos, usamos TypeReference
                List<University> universities = objectMapper.readValue(responseBody, new TypeReference<List<University>>() {
                });

                if (universities.isEmpty()) {
                    System.out.println("No se encontraron universidades para el país: " + countryNameInput);
                } else {
                    System.out.println("\nUniversidades encontradas en " + countryNameInput + ":");
                    int count = 0;
                    for (University uni : universities) {
                        count++;
                        System.out.println("------------------------------------");
                        System.out.println(count + ". Nombre: " + uni.getName());
                        if (uni.getStateProvince() != null && !uni.getStateProvince().isEmpty()) {
                            System.out.println("   Estado/Provincia: " + uni.getStateProvince());
                        }
                        if (uni.getWebPages() != null && !uni.getWebPages().isEmpty()) {
                            System.out.println("   Página Web: " + uni.getWebPages().get(0)); // Mostrar la primera página web
                        }
                        if (uni.getDomains() != null && !uni.getDomains().isEmpty()) {
                            System.out.println("   Dominio: " + uni.getDomains().get(0)); // Mostrar el primer dominio
                        }
                        if (count >= 10 && universities.size() > 10) { // Limitar la salida si hay muchos resultados
                            System.out.println("... y " + (universities.size() - count) + " más. Mostrando los primeros 10.");
                            break;
                        }
                    }
                }
            } else {
                System.out.println("Error al consumir la API. Código de estado: " + statusCode);
                System.out.println("Cuerpo de la respuesta (si hubo): " + response.body());
            }

        } catch (IOException e) {
            System.err.println("Error de E/S al realizar la petición HTTP: " + e.getMessage());
        } catch (InterruptedException e) {
            System.err.println("La petición HTTP fue interrumpida: " + e.getMessage());
            Thread.currentThread().interrupt();
        } catch (Exception e) {
            System.err.println("Ocurrió un error inesperado: " + e.getMessage());
            e.printStackTrace();
        } finally {
            scanner.close();
        }
    }
}
