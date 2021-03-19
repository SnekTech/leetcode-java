package lcof.task61;

import org.junit.Test;

import static org.junit.Assert.*;

public class Test1 {
    @Test
    public void example1() {
        int[] nums = new int[] {1,2,3,4,5};

        Solution solution = new Solution();
        boolean actual = solution.isStraight(nums);
        assertTrue(actual);
    }

    @Test
    public void example2() {
        int[] nums = new int[] {0,0,1,2,5};

        Solution solution = new Solution();
        boolean actual = solution.isStraight(nums);
        assertTrue(actual);
    }
}
