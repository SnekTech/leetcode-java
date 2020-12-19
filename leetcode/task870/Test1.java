package leetcode.task870;

import static org.junit.Assert.assertTrue;

import java.util.Arrays;

import org.junit.Test;

public class Test1 {

    private static boolean isPassed(int[] expected, int[] actual, int[] B) {
        if (expected.length != actual.length || actual.length != B.length) {
            return false;
        }

        int advantageExpected = 0;
        int advantageActual = 0;
        for (int i = 0; i < expected.length; i++) {
            if (expected[i] > B[i]) {
                advantageExpected++;
            }
            if (actual[i] > B[i]) {
                advantageActual++;
            }
        }

        Arrays.sort(expected);
        Arrays.sort(actual);

        return Arrays.equals(expected, actual) && advantageExpected == advantageActual;
    }

    @Test
    public void example1() {
        int[] A = new int[] { 2, 7, 11, 15 };
        int[] B = new int[] { 1, 10, 4, 11 };
        Solution solution = new Solution();
        int[] expected = new int[] { 2, 11, 7, 15 };
        int[] actual = solution.advantageCount(A, B);
        assertTrue(isPassed(expected, actual, B));
    }

    @Test
    public void example2() {
        int[] A = new int[] { 12, 24, 8, 32 };
        int[] B = new int[] { 13, 25, 32, 11 };
        Solution solution = new Solution();
        int[] expected = new int[] { 24, 32, 8, 12 };
        int[] actual = solution.advantageCount(A, B);
        assertTrue(isPassed(expected, actual, B));
    }

    @Test
    public void wrong1() {
        int[] A = new int[] { 2, 0, 4, 1, 2 };
        int[] B = new int[] { 1, 3, 0, 0, 2 };
        Solution solution = new Solution();
        int[] expected = new int[] { 2, 0, 2, 1, 4 };
        int[] actual = solution.advantageCount(A, B);
        assertTrue(isPassed(expected, actual, B));
    }

    @Test
    public void wrong2() {
        int[] A = new int[] { 15, 15, 4, 5, 0, 1, 7, 10, 3, 1, 10, 10, 8, 2, 3 };
        int[] B = new int[] { 4, 13, 14, 0, 14, 14, 12, 3, 15, 12, 2, 0, 6, 9, 0 };
        Solution solution = new Solution();
        int[] expected = new int[] { 5, 10, 10, 2, 8, 3, 15, 4, 0, 15, 3, 1, 7, 10, 1 };
        int[] actual = solution.advantageCount(A, B);
        assertTrue(isPassed(expected, actual, B));
    }
}
