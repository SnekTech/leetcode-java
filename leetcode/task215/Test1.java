package leetcode.task215;

import org.junit.Test;

import static org.junit.Assert.*;

public class Test1 {
    @Test
    public void example1() {
        int[] nums = new int[] {3,2,1,5,6,4};
        int k = 2;

        Solution solution = new Solution();
        int expected = 5;
        int actual = solution.findKthLargest(nums, k);
        assertEquals(expected, actual);
    }

    @Test
    public void example2() {
        int[] nums = new int[] {3,2,3,1,2,4,5,5,6};
        int k = 4;

        Solution solution = new Solution();
        int expected = 4;
        int actual = solution.findKthLargest(nums, k);
        assertEquals(expected, actual);
    }
}
