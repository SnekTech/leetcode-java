package lcof.task59_1;

import org.junit.Test;

import static org.junit.Assert.*;

public class Test1 {
    @Test
    public void example1() {
        int[] nums = new int[] {1,3,-1,-3,5,3,6,7};
        int k = 3;
        
        Solution solution = new Solution();
        int[] expected = new int[] {3,3,5,5,6,7};
        int[] actual = solution.maxSlidingWindow(nums, k);
        assertArrayEquals(expected, actual);
    }
}
