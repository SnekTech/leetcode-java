package leetcode.task506;

import static org.junit.Assert.assertTrue;

import java.util.Arrays;

import org.junit.Test;

public class Test1 {
    @Test
    public void example() {
        int[] nums = new int[] { 5, 4, 3, 2, 1 };
        Solution solution = new Solution();
        String[] expected = new String[] {
            "Gold Medal",
            "Silver Medal", 
            "Bronze Medal", 
            "4", 
            "5"};
        String[] actual = solution.findRelativeRanks(nums);
        assertTrue(Arrays.equals(expected, actual));
    }
}
