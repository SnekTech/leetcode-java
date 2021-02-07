package lcof.task13;

import org.junit.Test;

import static org.junit.Assert.*;

public class Test1 {
    @Test
    public void example1() {
        int m = 2, n = 3, k = 1;

        Solution solution = new Solution();
        int expected = 3;
        int actual = solution.movingCount(m, n, k);
        assertEquals(expected, actual);
    }

    @Test
    public void example2() {
        int m = 3, n = 1, k = 0;

        Solution solution = new Solution();
        int expected = 1;
        int actual = solution.movingCount(m, n, k);
        assertEquals(expected, actual);
    }
}
