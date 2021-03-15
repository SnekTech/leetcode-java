package lcof.task56_1;

import org.junit.Test;

import static org.junit.Assert.*;

public class Test1 {
    @Test
    public void example1() {
        int[] nums = new int[] {4,1,4,6};
        
        Solution solution = new Solution();
        var actual = solution.singleNumbers(nums);
        assertTrue(true);
    }

    @Test
    public void example2() {
        int[] nums = new int[] {1,2,10,4,1,4,3,3};

        Solution solution = new Solution();
        var actual = solution.singleNumbers(nums);
        assertTrue(true);
    }
}
