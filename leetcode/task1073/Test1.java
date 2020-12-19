package leetcode.task1073;

import org.junit.Test;
import static org.junit.Assert.*;

public class Test1 {
    @Test
    public void example() {
        int[] arr1 = new int[]{1, 1, 1, 1, 1};
        int[] arr2 = new int[]{1, 0, 1};

        Solution solution = new Solution();
        int[] expected = new int[]{1, 0, 0, 0, 0};
        int[] actual = solution.addNegabinary(arr1, arr2);
        assertArrayEquals(expected, actual);
    }

    @Test
    public void wrong1() {
        int[] arr1 = new int[]{0};
        int[] arr2 = new int[]{1, 0};

        Solution solution = new Solution();
        int[] expected = new int[]{1, 0};
        int[] actual = solution.addNegabinary(arr1, arr2);
        assertArrayEquals(expected, actual);
    }
}
