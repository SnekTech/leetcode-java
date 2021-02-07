package lcof.task14_2;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

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

    @Test
    public void wrong1() {
        int n = 120;

        Solution solution = new Solution();
        int expected = 953271190;
        int actual = solution.cuttingRope(n);
        assertEquals(expected, actual);
    }
}
