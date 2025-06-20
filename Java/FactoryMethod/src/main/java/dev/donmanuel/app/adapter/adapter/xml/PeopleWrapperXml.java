package dev.donmanuel.app.adapter.adapter.xml;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlElementWrapper;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import dev.donmanuel.app.adapter.model.Person;

import java.util.List;

public class PeopleWrapperXml {

    @JacksonXmlElementWrapper(useWrapping = false)
    @JacksonXmlProperty(localName = "Person")
    private List<Person> people;


    public List<Person> getPeople() {
        return people;
    }

    public void setPeople(List<Person> people) {
        this.people = people;
    }
}
