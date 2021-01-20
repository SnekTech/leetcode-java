package leetcode.task11;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Test1 {
    @Test
    public void example1() {

        int[] height = new int[] { 1, 8, 6, 2, 5, 4, 8, 3, 7 };

        Solution solution = new Solution();
        int expected = 49;
        int actual = solution.maxArea(height);
        assertEquals(expected, actual);
    }

    @Test
    public void example2() {

        int[] height = new int[] { 1, 1 };

        Solution solution = new Solution();
        int expected = 1;
        int actual = solution.maxArea(height);
        assertEquals(expected, actual);
    }

    @Test
    public void example3() {

        int[] height = new int[] { 4, 3, 2, 1, 4 };

        Solution solution = new Solution();
        int expected = 16;
        int actual = solution.maxArea(height);
        assertEquals(expected, actual);
    }

    @Test
    public void example4() {

        int[] height = new int[] { 1, 2, 1 };

        Solution solution = new Solution();
        int expected = 2;
        int actual = solution.maxArea(height);
        assertEquals(expected, actual);
    }
}
