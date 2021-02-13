package lcof.task42;

import org.junit.Test;

import static org.junit.Assert.*;

public class Test1 {
    @Test
    public void example() {
        int[] nums = new int[] {-2,1,-3,4,-1,2,1,-5,4};

        Solution solution = new Solution();
        int expected = 6;
        int actual = solution.maxSubArray(nums);
        assertEquals(expected, actual);
    }
}
