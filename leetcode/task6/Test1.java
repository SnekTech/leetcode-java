package leetcode.task6;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Test1 {
    @Test
    public void example1() {
        String s = "PAYPALISHIRING";
        int numRows = 3;

        Solution solution = new Solution();
        String expected = "PAHNAPLSIIGYIR";
        String actual = solution.convert(s, numRows);
        assertEquals(expected, actual);
    }

    @Test
    public void example2() {
        String s = "PAYPALISHIRING";
        int numRows = 4;

        Solution solution = new Solution();
        String expected = "PINALSIGYAHRPI";
        String actual = solution.convert(s, numRows);
        assertEquals(expected, actual);
    }

    @Test
    public void example3() {
        String s = "A";
        int numRows = 1;

        Solution solution = new Solution();
        String expected = "A";
        String actual = solution.convert(s, numRows);
        assertEquals(expected, actual);
    }

    @Test
    public void wrong1() {
        String s = "AB";
        int numRows = 2;

        Solution solution = new Solution();
        String expected = "AB";
        String actual = solution.convert(s, numRows);
        assertEquals(expected, actual);
    }

    @Test
    public void wrong2() {
        String s = "ABCD";
        int numRows = 4;

        Solution solution = new Solution();
        String expected = "ABCD";
        String actual = solution.convert(s, numRows);
        assertEquals(expected, actual);
    }

    @Test
    public void wrong3() {
        String s = "ABCD";
        int numRows = 3;

        Solution solution = new Solution();
        String expected = "ABDC";
        String actual = solution.convert(s, numRows);
        assertEquals(expected, actual);
    }

    @Test
    public void wrong4() {
        String s = "ABCDE";
        int numRows = 4;

        Solution solution = new Solution();
        String expected = "ABCED";
        String actual = solution.convert(s, numRows);
        assertEquals(expected, actual);
    }
}
