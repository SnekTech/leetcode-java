package lcof.task4;

import org.junit.Test;

import static org.junit.Assert.*;

public class Test1 {
    @Test
    public void example1() {
        int[][] matrix = new int[][]{
                {1, 4, 7, 11, 15},
                {2, 5, 8, 12, 19},
                {3, 6, 9, 16, 22},
                {10, 13, 14, 17, 24},
                {18, 21, 23, 26, 30}
        };
        int target = 5;

        Solution solution = new Solution();
        boolean actual = solution.findNumberIn2DArray(matrix, target);
        assertTrue(actual);
    }

    @Test
    public void example2() {
        int[][] matrix = new int[][]{
                {1, 4, 7, 11, 15},
                {2, 5, 8, 12, 19},
                {3, 6, 9, 16, 22},
                {10, 13, 14, 17, 24},
                {18, 21, 23, 26, 30}
        };
        int target = 20;

        Solution solution = new Solution();
        boolean actual = solution.findNumberIn2DArray(matrix, target);
        assertFalse(actual);
    }

    @Test
    public void wrong1() {
        int[][] matrix = new int[][]{
                {-5}
        };
        int target = -5;

        Solution solution = new Solution();
        boolean actual = solution.findNumberIn2DArray(matrix, target);
        assertTrue(actual);
    }
}
