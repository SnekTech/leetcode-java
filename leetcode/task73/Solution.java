package leetcode.task73;

import java.util.HashSet;
import java.util.Set;

/**
 * @see <a href="https://leetcode-cn.com/problems/set-matrix-zeroes/">link</a>
 */
public class Solution {
    public void setZeroes(int[][] matrix) {
        int m = matrix.length, n = matrix[0].length;
        Set<Integer> zeroRows = new HashSet<>(m);
        Set<Integer> zeroCols = new HashSet<>(n);

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (matrix[i][j] == 0) {
                    zeroRows.add(i);
                    zeroCols.add(j);
                }
            }
        }

        for (int row : zeroRows) {
            for (int j = 0; j < n; j++) {
                matrix[row][j] = 0;
            }
        }

        for (int col : zeroCols) {
            for (int i = 0; i < m; i++) {
                matrix[i][col] = 0;
            }
        }
    }
}
