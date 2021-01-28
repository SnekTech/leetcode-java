package leetcode.task63;

import org.junit.Test;

import static org.junit.Assert.*;

public class Test1 {
    @Test
    public void example1() {
        int[][] obstacleGrid = new int[][] {
                { 0, 0, 0 },
                { 0, 1, 0 },
                { 0, 0, 0 }
        };
        Solution solution = new Solution();
        int expected = 2;
        int actual = solution.uniquePathsWithObstacles(obstacleGrid);
        assertEquals(expected, actual);
    }

    @Test
    public void example2() {
        int[][] obstacleGrid = new int[][] {
                { 0, 1 },
                { 0, 0 }
        };
        Solution solution = new Solution();
        int expected = 1;
        int actual = solution.uniquePathsWithObstacles(obstacleGrid);
        assertEquals(expected, actual);
    }

    @Test
    public void wrong1() {
        int[][] obstacleGrid = new int[][] {
                { 0, 0 },
                { 0, 1 }
        };
        Solution solution = new Solution();
        int expected = 0;
        int actual = solution.uniquePathsWithObstacles(obstacleGrid);
        assertEquals(expected, actual);
    }

    @Test
    public void wrong2() {
        int[][] obstacleGrid = new int[][] {
                { 1, 0 }
        };
        Solution solution = new Solution();
        int expected = 0;
        int actual = solution.uniquePathsWithObstacles(obstacleGrid);
        assertEquals(expected, actual);
    }
}
