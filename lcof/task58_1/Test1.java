package lcof.task58_1;

import org.junit.Test;

import static org.junit.Assert.*;

public class Test1 {
    @Test
    public void example1() {
        String s = "the sky is blue";

        Solution solution = new Solution();
        String expected = "blue is sky the";
        String actual = solution.reverseWords(s);
        assertEquals(expected, actual);
    }

    @Test
    public void example2() {
        String s = "  hello world!  ";

        Solution solution = new Solution();
        String expected = "world! hello";
        String actual = solution.reverseWords(s);
        assertEquals(expected, actual);
    }

    @Test
    public void example3() {
        String s = "a good   example";

        Solution solution = new Solution();
        String expected = "example good a";
        String actual = solution.reverseWords(s);
        assertEquals(expected, actual);
    }
}
