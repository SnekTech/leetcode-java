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

    @Test
    public void wrong1() {
        int[] nums = new int[] {1,1,1};

        Solution solution = new Solution();
        String expected = "111";
        String actual = solution.minNumber(nums);
        assertEquals(expected, actual);
    }

    @Test
    public void wrong2() {
        int[] nums = new int[] {824,938,1399,5607,6973,5703,9609,4398,8247};

        Solution solution = new Solution();
        String expected = "1399439856075703697382478249389609";
        String actual = solution.minNumber(nums);
        assertEquals(expected, actual);
    }

    @Test
    public void wrong3() {
        int[] nums = new int[] {121,12};

        Solution solution = new Solution();
        String expected = "12112";
        String actual = solution.minNumber(nums);
        assertEquals(expected, actual);
    }
}
