package leetcode.task1351;

/**
 * @see https://leetcode-cn.com/problems/count-negative-numbers-in-a-sorted-matrix/
 */
public class Solution {
    public int countNegatives(int[][] grid) {
        int m = grid.length;
        int n = grid[0].length;
        int negativeCount = m * n;

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (grid[i][j] >= 0) {
                    negativeCount--;
                }
                else {
                    break;
                }
            }
        }

        return negativeCount;
    }
}
