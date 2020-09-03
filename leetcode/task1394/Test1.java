package leetcode.task1394;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class Test1 {
    @Test
    public void example1() {
        int[] arr = { 2, 2, 3, 4 };
        int expected = 2;

        int actual = new Solution().findLucky(arr);

        assertEquals(expected, actual);
    }

    @Test
    public void example2() {
        int[] arr = { 1, 2, 2, 3, 3, 3 };
        int expected = 3;

        int actual = new Solution().findLucky(arr);

        assertEquals(expected, actual);
    }

    @Test
    public void example3() {
        int[] arr = { 2, 2, 2, 3, 3 };
        int expected = -1;

        int actual = new Solution().findLucky(arr);

        assertEquals(expected, actual);
    }

    @Test
    public void example4() {
        int[] arr = { 5 };
        int expected = -1;

        int actual = new Solution().findLucky(arr);

        assertEquals(expected, actual);
    }

    @Test
    public void example5() {
        int[] arr = { 7, 7, 7, 7, 7, 7, 7 };
        int expected = 7;

        int actual = new Solution().findLucky(arr);

        assertEquals(expected, actual);
    }
}
