package leetcode.task1566;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class Test1 {
    @Test
    public void example1() {
        int[] arr = new int[] { 1, 2, 4, 4, 4, 4 };
        int m = 1;
        int k = 3;

        boolean expected = true;
        boolean actual = new Solution().containsPattern(arr, m, k);

        assertEquals(expected, actual);
    }

    @Test
    public void example2() {
        int[] arr = new int[] { 1, 2, 1, 2, 1, 1, 1, 3 };
        int m = 2;
        int k = 2;

        boolean expected = true;
        boolean actual = new Solution().containsPattern(arr, m, k);

        assertEquals(expected, actual);
    }

    @Test
    public void example3() {
        int[] arr = new int[] { 1, 2, 1, 2, 1, 3 };
        int m = 2;
        int k = 3;

        boolean expected = false;
        boolean actual = new Solution().containsPattern(arr, m, k);

        assertEquals(expected, actual);
    }

    @Test
    public void example4() {
        int[] arr = new int[] { 1, 2, 3, 1, 2 };
        int m = 2;
        int k = 2;

        boolean expected = false;
        boolean actual = new Solution().containsPattern(arr, m, k);

        assertEquals(expected, actual);
    }

    @Test
    public void example5() {
        int[] arr = new int[] { 2, 2, 2, 2 };
        int m = 2;
        int k = 3;

        boolean expected = false;
        boolean actual = new Solution().containsPattern(arr, m, k);

        assertEquals(expected, actual);
    }

    @Test
    public void wrong1() {
        int[] arr = new int[] { 2, 2 };
        int m = 1;
        int k = 2;

        boolean expected = true;
        boolean actual = new Solution().containsPattern(arr, m, k);

        assertEquals(expected, actual);
    }
}
