package lcof.task13;

/**
 * @see <a href="https://leetcode-cn.com/problems/ji-qi-ren-de-yun-dong-fan-wei-lcof/">link</a>
 */
class Solution {
    int count = 0;

    public int movingCount(int m, int n, int k) {
        int[][] matrix = new int[m][n];
        boolean[][] visited = new boolean[m][n];

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if ((i / 10 + i % 10 + j / 10 + j % 10) > k) {
                    matrix[i][j] = -1;
                }
                else {
                    matrix[i][j] = 0;
                }
            }
        }

        dfs(matrix, visited, m, n, 0, 0);

        return count;
    }

    private void dfs(int[][] matrix, boolean[][] visited, int m, int n, int i, int j) {
        if (i < 0 || i >= m || j < 0 || j >= n) {
            return;
        }

        if (visited[i][j] || matrix[i][j] == -1) {
            return;
        }

        count++;
        visited[i][j] = true;
        int[][] offsets = new int[][] {{-1, 0}, {1, 0}, {0, -1}, {0, 1}};
        for (var offset : offsets) {
            int nextI = i + offset[0], nextJ = j + offset[1];
            dfs(matrix, visited, m, n, nextI, nextJ);
        }
    }
}