package dev.donmanuel.app;

import dev.donmanuel.app.domain.Post;
import dev.donmanuel.app.interfaces.ApiService;
import dev.donmanuel.app.services.JsonPlaceholderService;
import dev.donmanuel.app.utils.HttpClientHelper;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        HttpClientHelper client = new HttpClientHelper();
        ApiService<Post> service = new JsonPlaceholderService(client);

        List<Post> posts = service.fetchAll();

        posts.forEach(System.out::println);
    }
}