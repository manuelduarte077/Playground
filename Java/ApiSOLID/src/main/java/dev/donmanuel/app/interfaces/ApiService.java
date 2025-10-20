package dev.donmanuel.app.interfaces;

import java.util.List;

public interface ApiService<T> {
    List<T> fetchAll();
}
