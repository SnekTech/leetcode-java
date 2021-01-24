package leetcode.task31;

import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class Test1 {
    @Test
    public void example1() {
        int[] nums = new int[] { 1, 2, 3 };
        Solution solution = new Solution();
        int[] expected = new int[] { 1, 3, 2 };
        solution.nextPermutation(nums);
        assertArrayEquals(expected, nums);
    }

    @Test
    public void example2() {
        int[] nums = new int[] { 3, 2, 1 };
        Solution solution = new Solution();
        int[] expected = new int[] { 1, 2, 3 };
        solution.nextPermutation(nums);
        assertArrayEquals(expected, nums);
    }

    @Test
    public void example3() {
        int[] nums = new int[] { 1, 1, 5 };
        Solution solution = new Solution();
        int[] expected = new int[] { 1, 5, 1 };
        solution.nextPermutation(nums);
        assertArrayEquals(expected, nums);
    }

    @Test
    public void example4() {
        int[] nums = new int[] { 1 };
        Solution solution = new Solution();
        int[] expected = new int[] { 1 };
        solution.nextPermutation(nums);
        assertArrayEquals(expected, nums);
    }
}
