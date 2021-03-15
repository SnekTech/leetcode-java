package lcof.task53_2;

import org.junit.Test;

import static org.junit.Assert.*;

public class Test1 {
    @Test
    public void example1() {
        int[] nums = new int[] {0,1,3};
        
        Solution solution = new Solution();
        int expected = 2;
        int actual = solution.missingNumber(nums);
        assertEquals(expected, actual);
    }

    @Test
    public void example2() {
        int[] nums = new int[] {0,1,2,3,4,5,6,7,9};

        Solution solution = new Solution();
        int expected = 8;
        int actual = solution.missingNumber(nums);
        assertEquals(expected, actual);
    }

    @Test
    public void wrong1() {
        int[] nums = new int[] {0};

        Solution solution = new Solution();
        int expected = 1;
        int actual = solution.missingNumber(nums);
        assertEquals(expected, actual);
    }

    @Test
    public void wrong2() {
        int[] nums = new int[] {1};

        Solution solution = new Solution();
        int expected = 0;
        int actual = solution.missingNumber(nums);
        assertEquals(expected, actual);
    }

    @Test
    public void wrong3() {
        int[] nums = new int[] {0,1};

        Solution solution = new Solution();
        int expected = 2;
        int actual = solution.missingNumber(nums);
        assertEquals(expected, actual);
    }
}
