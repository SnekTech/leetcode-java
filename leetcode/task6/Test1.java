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
}
