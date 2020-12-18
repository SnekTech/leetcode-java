package leetcode.task870;

import static org.junit.Assert.assertArrayEquals;

import org.junit.Test;

public class Test1 {
    @Test
    public void example1() {
        int[] A = new int[] { 2, 7, 11, 15 };
        int[] B = new int[] { 1, 10, 4, 11 };
        Solution solution = new Solution();
        int[] expected = new int[] { 2, 11, 7, 15 };
        int[] actual = solution.advantageCount(A, B);
        assertArrayEquals(expected, actual);
    }

    @Test
    public void example2() {
        int[] A = new int[] { 12, 24, 8, 32 };
        int[] B = new int[] { 13, 25, 32, 11 };
        Solution solution = new Solution();
        int[] expected = new int[] { 24, 32, 8, 12 };
        int[] actual = solution.advantageCount(A, B);
        assertArrayEquals(expected, actual);
    }
}
