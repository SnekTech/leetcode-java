package leetcode.task1;

import static org.junit.Assert.assertArrayEquals;
import org.junit.Test;

public class Task1Test {
    @Test
    public void demo() {
        int[] nums = {2, 7, 11, 15};
        int target = 9;
        int[] expecteds = { 0, 1 };

        Solution solution = new Solution();
        int[] actuals = solution.twoSum(nums, target);


        assertArrayEquals(expecteds, actuals);
    }

    @Test
    public void wrong1() {
        int[] nums = { 3, 2, 4 };
        int target = 6;
        int[] expecteds = { 1, 2 };

        Solution solution = new Solution();
        int[] actuals = solution.twoSum(nums, target);


        assertArrayEquals(expecteds, actuals);
    }

    @Test
    public void wrong2() {
        int[] nums = { 3, 3 };
        int target = 6;
        int[] expecteds = { 0, 1 };

        Solution solution = new Solution();
        int[] actuals = solution.twoSum(nums, target);


        assertArrayEquals(expecteds, actuals);
    }

    @Test
    public void wrong3() {
        int[] nums = { 2, 5, 5, 11 };
        int target = 10;
        int[] expecteds = { 1, 2 };

        Solution solution = new Solution();
        int[] actuals = solution.twoSum(nums, target);


        assertArrayEquals(expecteds, actuals);
    }
}
