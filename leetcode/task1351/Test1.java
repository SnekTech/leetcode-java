package leetcode.task1351;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class Test1 {
    @Test
    public void example1() {
        int[][] grid = new int[][] {
            { 4, 3, 2, -1 },
            { 3, 2, 1, -1 },
            { 1, 1, -1, -2 },
            { -1, -1, -2, -3 }
        };

        int expected = 8;
        int actual = new Solution().countNegatives(grid);

        assertEquals(expected, actual);
    }

    @Test
    public void example2() {
        int[][] grid = new int[][] {
            { 3, 2 },
            { 1, 0 }
        };

        int expected = 0;
        int actual = new Solution().countNegatives(grid);

        assertEquals(expected, actual);
    }

    @Test
    public void example3() {
        int[][] grid = new int[][] {
            { 1, -1 },
            { -1, -1 }
        };

        int expected = 3;
        int actual = new Solution().countNegatives(grid);

        assertEquals(expected, actual);
    }

    @Test
    public void example4() {
        int[][] grid = new int[][] {
            { -1 }
        };

        int expected = 1;
        int actual = new Solution().countNegatives(grid);

        assertEquals(expected, actual);
    }
}
