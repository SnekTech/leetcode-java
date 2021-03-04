package leetcode.task70;

import org.junit.Test;

import static org.junit.Assert.*;

public class Test1 {
    @Test
    public void example1() {
        int n = 2;

        Solution solution = new Solution();
        int expected = 2;
        int actual = solution.climbStairs(n);
        assertEquals(expected, actual);
    }

    @Test
    public void example2() {
        int n = 3;

        Solution solution = new Solution();
        int expected = 3;
        int actual = solution.climbStairs(n);
        assertEquals(expected, actual);
    }
}
