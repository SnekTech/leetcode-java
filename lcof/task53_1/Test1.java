package lcof.task53_1;

import org.junit.Test;

import static org.junit.Assert.*;

public class Test1 {
    @Test
    public void example1() {
        int[] nums = new int[] {5,7,7,8,8,10};
        int target = 8;

        Solution solution = new Solution();
        int expected = 2;
        int actual = solution.search(nums, target);
        assertEquals(expected, actual);
    }

    @Test
    public void example2() {
        int[] nums = new int[] {5,7,7,8,8,10};
        int target = 6;

        Solution solution = new Solution();
        int expected = 0;
        int actual = solution.search(nums, target);
        assertEquals(expected, actual);
    }
}
