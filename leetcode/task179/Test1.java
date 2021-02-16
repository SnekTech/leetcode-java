package leetcode.task179;

import org.junit.Test;

import static org.junit.Assert.*;

public class Test1 {
    @Test
    public void example1() {
        int[] nums = new int[] {10, 2};

        Solution solution = new Solution();
        String expected = "210";
        String actual = solution.largestNumber(nums);
        assertEquals(expected, actual);
    }

    @Test
    public void example2() {
        int[] nums = new int[] {3,30,34,5,9};

        Solution solution = new Solution();
        String expected = "9534330";
        String actual = solution.largestNumber(nums);
        assertEquals(expected, actual);
    }

    @Test
    public void example3() {
        int[] nums = new int[] {1};

        Solution solution = new Solution();
        String expected = "1";
        String actual = solution.largestNumber(nums);
        assertEquals(expected, actual);
    }

    @Test
    public void example4() {
        int[] nums = new int[] {10};

        Solution solution = new Solution();
        String expected = "10";
        String actual = solution.largestNumber(nums);
        assertEquals(expected, actual);
    }
}
