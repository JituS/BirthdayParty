import com.bigbirthday.invitation.*;
import com.bigbirthday.invitation.Person;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;
public class NameTest {
    private Address address;
    private Name Jeromy;
    private Name Anita;

    @Before
    public void setUp() throws Exception {
        Jeromy = new Name("Jeromy", "Donnelly", "Male");
        Anita = new Name("Anita", "Sharma", "Female");
        address = new Address(new City("New Alanna"), new State("Illinois"), new Country("Slovakia (Slovak Republic)"));
    }

    @Test
    public void getFormalName_returns_formal_name_with_prefix() throws Exception {
        Person Jeromy = new Person(this.Jeromy, address, new Age(32));
        assertEquals(Jeromy.formal(), "Mr Donnelly, Jeromy");
    }
    @Test
    public void getFormalName_returns_formal_name_with_prefix_Ms_if_person_is_female() throws Exception {
        Person Anita = new Person(this.Anita, address, new Age(32));
        assertEquals(Anita.formal(), "Ms Sharma, Anita");
    }
    @Test
    public void getInformalName_returns_formal_name_with_prefix() throws Exception {
        Person Jeromy = new Person(this.Jeromy, address, new Age(32));
        assertEquals(Jeromy.inFormal(), "Mr Jeromy Donnelly");
    }
    @Test
    public void getInformalName_returns_formal_name_with_prefix_Ms_if_person_is_female() throws Exception {
        Person Anita = new Person(this.Anita, address, new Age(32));
        assertEquals(Anita.inFormal(), "Ms Anita Sharma");
    }
}