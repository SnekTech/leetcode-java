package leetcode.task42;

import org.junit.Test;

import static org.junit.Assert.*;

public class Test1 {
    @Test
    public void example1() {
        int[] height = new int[] {0,1,0,2,1,0,1,3,2,1,2,1};

        Solution solution = new Solution();
        int expected = 6;
        int actual = solution.trap(height);
        assertEquals(expected, actual);
    }

    @Test
    public void example2() {
        int[] height = new int[] {4,2,0,3,2,5};

        Solution solution = new Solution();
        int expected = 9;
        int actual = solution.trap(height);
        assertEquals(expected, actual);
    }
}
