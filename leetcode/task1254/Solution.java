package leetcode.task1254;

/**
 * @see https://leetcode-cn.com/problems/number-of-closed-islands/
 */
public class Solution {
    public int closedIsland(int[][] grid) {
        int m = grid.length;
        int n = grid[0].length;
        assert(m >= 1);
        assert(n >= 1);
        boolean[][] visited = new boolean[m][n];
        setMatrix(visited, m, n, false);

        int count = 0;

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (grid[i][j] == 1 || visited[i][j]) {
                    // water
                    continue;
                }

                boolean reachedBoundary = dfs(grid, i, j, m, n, visited);
                if (!reachedBoundary) {
                    count++;
                }
            }
        }

        return count;
    }

    private boolean dfs(int[][] grid, int i, int j, int m, int n, boolean[][] visited) {
        if (i < 0 || i >= m || j < 0 || j >= n) {
            // out of index
            return true;
        }

        if (visited[i][j] || grid[i][j] == 1) {
            return false;
        }

        visited[i][j] = true;
        boolean upReachedBoundary = dfs(grid, i - 1, j, m, n, visited);
        boolean downReachedBoundary = dfs(grid, i + 1, j, m, n, visited);
        boolean leftReachedBoundary = dfs(grid, i, j - 1, m, n, visited);
        boolean rightReachedBoundary = dfs(grid, i, j + 1, m, n, visited);
       
        return upReachedBoundary || downReachedBoundary || leftReachedBoundary || rightReachedBoundary;
    }

    private void setMatrix(boolean[][] matrix, int m, int n, boolean value) {
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                matrix[i][j] = value;
            }
        }
    }
}
