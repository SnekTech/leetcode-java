package lcof.task49;

import org.junit.Test;

import static org.junit.Assert.*;

public class Test1 {
    @Test
    public void example() {
        int n = 10;

        Solution solution = new Solution();
        int expected = 12;
        int actual = solution.nthUglyNumber(n);
        assertEquals(expected, actual);
    }
}
