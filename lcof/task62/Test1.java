package lcof.task62;

import org.junit.Test;

import static org.junit.Assert.*;

public class Test1 {
    @Test
    public void example1() {
        int n = 5, m = 3;

        Solution solution = new Solution();
        int expected = 3;
        int actual = solution.lastRemaining(n, m);
        assertEquals(expected, actual);
    }

    @Test
    public void example2() {
        int n = 10, m = 17;

        Solution solution = new Solution();
        int expected = 2;
        int actual = solution.lastRemaining(n, m);
        assertEquals(expected, actual);
    }
}
