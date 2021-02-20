package leetcode.task131;

import org.junit.Test;

import static org.junit.Assert.*;

public class Test1 {
    @Test
    public void example() {
        String s = "aab";

        Solution solution = new Solution();
        var actual = solution.partition(s);
        assertTrue(true);
    }

    @Test
    public void example1() {
        String s = "aba";

        Solution solution = new Solution();
        boolean actual = solution.isPalindrome(s, 0, s.length() - 1);
        assertTrue(actual);
    }

    @Test
    public void example3() {
        String s = "abaa";

        Solution solution = new Solution();
        boolean actual = solution.isPalindrome(s, 0, s.length() - 1);
        assertFalse(actual);
    }
}
