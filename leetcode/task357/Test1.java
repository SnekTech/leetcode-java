package leetcode.task357;

import org.junit.Test;

import static org.junit.Assert.*;

public class Test1 {
    @Test
    public void example1() {
        int n = 2;
        
        Solution solution = new Solution();
        int expected = 91;
        int actual = solution.countNumbersWithUniqueDigits(n);
        assertEquals(expected, actual);
    }

    @Test
    public void wrong1() {
        int n = 0;

        Solution solution = new Solution();
        int expected = 1;
        int actual = solution.countNumbersWithUniqueDigits(n);
        assertEquals(expected, actual);
    }
}
