package lcof.task44;

import org.junit.Test;

import static org.junit.Assert.*;

public class Test1 {
    @Test
    public void example1() {
        int n = 3;

        Solution solution = new Solution();
        int expected = 3;
        int actual = solution.findNthDigit(n);
        assertEquals(expected, actual);
    }

    @Test
    public void example2() {
        int n = 11;

        Solution solution = new Solution();
        int expected = 0;
        int actual = solution.findNthDigit(n);
        assertEquals(expected, actual);
    }
}
