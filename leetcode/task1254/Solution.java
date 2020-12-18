package leetcode.task1254;

import java.util.ArrayList;
import java.util.List;

/**
 * @see https://leetcode-cn.com/problems/number-of-closed-islands/
 */
public class Solution {
    private class Land {
        public int i;
        public int j;

        public Land(int i, int j) {
            this.i = i;
            this.j = j;
        }
    }

    public int closedIsland(int[][] grid) {
        int m = grid.length;
        int n = grid[0].length;
        assert(m >= 1);
        assert(n >= 1);
        boolean[][] visited = getEmptyVisitedMatrix(m, n);

        List<List<Land>> results = new ArrayList<>();

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (grid[i][j] == 1) {
                    // water
                    visited[i][j] = true;
                    continue;
                }

                List<Land> island = new ArrayList<>();
                dfs(grid, i, j, m, n, island, visited);
                if (!island.isEmpty()) {
                    Land land = island.get(0);
                    boolean[][] localVisited = getEmptyVisitedMatrix(m, n);
                    
                    if (isSurroundedByWater(grid, land.i, land.j, m, n, localVisited)) {
                        results.add(island);
                    }
                }
            }
        }

        return results.size();
    }

    private void dfs(int[][] grid, int i, int j, int m, int n, List<Land> island, boolean[][] visited) {
        assert(m == visited.length);
        assert(n == visited[0].length);
        
        if (i < 0 || i >= m || j < 0 || j >= n) {
            // out of index
            return;
        }

        if (visited[i][j]) {
            // this position is visited
            return;
        }

        if (grid[i][j] == 1) {
            // water
            return;
        }

        island.add(new Land(i, j));
        visited[i][j] = true;
        dfs(grid, i - 1, j, m, n, island, visited);
        dfs(grid, i + 1, j, m, n, island, visited);
        dfs(grid, i, j - 1, m, n, island, visited);
        dfs(grid, i, j + 1, m, n, island, visited);
    }

    private boolean isSurroundedByWater(int[][] grid, int i, int j, int m, int n, boolean[][] visited) {
        if (i < 0 || i >= m || j < 0 || j >= n) {
            // out of index
            return false;
        }

        if (grid[i][j] == 1) {
            return true;
        }

        if (visited[i][j]) {
            // going back to visited does not affect the result
            return true;
        }

        visited[i][j] = true;

        return isSurroundedByWater(grid, i - 1, j, m, n, visited) &&
            isSurroundedByWater(grid, i + 1, j, m, n, visited) &&
            isSurroundedByWater(grid, i, j - 1, m, n, visited) &&
            isSurroundedByWater(grid, i, j + 1, m, n, visited);
    }

    private boolean[][] getEmptyVisitedMatrix(int m, int n) {
        boolean[][] visited = new boolean[m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                visited[i][j] = false;
            }
        }
        return visited;
    }
}
