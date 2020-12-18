package leetcode.task1254;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class Test1 {
    @Test
    public void example1() {
        int[][] grid = new int[][] {
            {1,1,1,1,1,1,1,0},
            {1,0,0,0,0,1,1,0},
            {1,0,1,0,1,1,1,0},
            {1,0,0,0,0,1,0,1},
            {1,1,1,1,1,1,1,0}
        };

        Solution solution = new Solution();
        int expected = 2;
        int actual = solution.closedIsland(grid);
        assertEquals(expected, actual);
    }

    @Test
    public void example2() {
        
        int[][] grid = new int[][] {
            {0,0,1,0,0},
            {0,1,0,1,0},
            {0,1,1,1,0}
        };

        Solution solution = new Solution();
        int expected = 1;
        int actual = solution.closedIsland(grid);
        assertEquals(expected, actual);
    }

    @Test
    public void example3() {
        
        int[][] grid = new int[][] {
            {1,1,1,1,1,1,1},
            {1,0,0,0,0,0,1},
            {1,0,1,1,1,0,1},
            {1,0,1,0,1,0,1},
            {1,0,1,1,1,0,1},
            {1,0,0,0,0,0,1},
            {1,1,1,1,1,1,1}
        };

        Solution solution = new Solution();
        int expected = 2;
        int actual = solution.closedIsland(grid);
        assertEquals(expected, actual);
    }

    @Test
    public void wrong1() {
        
        int[][] grid = new int[][] {
            {0,1,1,1,0},
            {1,0,1,0,1},
            {1,0,1,0,1},
            {1,0,0,0,1},
            {0,1,1,1,0}
        };

        Solution solution = new Solution();
        int expected = 1;
        int actual = solution.closedIsland(grid);
        assertEquals(expected, actual);
    }
}
