package leetcode.task130;

/**
 * @see <a href="https://leetcode-cn.com/problems/surrounded-regions/">link</a>
 */
class Solution {
    int m;
    int n;

    boolean inBounds(int i, int j) {
        return i >= 0 && i < m && j >= 0 && j < n;
    }

    public void solve(char[][] board) {
        m = board.length;
        n = board[0].length;

        for (int i = 0; i < m; i++) {
            dfs(board, i, 0);
            dfs(board, i, n - 1);
        }

        for (int j = 1; j < n - 1; j++) {
            dfs(board, 0, j);
            dfs(board, m - 1, j);
        }

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (board[i][j] == 'A') {
                    board[i][j] = 'O';
                }
                else if (board[i][j] == 'O') {
                    board[i][j] = 'X';
                }
            }
        }
    }

    void dfs(char[][] board, int i, int j) {
        if (!inBounds(i, j) || board[i][j] != 'O') {
            return;
        }

        board[i][j] = 'A';
        dfs(board, i - 1, j);
        dfs(board, i, j + 1);
        dfs(board, i + 1, j);
        dfs(board, i, j - 1);
    }
}