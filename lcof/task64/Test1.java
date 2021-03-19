package lcof.task64;

import org.junit.Test;

import static org.junit.Assert.*;

public class Test1 {
    @Test
    public void example1() {
        int n = 3;

        Solution solution = new Solution();
        int expected = 6;
        int actual = solution.sumNums(n);
        assertEquals(expected, actual);
    }

    @Test
    public void example2() {
        int n = 9;

        Solution solution = new Solution();
        int expected = 45;
        int actual = solution.sumNums(n);
        assertEquals(expected, actual);
    }
}
