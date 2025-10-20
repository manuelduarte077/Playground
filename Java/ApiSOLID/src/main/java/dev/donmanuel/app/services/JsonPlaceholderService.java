package dev.donmanuel.app.services;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import dev.donmanuel.app.domain.Post;
import dev.donmanuel.app.interfaces.ApiService;
import dev.donmanuel.app.utils.HttpClientHelper;

import java.lang.reflect.Type;
import java.util.List;

public class JsonPlaceholderService implements ApiService<Post> {
    private final HttpClientHelper httpClient;
    private final Gson gson;

    public JsonPlaceholderService(HttpClientHelper httpClient) {
        this.httpClient = httpClient;
        this.gson = new Gson();
    }

    @Override
    public List<Post> fetchAll() {
        String url = "https://jsonplaceholder.typicode.com/posts";
        String json = httpClient.get(url);

        Type listType = new TypeToken<List<Post>>() {
        }.getType();
        return gson.fromJson(json, listType);
    }
}
