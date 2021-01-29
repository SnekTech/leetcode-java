package leetcode.task75;

import org.junit.Test;

import static org.junit.Assert.*;

public class Test1 {
    @Test
    public void example1() {
        int[] nums = new int[] { 2, 0, 2, 1, 1, 0 };

        Solution solution = new Solution();
        int[] expected = new int[] { 0, 0, 1, 1, 2, 2 };
        solution.sortColors(nums);

        assertArrayEquals(expected, nums);
    }

    @Test
    public void example2() {
        int[] nums = new int[] { 2, 0, 1 };

        Solution solution = new Solution();
        int[] expected = new int[] { 0, 1, 2 };
        solution.sortColors(nums);

        assertArrayEquals(expected, nums);
    }

    @Test
    public void example3() {
        int[] nums = new int[] { 0 };

        Solution solution = new Solution();
        int[] expected = new int[] { 0 };
        solution.sortColors(nums);

        assertArrayEquals(expected, nums);
    }

    @Test
    public void example4() {
        int[] nums = new int[] { 1 };

        Solution solution = new Solution();
        int[] expected = new int[] { 1 };
        solution.sortColors(nums);

        assertArrayEquals(expected, nums);
    }

    @Test
    public void wrong1() {
        int[] nums = new int[] { 1, 2, 0 };

        Solution solution = new Solution();
        int[] expected = new int[] { 0, 1, 2 };
        solution.sortColors(nums);

        assertArrayEquals(expected, nums);
    }
}
