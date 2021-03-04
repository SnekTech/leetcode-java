package leetcode.task53;

import org.junit.Test;

import static org.junit.Assert.*;

@SuppressWarnings("DuplicatedCode")
public class Test1 {
    @Test
    public void example1() {
        int[] nums = new int[] {-2,1,-3,4,-1,2,1,-5,4};

        Solution solution = new Solution();
        int expected = 6;
        int actual = solution.maxSubArray(nums);
        assertEquals(expected, actual);
    }

    @Test
    public void example2() {
        int[] nums = new int[] {1};

        Solution solution = new Solution();
        int expected = 1;
        int actual = solution.maxSubArray(nums);
        assertEquals(expected, actual);
    }

    @Test
    public void example3() {
        int[] nums = new int[] {0};

        Solution solution = new Solution();
        int expected = 0;
        int actual = solution.maxSubArray(nums);
        assertEquals(expected, actual);
    }

    @Test
    public void example4() {
        int[] nums = new int[] {-1};

        Solution solution = new Solution();
        int expected = -1;
        int actual = solution.maxSubArray(nums);
        assertEquals(expected, actual);
    }

    @Test
    public void example5() {
        int[] nums = new int[] {-100000};

        Solution solution = new Solution();
        int expected = -100000;
        int actual = solution.maxSubArray(nums);
        assertEquals(expected, actual);
    }
}
