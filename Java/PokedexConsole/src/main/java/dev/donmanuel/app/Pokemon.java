package dev.donmanuel.app;

public class Pokemon {
    int id;
    String name;
    String type;
    String description;

    Pokemon(int id, String name, String type, String description) {
        this.id = id;
        this.name = name;
        this.type = type;
        this.description = description;
    }

    String shortString() {
        return id + ": " + name + " (" + type + ")";
    }

    String detailedString() {
        return "\nID: " + id + "\nNombre: " + name + "\nTipo: " + type + "\nDescripción: " + description;
    }
}
