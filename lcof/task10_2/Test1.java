package lcof.task10_2;

import org.junit.Test;

import static org.junit.Assert.*;

public class Test1 {
    @Test
    public void example1() {
        int n = 2;

        Solution solution = new Solution();
        int expected = 2;
        int actual = solution.numWays(n);
        assertEquals(expected, actual);
    }

    @Test
    public void example2() {
        int n = 7;

        Solution solution = new Solution();
        int expected = 21;
        int actual = solution.numWays(n);
        assertEquals(expected, actual);
    }

    @Test
    public void example3() {
        int n = 0;

        Solution solution = new Solution();
        int expected = 1;
        int actual = solution.numWays(n);
        assertEquals(expected, actual);
    }
}
