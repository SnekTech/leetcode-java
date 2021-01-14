package leetcode.task8;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Test1 {
    @Test
    public void example1() {
        String s = "42";
        Solution solution = new Solution();
        int expected = 42;
        int actual = solution.myAtoi(s);
        assertEquals(expected, actual);
    }

    @Test
    public void example2() {
        String s = "   -42";
        Solution solution = new Solution();
        int expected = -42;
        int actual = solution.myAtoi(s);
        assertEquals(expected, actual);
    }

    @Test
    public void example3() {
        String s = "4193 with words";
        Solution solution = new Solution();
        int expected = 4193;
        int actual = solution.myAtoi(s);
        assertEquals(expected, actual);
    }

    @Test
    public void example4() {
        String s = "words and 987";
        Solution solution = new Solution();
        int expected = 0;
        int actual = solution.myAtoi(s);
        assertEquals(expected, actual);
    }

    @Test
    public void example5() {
        String s = "-91283472332";
        Solution solution = new Solution();
        int expected = Integer.MIN_VALUE;
        int actual = solution.myAtoi(s);
        assertEquals(expected, actual);
    }
}
