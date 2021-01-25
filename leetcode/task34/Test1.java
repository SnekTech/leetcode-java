package leetcode.task34;

import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class Test1 {
    @Test
    public void example1() {
        int[] nums = new int[] { 5, 7, 7, 8, 8, 10 };
        int target = 8;
        Solution solution = new Solution();
        int[] expected = new int[] { 3, 4 };
        int[] actual = solution.searchRange(nums, target);
        assertArrayEquals(expected, actual);
    }

    @Test
    public void example2() {
        int[] nums = new int[] { 5, 7, 7, 8, 8, 10 };
        int target = 6;
        Solution solution = new Solution();
        int[] expected = new int[] { -1, -1 };
        int[] actual = solution.searchRange(nums, target);
        assertArrayEquals(expected, actual);
    }

    @Test
    public void example3() {
        int[] nums = new int[] {};
        int target = 0;
        Solution solution = new Solution();
        int[] expected = new int[] { -1, -1 };
        int[] actual = solution.searchRange(nums, target);
        assertArrayEquals(expected, actual);
    }
}
