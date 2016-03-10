import java.util.ArrayList;
import java.util.HashMap;

public class People{
    private ArrayList<Person> people;

    public People() {
        this.people = new ArrayList<>();
    }

    public void print(HashMap<String, String> filter) {
        for (Person next : people) {
            String labelString = "";
            if(filter.get("format").equals("-f")) labelString += next.formal();
            else labelString += next.inFormal();
            for (String option : filter.keySet()) {
                if (option.equalsIgnoreCase("c")) labelString += ", " + next.country();
                if (option.equalsIgnoreCase("a")) labelString += ", " + next.age();
            }
            System.out.println(labelString);
        }
    }

    public People ageFilter(Age age){
        People filtered = new People();
        for (Person person : people) {
            if(person.ageGreaterThan(age))
                filtered.add(person);
        }
        return filtered;
    }

    public People countryFilter(Country country){
        People filtered = new People();
        for (Person person : people) {
            if (person.belongsFromCountry(country))
                filtered.add(person);
        }
        return filtered;
    }

    public void add(Person person) {
        people.add(person);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        People people1 = (People) o;
        return people != null ? people.equals(people1.people) : people1.people == null;
    }
}
