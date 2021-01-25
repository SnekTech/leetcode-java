package leetcode.task33;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Test1 {
    @Test
    public void example1() {
        int[] nums = new int[] { 4, 5, 6, 7, 0, 1, 2 };
        int target = 0;
        Solution solution = new Solution();
        int expected = 4;
        int actual = solution.search(nums, target);
        assertEquals(expected, actual);
    }

    @Test
    public void example2() {
        int[] nums = new int[] { 4, 5, 6, 7, 0, 1, 2 };
        int target = 3;
        Solution solution = new Solution();
        int expected = -1;
        int actual = solution.search(nums, target);
        assertEquals(expected, actual);
    }

    @Test
    public void example3() {
        int[] nums = new int[] { 1 };
        int target = 0;
        Solution solution = new Solution();
        int expected = -1;
        int actual = solution.search(nums, target);
        assertEquals(expected, actual);
    }
}
