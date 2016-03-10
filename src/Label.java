import java.io.File;

import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;

class Label {

    public static void main(String[] args) throws IOException {

        CliOptions cliOptions = new CliOptions();
        HashMap<String, String> filterOptions = cliOptions.parse(args);
        File file = new File(args[0]);

        FileReader fr = new FileReader(file);
        char[] rowData = new char[(int)file.length()];
        fr.read(rowData);

        String fileText = new String(rowData);
        Person[] peopleList = new RecordsFormatter(fileText).getRecords();
        People people = new People();
        People filtered = people;

        for (Person person : peopleList) {
            people.add(person);
        }

        for (String option : filterOptions.keySet()) {
            if (option.equals("c")){
                filtered = filtered.countryFilter(new Country(filterOptions.get(option)));
            }
            if(option.equals("a")){
                Age age = new Age(Integer.parseInt(filterOptions.get(option)));
                filtered = filtered.ageFilter(age);
            }
        }
        filtered.print(filterOptions);
    }
}