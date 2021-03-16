package lcof.task56_2;

import org.junit.Test;

import static org.junit.Assert.*;

public class Test1 {
    @Test
    public void example1() {
        int[] nums = new int[] {3,4,3,3};

        Solution solution = new Solution();
        int expected = 4;
        int actual = solution.singleNumber(nums);
        assertEquals(expected, actual);
    }

    @Test
    public void example2() {
        int[] nums = new int[] {9,1,7,9,7,9,7};

        Solution solution = new Solution();
        int expected = 1;
        int actual = solution.singleNumber(nums);
        assertEquals(expected, actual);
    }
}
