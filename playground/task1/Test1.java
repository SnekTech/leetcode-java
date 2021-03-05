package playground.task1;

import org.junit.Test;

import static org.junit.Assert.*;

public class Test1 {
    @Test
    public void example1() {
        // n = 3
        int[] nums = new int[] {1, 2, 3, 3};

        Solution solution = new Solution();
        int expected = 3;
        int actual = solution.find(nums);
        assertEquals(expected, actual);
    }

    @Test
    public void example2() {
        // n = 3
        int[] nums = new int[] {2, 2, 3, 1};

        Solution solution = new Solution();
        int expected = 2;
        int actual = solution.find(nums);
        assertEquals(expected, actual);
    }
}
