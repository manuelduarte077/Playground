package dev.donmanuel.app.adapter.adapter;

import dev.donmanuel.app.adapter.model.Person;

import java.io.InputStream;
import java.util.List;

public interface InputFile {

    List<Person> readFile(InputStream inputStream);

}
