package com.bigbirthday.invitation;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
public class Label {
    public static void main(String[] args) throws IOException {
        CliOptions cliOptions = new CliOptions();
        HashMap<String, String> filterOptions = cliOptions.parse(args);
        File file = new File(args[0]);
        MyReader myReader = new MyReader(file);
        String fileText = myReader.read();
        ArrayList<Person> peopleList = new RecordsFormatter(fileText).getRecords();
        People people = new People(peopleList);
        ArrayList<Predicate> predicates = new ArrayList<>();

        if (filterOptions.containsKey("c")){
            predicates.add(new CountryPredicate(filterOptions.get("c")));
        }
        if(filterOptions.containsKey("a")){
            predicates.add(new AgePredicate(filterOptions.get("a")));
        }

        CompositePredicate compositePredicate = new CompositePredicate(predicates);
        People filteredPeople = people.filter(compositePredicate);
        LabelPrinter printer = new LabelPrinter(filteredPeople);
        printer.print(filterOptions);
    }
}