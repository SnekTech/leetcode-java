package lcof.task5;

import org.junit.Test;

import static org.junit.Assert.*;

public class Test1 {
    @Test
    public void example() {
        String s = "We are happy.";

        Solution solution = new Solution();
        String expected = "We%20are%20happy.";
        String actual = solution.replaceSpace(s);
        assertEquals(expected, actual);
    }
}
