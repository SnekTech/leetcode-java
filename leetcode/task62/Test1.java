package leetcode.task62;

import org.junit.Test;

import static org.junit.Assert.*;


public class Test1 {
    @Test
    public void example1() {
        int m = 3, n = 7;
        Solution solution = new Solution();
        int expected = 28;
        int actual = solution.uniquePaths(m, n);
        assertEquals(expected, actual);
    }

    @Test
    public void example2() {
        int m = 3, n = 2;
        Solution solution = new Solution();
        int expected = 3;
        int actual = solution.uniquePaths(m, n);
        assertEquals(expected, actual);
    }
}
