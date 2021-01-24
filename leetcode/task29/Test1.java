package leetcode.task29;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Test1 {
    @Test
    public void example1() {
        int dividend = 10, divisor = 3;
        Solution solution = new Solution();
        int expected = 3;
        int actual = solution.divide(dividend, divisor);
        assertEquals(expected, actual);
    }

    @Test
    public void example2() {
        int dividend = 7, divisor = -3;
        Solution solution = new Solution();
        int expected = -2;
        int actual = solution.divide(dividend, divisor);
        assertEquals(expected, actual);
    }
}
