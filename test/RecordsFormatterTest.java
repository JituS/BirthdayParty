import com.bigbirthday.invitation.Person;
import com.bigbirthday.invitation.RecordsFormatter;
import org.junit.Test;

import static org.junit.Assert.*;

public class RecordsFormatterTest {
    @Test
    public void testgetRecords_returns_records_added_into_Array() throws Exception {
        String text = "Julius,Barrows,Female,18,Veda haven,Vermont,Macedonia\n" +
                "Melody,Dooley,Female,31,West Shanna,Vermont,Bangladesh\n" +
                "Gavin,Hyatt,Male,36,Crooks ton,Illinois,Romania";
        RecordsFormatter recordsFormatter = new RecordsFormatter(text);
        Person[] people = recordsFormatter.getRecords();
        assertEquals(people.length, 3);
    }
}