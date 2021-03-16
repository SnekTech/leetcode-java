package lcof.task57_1;

import org.junit.Test;

import static org.junit.Assert.*;

public class Test1 {
    @Test
    public void example1() {
        int[] nums = new int[] {2,7,11,15};
        int target = 9;

        Solution solution = new Solution();
        var actual = solution.twoSum(nums, target);
        assertTrue(true);
    }

    @Test
    public void example2() {
        int[] nums = new int[] {10,26,30,31,47,60};
        int target = 40;

        Solution solution = new Solution();
        var actual = solution.twoSum(nums, target);
        assertTrue(true);
    }
}
