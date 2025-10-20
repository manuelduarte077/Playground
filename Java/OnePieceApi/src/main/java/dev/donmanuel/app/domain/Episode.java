package dev.donmanuel.app.domain;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class Episode {
    @SerializedName("_id")
    private String id;

    @SerializedName("title")
    private String title;

    @SerializedName("episode")
    private int episodeNumber;

    @SerializedName("season")
    private int season;

    @SerializedName("release")
    private String releaseDate;

    @SerializedName("characters")
    private List<String> characters;

    @SerializedName("locations")
    private List<String> locations;

    @SerializedName("opening")
    private String opening;

    public String getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public int getEpisodeNumber() {
        return episodeNumber;
    }

    public int getSeason() {
        return season;
    }

    public String getReleaseDate() {
        return releaseDate;
    }

    public List<String> getCharacters() {
        return characters;
    }

    public List<String> getLocations() {
        return locations;
    }

    public String getOpening() {
        return opening;
    }

    @Override
    public String toString() {
        return String.format("Episodio %d - %s (%s)", episodeNumber, title, releaseDate);
    }

}
