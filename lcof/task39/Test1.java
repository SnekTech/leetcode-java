package lcof.task39;

import org.junit.Test;

import static org.junit.Assert.*;

public class Test1 {
    @Test
    public void example() {
        int[] nums = new int[] {1, 2, 3, 2, 2, 2, 5, 4, 2};

        Solution solution = new Solution();
        int expected = 2;
        int actual = solution.majorityElement(nums);
        assertEquals(expected, actual);
    }
}
