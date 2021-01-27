package leetcode.task55;

import org.junit.Test;

import static org.junit.Assert.*;


public class Test1 {
    @Test
    public void example1() {
        int[] nums = new int[] { 2, 3, 1, 1, 4 };
        Solution solution = new Solution();
        boolean actual = solution.canJump(nums);
        assertTrue(actual);
    }

    @Test
    public void example2() {
        int[] nums = new int[] { 3, 2, 1, 0, 4 };
        Solution solution = new Solution();
        boolean actual = solution.canJump(nums);
        assertFalse(actual);
    }
}
