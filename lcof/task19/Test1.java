package lcof.task19;

import org.junit.Test;

import static org.junit.Assert.*;

public class Test1 {
    @Test
    public void example1() {
        String s = "aa", p = "a";

        Solution solution = new Solution();
        boolean actual = solution.isMatch(s, p);
        assertFalse(actual);
    }

    @Test
    public void example2() {
        String s = "aa", p = "a*";

        Solution solution = new Solution();
        boolean actual = solution.isMatch(s, p);
        assertTrue(actual);
    }

    @Test
    public void example3() {
        String s = "ab", p = ".*";

        Solution solution = new Solution();
        boolean actual = solution.isMatch(s, p);
        assertTrue(actual);
    }

    @Test
    public void example4() {
        String s = "aab", p = "c*a*b";

        Solution solution = new Solution();
        boolean actual = solution.isMatch(s, p);
        assertTrue(actual);
    }

    @Test
    public void example5() {
        String s = "mississippi", p = "mis*is*p*.";

        Solution solution = new Solution();
        boolean actual = solution.isMatch(s, p);
        assertFalse(actual);
    }
}
