package dev.donmanuel.app.services;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import dev.donmanuel.app.domain.Episode;
import dev.donmanuel.app.utils.HttpClientHelper;

import java.lang.reflect.Type;
import java.util.List;

public class OnePieceApiService {
    private static final String URL = "https://api.api-onepiece.com/v2/episodes/en";
    private final HttpClientHelper httpClient;
    private final Gson gson;

    public OnePieceApiService(HttpClientHelper httpClient) {
        this.httpClient = httpClient;
        this.gson = new Gson();
    }

    public List<Episode> getAllEpisodes() {
        String json = httpClient.get(URL);
        Type listType = new TypeToken<List<Episode>>() {
        }.getType();
        return gson.fromJson(json, listType);
    }

}
