package leetcode.task91;

import org.junit.Test;

import static org.junit.Assert.*;

public class Test1 {
    @Test
    public void example1() {
        String s = "12";

        Solution solution = new Solution();
        int expected = 2;
        int actual = solution.numDecodings(s);
        assertEquals(expected, actual);
    }

    @Test
    public void example2() {
        String s = "226";

        Solution solution = new Solution();
        int expected = 3;
        int actual = solution.numDecodings(s);
        assertEquals(expected, actual);
    }

    @Test
    public void example3() {
        String s = "0";

        Solution solution = new Solution();
        int expected = 0;
        int actual = solution.numDecodings(s);
        assertEquals(expected, actual);
    }

    @Test
    public void example4() {
        String s = "1";

        Solution solution = new Solution();
        int expected = 1;
        int actual = solution.numDecodings(s);
        assertEquals(expected, actual);
    }
}
