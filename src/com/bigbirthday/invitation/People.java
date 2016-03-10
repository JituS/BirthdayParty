package com.bigbirthday.invitation;

import java.util.ArrayList;

public class People{
    private ArrayList<Person> people;

    public People() {
        this.people = new ArrayList<>();
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

    public Person get(int index) {
        return this.people.get(index);
    }

    public int size() {
        return people.size();
    }
}
