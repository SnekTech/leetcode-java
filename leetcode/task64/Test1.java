package leetcode.task64;

import org.junit.Test;

import static org.junit.Assert.*;

public class Test1 {
    @Test
    public void example1() {
        int[][] grid = new int[][] {
                { 1, 3, 1 },
                { 1, 5, 1 },
                { 4, 2, 1 }
        };
        Solution solution = new Solution();
        int expected = 7;
        int actual = solution.minPathSum(grid);
        assertEquals(expected, actual);
    }

    @Test
    public void example2() {
        int[][] grid = new int[][] {
                { 1, 2, 3 },
                { 4, 5, 6 }
        };
        Solution solution = new Solution();
        int expected = 12;
        int actual = solution.minPathSum(grid);
        assertEquals(expected, actual);
    }
}
