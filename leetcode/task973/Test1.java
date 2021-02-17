package leetcode.task973;

import org.junit.Test;

import static org.junit.Assert.*;

public class Test1 {
    @Test
    public void example1() {
        int[][] points = new int[][] {
                {1, 3},
                {-2, 2}
        };
        int k = 1;

        Solution solution = new Solution();
        var actual = solution.kClosest(points, k);
        assertTrue(true);
    }

    @Test
    public void example2() {
        int[][] points = new int[][] {
                {3, 3},
                {5, -1},
                {-2, 4}
        };
        int k = 2;

        Solution solution = new Solution();
        var actual = solution.kClosest(points, k);
        assertTrue(true);
    }
}
