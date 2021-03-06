package leetcode.task76;

import org.junit.Test;

import static org.junit.Assert.*;

public class Test1 {
    @Test
    public void example1() {
        String s = "ADOBECODEBANC", t = "ABC";

        Solution solution = new Solution();
        String expected = "BANC";
        String actual = solution.minWindow(s, t);
        assertEquals(expected, actual);
    }

    @Test
    public void example2() {
        String s = "a", t = "a";

        Solution solution = new Solution();
        String expected = "a";
        String actual = solution.minWindow(s, t);
        assertEquals(expected, actual);
    }
}
