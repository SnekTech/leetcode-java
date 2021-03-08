package leetcode.task130;

import org.junit.Test;

import static org.junit.Assert.*;

public class Test1 {
    @Test
    public void example1() {
        char[][] board = new char[][]{
                {'X', 'X', 'X', 'X'},
                {'X', 'O', 'O', 'X'},
                {'X', 'X', 'O', 'X'},
                {'X', 'O', 'X', 'X'}

        };

        Solution solution = new Solution();
        solution.solve(board);
        assertTrue(true);
    }

    @Test
    public void example2() {
        char[][] board = new char[][]{
                {'X'},

        };

        Solution solution = new Solution();
        solution.solve(board);
        assertTrue(true);
    }
}
