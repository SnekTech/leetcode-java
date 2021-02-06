package lcof.task11;

import org.junit.Test;

import static org.junit.Assert.*;

public class Test1 {
    @Test
    public void example1() {
        int[] nums = new int[] {3,4,5,1,2};

        Solution solution = new Solution();
        int expected = 1;
        int actual = solution.minArray(nums);
        assertEquals(expected, actual);
    }

    @Test
    public void example2() {
        int[] nums = new int[] {2,2,2,0,1};

        Solution solution = new Solution();
        int expected = 0;
        int actual = solution.minArray(nums);
        assertEquals(expected, actual);
    }
}
