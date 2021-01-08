package leetcode.task189;

import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class Test1 {
    @Test
    public void example1() {

        int[] nums = new int[] { 1, 2, 3, 4, 5, 6, 7 };
        int k = 3;

        Solution solution = new Solution();
        int[] expected = new int[] { 5, 6, 7, 1, 2, 3, 4 };
        solution.rotate(nums, k);
        assertArrayEquals(expected, nums);
    }

    @Test
    public void example2() {

        int[] nums = new int[] { -1, -100, 3, 99 };
        int k = 2;

        Solution solution = new Solution();
        int[] expected = new int[] { 3, 99, -1, -100 };
        solution.rotate(nums, k);
        assertArrayEquals(expected, nums);
    }
}
