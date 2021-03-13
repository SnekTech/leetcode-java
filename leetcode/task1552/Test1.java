package leetcode.task1552;

import org.junit.Test;

import static org.junit.Assert.*;

public class Test1 {
    @Test
    public void example1() {
        int[] position = new int[] {1,2,3,4,7};
        int m = 3;

        Solution solution = new Solution();
        int expected = 3;
        int actual = solution.maxDistance(position, m);
        assertEquals(expected, actual);
    }

    @Test
    public void example2() {
        int[] position = new int[] {5,4,3,2,1,1000000000};
        int m = 2;

        Solution solution = new Solution();
        int expected = 999999999;
        int actual = solution.maxDistance(position, m);
        assertEquals(expected, actual);
    }
}
