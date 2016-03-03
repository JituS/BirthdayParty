import org.junit.Test;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class PersonTest {
    @Test
    public void getFirstLastName_return_full_name_in_specified_format() throws Exception {
        Name name = new Name("Jeromy", "Donnelly", "Male");
        assertEquals("Mr Jeromy Donnelly",name.getFirstLastName());
    }

    @Test
    public void getLastFirstName_return_full_name_in_specified_format() throws Exception {
        Name name = new Name("Jeromy", "Donnelly", "Male");
        assertEquals("Mr Donnelly, Jeromy",name.getLastFirstName());
    }

    @Test
    public void belongsFromCountry_says_true_if_person_belongs_from_specified_country() {
        Name name = new Name("Jeromy", "Donnelly", "Male");
        Place place = new Place("New Alanna", "Illinois", "Slovakia (Slovak Republic)");
        Person Jeromy = new Person(name, place, 32);
        assertFalse(Jeromy.belongsFromCountry("India"));
        assertTrue(Jeromy.belongsFromCountry("Slovakia (Slovak Republic)"));
    }
}