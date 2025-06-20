package dev.donmanuel.app.adapter;

import dev.donmanuel.app.adapter.adapter.JsonFileAdapter;
import dev.donmanuel.app.adapter.adapter.FileAdapter;
import dev.donmanuel.app.adapter.adapter.InputFile;
import dev.donmanuel.app.adapter.model.Person;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.util.List;

public class Main {

    private static final String path =
            "src" + File.separator +
                    "main" + File.separator +
                    "resources" + File.separator +
                    "files" + File.separator;

    public static void main(String[] args) throws FileNotFoundException {

        // Read Excel
        /*
        InputFile excelFileAdapter = new ExcelFileAdapter();
        FileAdapter fileAdapter = new FileAdapter(excelFileAdapter);
        InputStream inputStream = new FileInputStream(path + "ArchivoExcel.xlsx");
        */

        // Read CSV
        /*
        InputFile csvFileAdapter = new CsvFileAdapter();
        FileAdapter fileAdapter = new FileAdapter(csvFileAdapter);
        InputStream inputStream = new FileInputStream(path + "ArchivoCSV.txt");
        */

        // Read XML
        /*
        InputFile xmlFileAdapter = new XmlFileAdapter();
        FileAdapter fileAdapter = new FileAdapter(xmlFileAdapter);
        InputStream inputStream = new FileInputStream(path + "ArchivoXML.xml");
         */

        // Read JSON
        InputFile jsonFileAdapter = new JsonFileAdapter();
        FileAdapter fileAdapter = new FileAdapter(jsonFileAdapter);
        InputStream inputStream = new FileInputStream(path + "ArchivoJSON.json");


        List<Person> personList = fileAdapter.readFile(inputStream);
        System.out.println(personList);

    }
}
