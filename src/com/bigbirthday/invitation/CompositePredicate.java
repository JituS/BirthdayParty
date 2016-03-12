package com.bigbirthday.invitation;
import java.util.ArrayList;

public class CompositePredicate implements Predicate {
    private ArrayList<Predicate> predicates;
    public CompositePredicate(ArrayList<Predicate> predicates) {
        this.predicates = predicates;
    }

    @Override
    public boolean test(Person person) {
        for (Predicate predicate : predicates) {
            if(!predicate.test(person)) return false;
        }
        return true;
    }
}
