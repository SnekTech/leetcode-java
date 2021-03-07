package leetcode.task200;

import org.junit.Test;

import static org.junit.Assert.*;

public class Test1 {
    @Test
    public void example1() {
        char[][] grid = new char[][]{
                {'1', '1', '1', '1', '0'},
                {'1', '1', '0', '1', '0'},
                {'1', '1', '0', '0', '0'},
                {'0', '0', '0', '0', '0'}

        };

        Solution solution = new Solution();
        int expected = 1;
        int actual = solution.numIslands(grid);
        assertEquals(expected, actual);
    }

    @Test
    public void example2() {
        char[][] grid = new char[][]{
                {'1', '1', '0', '0', '0'},
                {'1', '1', '0', '0', '0'},
                {'0', '0', '1', '0', '0'},
                {'0', '0', '0', '1', '1'}

        };

        Solution solution = new Solution();
        int expected = 3;
        int actual = solution.numIslands(grid);
        assertEquals(expected, actual);
    }
}
