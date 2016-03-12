import com.bigbirthday.invitation.*;
import com.bigbirthday.invitation.Person;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class PersonTest {
    private Name name;
    private Address address;
    private Age age;

    @Before
    public void setUp() throws Exception {
        name = new Name("Jeromy", "Donnelly", "Male");
        address = new Address(new City("New Alanna"), new State("Illinois"),new Country("Slovakia (Slovak Republic)"));
        age = new Age(32);
    }

    @Test
    public void getFirstLastName_return_full_name_in_specified_format() throws Exception {
        assertEquals("Mr Jeromy Donnelly",name.getInformalName());
    }

    @Test
    public void getLastFirstName_return_full_name_in_specified_format() throws Exception {
        assertEquals("Mr Donnelly, Jeromy",name.getFormalName());
    }

    @Test
    public void belongsFromCountry_says_true_if_person_belongs_from_specified_country() {
        Person Jeromy = new Person(name, address, age);
        Country India = new Country("India");
        Country Slovakia = new Country("Slovakia (Slovak Republic)");
        assertFalse(Jeromy.belongsFromCountry(India));
        assertTrue(Jeromy.belongsFromCountry(Slovakia));
    }

    @Test
    public void testAgeGreaterThan() throws Exception {
        Person Jeromy = new Person(name, address, age);
        assertTrue(Jeromy.ageGreaterThan(new Age(20)));
        assertFalse(Jeromy.ageGreaterThan(new Age(34)));
    }

    @Test
    public void testFormal() throws Exception {
        Person Jeromy = new Person(name, address, age);
        assertEquals(Jeromy.formal(), "Mr Donnelly, Jeromy");
    }

    @Test
    public void testInFormal() throws Exception {
        Person Jeromy = new Person(name, address, age);
        assertEquals(Jeromy.inFormal(), "Mr Jeromy Donnelly");
    }
}