package com.bigbirthday.invitation;
import java.util.ArrayList;
import java.util.List;

public class People{

    private List<Person> people;

    public People(List<Person> list) {
        this.people = list;
    }

    public People ageFilter(Age age){
        People filtered = new People(new ArrayList<>());
        for (Person person : people) {
            if(person.ageGreaterThan(age))
                filtered.add(person);
        }
        return filtered;
    }

    public People countryFilter(Country country){
        People filtered = new People(new ArrayList<>());
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
    public boolean equals(java.lang.Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        People people1 = (People) o;
        return people != null ? people.equals(people1.people) : people1.people == null;
    }

    public Person get(int index) {
        return this.people.get(index);
    }

    public int size() {
        return people.size();
    }

    public People filter(CompositePredicate compositePredicate) {
        People filtered = new People(new ArrayList<>());
        people.stream().filter(person -> compositePredicate.test(person)).forEach(filtered::add);
        return filtered;
    }
}
