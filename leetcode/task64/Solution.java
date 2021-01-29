package leetcode.task64;

/**
 * @see <a href="https://leetcode-cn.com/problems/minimum-path-sum/">link</a>
 */
public class Solution {
    public int minPathSum(int[][] grid) {
        int m = grid.length, n = grid[0].length;
        int[][] f = new int[m][n];
        f[0][0] = grid[0][0];

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (i == 0 && j == 0) {
                    continue;
                }

                if (i == 0) {
                    f[0][j] = f[0][j - 1] + grid[0][j];
                    continue;
                }
                if (j == 0) {
                    f[i][0] = f[i - 1][0] + grid[i][0];
                    continue;
                }

                f[i][j] = Math.min(f[i][j - 1], f[i - 1][j]) + grid[i][j];
            }
        }

        return f[m - 1][n - 1];
    }
}
