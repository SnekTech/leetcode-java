package lcof.task14_1;

import org.junit.Test;

import static org.junit.Assert.*;

public class Test1 {
    @Test
    public void example1() {
        int n = 2;

        Solution solution = new Solution();
        int expected = 1;
        int actual = solution.cuttingRope(n);
        assertEquals(expected, actual);
    }

    @Test
    public void example2() {
        int n = 10;

        Solution solution = new Solution();
        int expected = 36;
        int actual = solution.cuttingRope(n);
        assertEquals(expected, actual);
    }
}
