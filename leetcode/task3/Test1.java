package leetcode.task3;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Test1 {
    @Test
    public void example1() {
        String s = "abcabcbb";

        Solution solution = new Solution();
        int expected = 3;
        int actual = solution.lengthOfLongestSubstring(s);
        assertEquals(expected, actual);
    }

    @Test
    public void example2() {
        String s = "bbbbb";

        Solution solution = new Solution();
        int expected = 1;
        int actual = solution.lengthOfLongestSubstring(s);
        assertEquals(expected, actual);
    }

    @Test
    public void example3() {
        String s = "pwwkew";

        Solution solution = new Solution();
        int expected = 3;
        int actual = solution.lengthOfLongestSubstring(s);
        assertEquals(expected, actual);
    }

    @Test
    public void example4() {
        String s = "";

        Solution solution = new Solution();
        int expected = 0;
        int actual = solution.lengthOfLongestSubstring(s);
        assertEquals(expected, actual);
    }
}
