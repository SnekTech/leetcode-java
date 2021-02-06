package lcof.task12;

import org.junit.Test;

import static org.junit.Assert.*;

@SuppressWarnings("DuplicatedCode")
public class Test1 {
    @Test
    public void example1() {
        char[][] board = new char[][] {
                { 'A','B','C','E' },
                { 'S','F','C','S' },
                { 'A','D','E','E' }
        };
        String word = "ABCCED";

        Solution solution = new Solution();
        boolean actual = solution.exist(board, word);
        assertTrue(actual);
    }

    @Test
    public void example2() {
        char[][] board = new char[][] {
                { 'A','B','C','E' },
                { 'S','F','C','S' },
                { 'A','D','E','E' }
        };
        String word = "SEE";

        Solution solution = new Solution();
        boolean actual = solution.exist(board, word);
        assertTrue(actual);
    }

    @Test
    public void example3() {
        char[][] board = new char[][] {
                { 'A','B','C','E' },
                { 'S','F','C','S' },
                { 'A','D','E','E' }
        };
        String word = "ABCB";

        Solution solution = new Solution();
        boolean actual = solution.exist(board, word);
        assertFalse(actual);
    }

    @Test
    public void wrong1() {
        char[][] board = new char[][] {
                { 'A','B','C','E' },
                { 'S','F','E','S' },
                { 'A','D','E','E' }
        };
        String word = "ABCESEEEFS";

        Solution solution = new Solution();
        boolean actual = solution.exist(board, word);
        assertTrue(actual);
    }
}
