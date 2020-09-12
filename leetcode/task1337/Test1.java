package leetcode.task1337;

import static org.junit.Assert.assertArrayEquals;

import org.junit.Test;

public class Test1 {
    @Test
    public void example() {
        int[][] mat = new int[][] {
            {1,1,0,0,0},
            {1,1,1,1,0},
            {1,0,0,0,0},
            {1,1,0,0,0},
            {1,1,1,1,1}
        };
        int k = 3;
        int[] expecteds = new int[] {2, 0 ,3};

        int[] actuals = new Solution().kWeakestRows(mat, k);
        assertArrayEquals(expecteds, actuals);
    }
}
