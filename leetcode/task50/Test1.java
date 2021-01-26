package leetcode.task50;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Test1 {
    @Test
    public void example1() {
        double x = 2;
        int n = 10;
        Solution solution = new Solution();
        double expected = 1024;
        double actual = solution.myPow(x, n);
        assertEquals(expected, actual, 0);
    }

    @Test
    public void example2() {
        double x = 2.1;
        int n = 3;
        Solution solution = new Solution();
        double expected = 9.261;
        double actual = solution.myPow(x, n);
        assertEquals(expected, actual, 0.0000001);
    }

    @Test
    public void example3() {
        double x = 2;
        int n = -2;
        Solution solution = new Solution();
        double expected = 0.25;
        double actual = solution.myPow(x, n);
        assertEquals(expected, actual, 0);
    }
}
