package dev.donmanuel.app.adapter.adapter;

import dev.donmanuel.app.adapter.model.Person;

import java.io.InputStream;
import java.util.List;

public class FileAdapter {
    private InputFile inputFile;

    public FileAdapter(InputFile inputFile) {
        this.inputFile = inputFile;
    }

    public List<Person> readFile(InputStream inputStream) {
        return this.inputFile.readFile(inputStream);
    }

}
