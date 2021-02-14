package lcof.task47;

import org.junit.Test;

import static org.junit.Assert.*;

public class Test1 {
    @Test
    public void example() {
        int[][] grid = new int[][]{
                {1, 3, 1},
                {1, 5, 1},
                {4, 2, 1}
        };

        Solution solution = new Solution();
        int expected = 12;
        int actual = solution.maxValue(grid);
        assertEquals(expected, actual);
    }
}
