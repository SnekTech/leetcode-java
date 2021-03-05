package leetcode.task32;

import org.junit.Test;

import static org.junit.Assert.*;

public class Test1 {
    @Test
    public void example1() {
        String s = "(()";

        Solution solution = new Solution();
        int expected = 2;
        int actual = solution.longestValidParentheses(s);
        assertEquals(expected, actual);
    }

    @Test
    public void example2() {
        String s = ")()())";

        Solution solution = new Solution();
        int expected = 4;
        int actual = solution.longestValidParentheses(s);
        assertEquals(expected, actual);
    }

    @Test
    public void example3() {
        String s = "";

        Solution solution = new Solution();
        int expected = 0;
        int actual = solution.longestValidParentheses(s);
        assertEquals(expected, actual);
    }

    @Test
    public void wrong1() {
        String s = "()(()";

        Solution solution = new Solution();
        int expected = 2;
        int actual = solution.longestValidParentheses(s);
        assertEquals(expected, actual);
    }

    @Test
    public void wrong2() {
        String s = "(()(((()";

        Solution solution = new Solution();
        int expected = 2;
        int actual = solution.longestValidParentheses(s);
        assertEquals(expected, actual);
    }
}
