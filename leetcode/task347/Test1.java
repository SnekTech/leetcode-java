package leetcode.task347;

import org.junit.Test;

import static org.junit.Assert.*;

public class Test1 {
    @Test
    public void example1() {
        int[] nums = new int[] {1,1,1,2,2,3};
        int k = 2;

        Solution solution = new Solution();
        var actual = solution.topKFrequent(nums, k);
        assertTrue(true);
    }

    @Test
    public void example2() {
        int[] nums = new int[] {1};
        int k = 1;

        Solution solution = new Solution();
        var actual = solution.topKFrequent(nums, k);
        assertTrue(true);
    }
}
