package leetcode.task85;

import org.junit.Test;

import static org.junit.Assert.*;

public class Test1 {
    @Test
    public void example1() {
        char[][] matrix = new char[][] {
                {'1', '0', '1', '0', '0'},
                {'1', '0', '1', '1', '1'},
                {'1', '1', '1', '1', '1'},
                {'1', '0', '0', '1', '0'}
        };

        Solution solution = new Solution();
        int expected = 6;
        int actual = solution.maximalRectangle(matrix);
        assertEquals(expected, actual);
    }

    @Test
    public void example2() {
        char[][] matrix = new char[][] {
        };

        Solution solution = new Solution();
        int expected = 0;
        int actual = solution.maximalRectangle(matrix);
        assertEquals(expected, actual);
    }

    @Test
    public void example3() {
        char[][] matrix = new char[][] {
                {'0'},
        };

        Solution solution = new Solution();
        int expected = 0;
        int actual = solution.maximalRectangle(matrix);
        assertEquals(expected, actual);
    }

    @Test
    public void example4() {
        char[][] matrix = new char[][] {
                {'1'},
        };

        Solution solution = new Solution();
        int expected = 1;
        int actual = solution.maximalRectangle(matrix);
        assertEquals(expected, actual);
    }

    @Test
    public void example5() {
        char[][] matrix = new char[][] {
                {'0', '0'},
        };

        Solution solution = new Solution();
        int expected = 0;
        int actual = solution.maximalRectangle(matrix);
        assertEquals(expected, actual);
    }
}
