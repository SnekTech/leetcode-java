package lcof.task3;

import org.junit.Test;

import static org.junit.Assert.*;

public class Test1 {
    @Test
    public void example() {
        int[] nums = new int[] { 2, 3, 1, 0, 2, 5, 3 };

        Solution solution = new Solution();
        int expected1 = 2;
        int expected2 = 3;
        int actual = solution.findRepeatNumber(nums);
        assertTrue(actual == expected1 || actual == expected2);
    }
}
