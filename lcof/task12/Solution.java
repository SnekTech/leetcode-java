package lcof.task12;

/**
 * @see <a href="https://leetcode-cn.com/problems/ju-zhen-zhong-de-lu-jing-lcof/">link</a>
 */
class Solution {
    public boolean exist(char[][] board, String word) {
        int m = board.length, n = board[0].length;
        boolean[][] visited = new boolean[m][n];

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (check(visited, board, i, j, word, 0)) {
                    return true;
                }
            }
        }

        return false;
    }

    private boolean check(boolean[][] visited, char[][] board, int i, int j, String word, int k) {
        if (board[i][j] != word.charAt(k)) {
            return false;
        }
        if (k == word.length() - 1) {
            return true;
        }

        visited[i][j] = true;
        int[][] offsets = {{-1, 0}, {1, 0}, {0, -1}, {0, 1}};
        for (var offset : offsets) {
            int newI = i + offset[0];
            int newJ = j + offset[1];

            if (newI >= 0 && newI < visited.length && newJ >= 0 && newJ < visited[0].length && !visited[newI][newJ]) {
                if (check(visited, board, newI, newJ, word, k + 1)) {
                    return true;
                }
            }
        }

        visited[i][j] = false;

        return false;
    }
}