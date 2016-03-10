import com.bigbirthday.invitation.*;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;


public class PeopleTest {
    private Name name1;
    private Name name2;
    private Address address1;
    private Address address2;
    private Address address3;
    private Name name3;

    @Before
    public void setUp() throws Exception {
        name1 = new Name("Gavin", "Donnelly", "Male");
        address1 = new Address(new City("New Alanna"), new State("Illinois"), new Country("Slovakia (Slovak Republic)"));
        name2 = new Name("Jeromy", "Donnelly", "Female");
        address2 = new Address(new City("New Alanna"), new State("Illinois"), new Country("Bangladesh"));
        name3 = new Name("Arun", "sathia", "Male");
        address3 = new Address(new City("xyz"), new State("abc"), new Country("Bangladesh"));
    }

    @Test
    public void testcontryFilter_filters_the_people_and_returns_new_people_object() throws Exception {
        Person Jeromy = new Person(name1, address1, new Age(21));
        Person Gavin = new Person(name2, address2, new Age(32));
        Person Arun = new Person(name3, address3, new Age(19));
        Person[] peopleList = new Person[3];
        peopleList[0] = Gavin;
        peopleList[1] = Jeromy;
        peopleList[2] = Arun;
        People people = new People();
        for (Person aPeopleList : peopleList) {
            people.add(aPeopleList);
        }
        People expected = new People();
        expected.add(Gavin);
        expected.add(Arun);
        People actual = people.countryFilter(new Country("Bangladesh"));
        assertEquals(expected, actual);
    }

    @Test
    public void testcontryFilter_filters_the_people_and_returns_empty_object_if_no_one_belongs_from_given_country() throws Exception {
        Person Jeromy = new Person(name1, address1, new Age(21));
        Person Gavin = new Person(name2, address2, new Age(32));
        Person Arun = new Person(name3, address3, new Age(19));
        Person[] peopleList = new Person[3];
        peopleList[0] = Gavin;
        peopleList[1] = Jeromy;
        peopleList[2] = Arun;
        People people = new People();
        for (Person aPeopleList : peopleList) {
            people.add(aPeopleList);
        }
        People expected = new People();
        People actual = people.countryFilter(new Country("India"));
        assertEquals(expected, actual);
    }

    @Test
    public void testageFilter_filters_the_people_and_returns_new_people_object() throws Exception {
        Person Jeromy = new Person(name1, address1, new Age(21));
        Person Gavin = new Person(name2, address2, new Age(32));
        Person Arun = new Person(name3, address3, new Age(19));
        Person[] peopleList = new Person[3];
        peopleList[0] = Gavin;
        peopleList[1] = Jeromy;
        peopleList[2] = Arun;
        People people = new People();
        for (Person aPeopleList : peopleList) {
            people.add(aPeopleList);
        }
        People expected = new People();
        expected.add(Gavin);
        expected.add(Jeromy);
        People actual = people.ageFilter(new Age(20));
        assertEquals(expected, actual);
    }
}