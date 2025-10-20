package dev.donmanuel.app;


import dev.donmanuel.app.domain.Episode;
import dev.donmanuel.app.services.OnePieceApiService;
import dev.donmanuel.app.utils.HttpClientHelper;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        HttpClientHelper http = new HttpClientHelper();
        OnePieceApiService api = new OnePieceApiService(http);

        try {
            List<Episode> episodes = api.getAllEpisodes();
            System.out.println("✅ Lista de episodios de One Piece:");
            for (Episode e : episodes.subList(0, 5)) { // mostrar solo los primeros 5
                System.out.println(e);
            }
        } catch (Exception e) {
            System.err.println("❌ Error al obtener episodios: " + e.getMessage());
        }
    }
}