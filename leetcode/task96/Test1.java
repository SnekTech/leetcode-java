package leetcode.task96;

import org.junit.Test;

import static org.junit.Assert.*;

public class Test1 {
    @Test
    public void example() {
        int n = 3;

        Solution solution = new Solution();
        int expected = 5;
        int actual = solution.numTrees(n);
        assertEquals(expected, actual);
    }
}
