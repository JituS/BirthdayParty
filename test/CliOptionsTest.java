import org.junit.Test;

import java.util.HashMap;

import static org.junit.Assert.*;

public class CliOptionsTest {
    @Test
    public void filterOptions_filters_all_options_and_formal_takes_as_default() throws Exception {
        String[] args = new String[]{"filename","-a","20","-c","Bangladesh"};
        CliOptions cliOptions = new CliOptions();
        HashMap filtered = cliOptions.parse(args);
        HashMap<Object, Object> expected = new HashMap<>();
        expected.put("c","Bangladesh");
        expected.put("a","20");
        expected.put("format","-f");
        assertEquals(expected, filtered);
    }
    @Test
    public void filterOptions_filters_all_options() throws Exception {
        String[] args = new String[]{"filename","-f","-a","20","-c","Bangladesh"};
        CliOptions cliOptions = new CliOptions();
        HashMap filtered = cliOptions.parse(args);
        HashMap<Object, Object> expected = new HashMap<>();
        expected.put("c","Bangladesh");
        expected.put("a","20");
        expected.put("format","-f");
        assertEquals(expected, filtered);
    }
    @Test
    public void filterOptions_filters_all_options_if_sequence_is_different() throws Exception {
        String[] args = new String[]{"filename","-f","-c","Bangladesh","-a","20"};
        CliOptions cliOptions = new CliOptions();
        HashMap filtered = cliOptions.parse(args);
        HashMap<Object, Object> expected = new HashMap<>();
        expected.put("c","Bangladesh");
        expected.put("a","20");
        expected.put("format","-f");
        assertEquals(expected, filtered);
    }
}