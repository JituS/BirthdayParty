package com.bigbirthday.invitation;

public class CountryPredicate implements Predicate {
    private final String threshold;

    public CountryPredicate(String threshold) {
        this.threshold = threshold;
    }

    @Override
    public boolean test(Person person) {
        Country anotherCountry = new Country(threshold);
        return person.belongsFromCountry(anotherCountry);
    }
}
