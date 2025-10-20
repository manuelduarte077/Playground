package dev.donmanuel.app.utils;

import java.io.IOException;
import java.net.URI;
import java.net.http.*;
import java.time.Duration;

public class HttpClientHelper {
    private final HttpClient client;

    public HttpClientHelper() {
        this.client = HttpClient.newBuilder()
                .connectTimeout(Duration.ofSeconds(10))
                .build();
    }

    public String get(String url) {
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(url))
                .GET()
                .build();

        try {
            HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());
            if (response.statusCode() >= 200 && response.statusCode() < 300) {
                return response.body();
            } else {
                throw new RuntimeException("Error HTTP: " + response.statusCode());
            }
        } catch (IOException | InterruptedException e) {
            throw new RuntimeException("Error de conexión a la API", e);
        }
    }
}