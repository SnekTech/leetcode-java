package leetcode.task16;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Test1 {
    @Test
    public void example() {
        int[] nums = new int[] { -1, 2, 1, -4 };
        int target = 1;
        Solution solution = new Solution();
        int expected = 2;
        int actual = solution.threeSumClosest(nums, target);
        assertEquals(expected, actual);
    }
}
