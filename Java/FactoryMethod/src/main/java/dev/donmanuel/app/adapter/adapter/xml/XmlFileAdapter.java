package dev.donmanuel.app.adapter.adapter.xml;

import com.fasterxml.jackson.dataformat.xml.XmlMapper;
import dev.donmanuel.app.adapter.adapter.InputFile;
import dev.donmanuel.app.adapter.model.Person;

import java.io.InputStream;
import java.util.List;

public class XmlFileAdapter implements InputFile {
    @Override
    public List<Person> readFile(InputStream inputStream) {
        try {
            XmlMapper xmlMapper = new XmlMapper();
            PeopleWrapperXml peopleWrapperXml = xmlMapper.readValue(inputStream, PeopleWrapperXml.class);
            List<Person> personList = peopleWrapperXml.getPeople();

            return personList;
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
