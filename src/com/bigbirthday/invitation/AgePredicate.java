package com.bigbirthday.invitation;
public class AgePredicate implements Predicate {
    private String threshold;
    public AgePredicate(String threshold) {
        this.threshold = threshold;
    }

    @Override
    public boolean test(Person person) {
        Age anotherAge = new Age(Integer.parseInt(threshold));
        return person.ageGreaterThan(anotherAge);
    }
}
