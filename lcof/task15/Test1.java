package lcof.task15;

import org.junit.Test;

import static org.junit.Assert.*;

public class Test1 {
    @Test
    public void example1() {
        int n = 0b00000000000000000000000000001011;

        Solution solution = new Solution();
        int expected = 3;
        int actual = solution.hammingWeight(n);
        assertEquals(expected, actual);
    }

    @Test
    public void example2() {
        int n = 0b00000000000000000000000010000000;

        Solution solution = new Solution();
        int expected = 1;
        int actual = solution.hammingWeight(n);
        assertEquals(expected, actual);
    }

    @Test
    public void example3() {
        int n = 0b11111111111111111111111111111101;

        Solution solution = new Solution();
        int expected = 31;
        int actual = solution.hammingWeight(n);
        assertEquals(expected, actual);
    }
}
