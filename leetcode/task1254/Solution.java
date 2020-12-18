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

    private enum LandState {
        Unset,
        Open,
        Closed
    }

    public int closedIsland(int[][] grid) {
        int m = grid.length;
        int n = grid[0].length;
        assert(m >= 1);
        assert(n >= 1);
        boolean[][] visited = new boolean[m][n];
        LandState[][] states = new LandState[m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < m; j++) {
                states[i][j] = LandState.Unset;
            }
        }
        setMatrix(visited, m, n, false);

        List<List<Land>> results = new ArrayList<>();

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (grid[i][j] == 1) {
                    // water
                    continue;
                }

                List<Land> island = new ArrayList<>();
                LandState state = dfs(grid, i, j, m, n, island, visited, states);
                if (state != LandState.Open) {
                    if (!island.isEmpty()) {
                        results.add(island);
                    }
                    if (state == LandState.Unset) {
                        for (Land land : island) {
                            states[land.i][land.j] = LandState.Closed;
                        }
                    }
                }
            }
        }

        return results.size();
    }

    private LandState dfs(int[][] grid, int i, int j, int m, int n, List<Land> island, boolean[][] visited, LandState[][] states) {
        if (i < 0 || i >= m || j < 0 || j >= n) {
            // out of index
            return LandState.Open;
        }

        if (visited[i][j]) {
            // going back to visited does not affect the result
            LandState state = states[i][j];
            return state;
        }

        if (grid[i][j] == 1) {
            // water
            return LandState.Closed;
        }

        visited[i][j] = true;
        LandState upState = dfs(grid, i - 1, j, m, n, island, visited, states);
        if (upState == LandState.Open) {
            states[i][j] = LandState.Open;
            return LandState.Open;
        }
        LandState downState = dfs(grid, i + 1, j, m, n, island, visited, states);
        if (downState == LandState.Open) {
            states[i][j] = LandState.Open;
            return LandState.Open;
        }
        LandState leftState = dfs(grid, i, j - 1, m, n, island, visited, states);
        if (leftState == LandState.Open) {
            states[i][j] = LandState.Open;
            return LandState.Open;
        }
        LandState rightState = dfs(grid, i, j + 1, m, n, island, visited, states);
        if (rightState == LandState.Open) {
            states[i][j] = LandState.Open;
            return LandState.Open;
        }
        
        island.add(new Land(i, j));
        
        if (upState == LandState.Unset || downState == LandState.Unset || 
        leftState == LandState.Unset || rightState == LandState.Unset) {
            return LandState.Unset;
        }
        
        states[i][j] = LandState.Closed;

        return LandState.Closed;
    }

    private void setMatrix(boolean[][] matrix, int m, int n, boolean value) {
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                matrix[i][j] = value;
            }
        }
    }
}
