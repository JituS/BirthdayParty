package com.bigbirthday.invitation;

import java.io.IOException;
import java.util.ArrayList;

public class RecordsFormatter {
    private final String fileText;

    public RecordsFormatter(String fileText) {
        this.fileText = fileText;
    }

    public ArrayList<Person> getRecords() throws IOException {
        String[] allRecords = fileText.split("\n");
        ArrayList<Person> records = new ArrayList<Person>();
        for (int i = 0; i < allRecords.length; i++){
            String[] record = allRecords[i].split(",");

            Name name = new Name(record[0], record[1], record[2]);
            Country country = new Country(record[6]);
            State state = new State(record[5]);
            City city = new City(record[4]);
            Age age = new Age(Integer.parseInt(record[3]));

            Address address = new Address(city, state, country);
            records.add(new Person(name, address, age));
        }
        return records;
    }
}

