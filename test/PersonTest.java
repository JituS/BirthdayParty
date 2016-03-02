import org.junit.Test;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class PersonTest {
    @Test
    public void belongs_from_says_true_if_person_belongs_from_specified_city() {
        Name name = new Name("Jeromy", "Donnelly", "Male");
        Place place = new Place("New Alanna", "Illinois", "Slovakia (Slovak Republic)");
        Person Jeromy = new Person(name, place, 32);
        assertFalse(Jeromy.belongsFromCity("Bangalore"));
        assertTrue(Jeromy.belongsFromCity("New Alanna"));
    }
}