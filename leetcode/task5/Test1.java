package leetcode.task5;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class Test1 {
    @Test
    public void example1() {
        String s = "babad";
        Solution solution = new Solution();
        String expected1 = "bab";
        String expected2 = "aba";
        String actual = solution.longestPalindrome(s);
        assertTrue(expected1.equals(actual) || expected2.equals(actual));
    }

    @Test
    public void example2() {
        String s = "cbbd";
        Solution solution = new Solution();
        String expected = "bb";
        String actual = solution.longestPalindrome(s);
        assertEquals(expected, actual);
    }

    @Test
    public void example3() {
        String s = "a";
        Solution solution = new Solution();
        String expected = "a";
        String actual = solution.longestPalindrome(s);
        assertEquals(expected, actual);
    }

    @Test
    public void example4() {
        String s = "ac";
        Solution solution = new Solution();
        String expected1 = "a";
        String expected2 = "c";
        String actual = solution.longestPalindrome(s);
        assertTrue(expected1.equals(actual) || expected2.equals(actual));
    }
}
