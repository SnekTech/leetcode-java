package leetcode.task128;

import org.junit.Test;

import static org.junit.Assert.*;

public class Test1 {
    @Test
    public void example1() {
        int[] nums = new int[] {100,4,200,1,3,2};
        
        Solution solution = new Solution();
        int expected = 4;
        int actual = solution.longestConsecutive(nums);
        assertEquals(expected, actual);
    }

    @Test
    public void example2() {
        int[] nums = new int[] {0,3,7,2,5,8,4,6,0,1};

        Solution solution = new Solution();
        int expected = 9;
        int actual = solution.longestConsecutive(nums);
        assertEquals(expected, actual);
    }
}
