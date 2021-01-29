package leetcode.task74;

import org.junit.Test;

import static org.junit.Assert.*;

public class Test1 {
    @Test
    public void example1() {
        int[][] matrix = new int[][] {
                { 1, 3, 5, 7 },
                { 10, 11, 16, 20 },
                { 23, 30, 34, 60 }
        };
        int target = 3;

        Solution solution = new Solution();
        boolean actual = solution.searchMatrix(matrix, target);
        assertTrue(actual);
    }

    @Test
    public void example2() {
        int[][] matrix = new int[][] {
                { 1, 3, 5, 7 },
                { 10, 11, 16, 20 },
                { 23, 30, 34, 60 }
        };
        int target = 13;

        Solution solution = new Solution();
        boolean actual = solution.searchMatrix(matrix, target);
        assertFalse(actual);
    }
}
