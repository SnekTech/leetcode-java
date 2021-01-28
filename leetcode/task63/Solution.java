package leetcode.task63;

/**
 * @see <a href="https://leetcode-cn.com/problems/unique-paths-ii/">link</a>
 */
public class Solution {
    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
        int m = obstacleGrid.length, n = obstacleGrid[0].length;
        int[][] f = new int[m][n];

        if (obstacleGrid[0][0] == 1 || obstacleGrid[m - 1][n - 1] == 1) {
            return 0;
        }

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (i == 0 && j == 0) {
                    f[i][j] = 1;
                    continue;
                }

                if (obstacleGrid[i][j] == 1) {
                    f[i][j] = 0;
                    continue;
                }

                if (i == 0) {
                    f[i][j] = f[i][j - 1];
                    continue;
                }
                if (j == 0) {
                    f[i][j] = f[i - 1][j];
                    continue;
                }

                f[i][j] = f[i - 1][j] + f[i][j - 1];
            }
        }

        return f[m - 1][n - 1];
    }
}
