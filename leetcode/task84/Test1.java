package leetcode.task84;

import org.junit.Test;

import static org.junit.Assert.*;

public class Test1 {
    @Test
    public void example1() {
        int[] heights = new int[] {2,1,5,6,2,3};
        
        Solution solution = new Solution();
        int expected = 10;
        int actual = solution.largestRectangleArea(heights);
        assertEquals(expected, actual);
    }
}
