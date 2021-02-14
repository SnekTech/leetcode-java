package lcof.task45;

import org.junit.Test;

import static org.junit.Assert.*;

public class Test1 {
    @Test
    public void example1() {
        int[] nums = new int[] {10, 2};

        Solution solution = new Solution();
        String expected = "102";
        String actual = solution.minNumber(nums);
        assertEquals(expected, actual);
    }

    @Test
    public void example2() {
        int[] nums = new int[] {3,30,34,5,9};

        Solution solution = new Solution();
        String expected = "3033459";
        String actual = solution.minNumber(nums);
        assertEquals(expected, actual);
    }
}
