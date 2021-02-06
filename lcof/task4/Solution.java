package lcof.task4;

/**
 * @see <a href="https://leetcode-cn.com/problems/er-wei-shu-zu-zhong-de-cha-zhao-lcof/">link</a>
 */
public class Solution {
    public boolean findNumberIn2DArray(int[][] matrix, int target) {
        if (matrix == null) {
            return false;
        }

        int m = matrix.length;
        if (m == 0) {
            return false;
        }
        int n = matrix[0].length;
        if (n == 0) {
            return false;
        }

        int i = m - 1, j = 0;
        while (i >= 0 && j < n) {
            if (target == matrix[i][j]) {
                return true;
            }
            else if (target > matrix[i][j]) {
                j++;
            }
            else {
                i--;
            }
        }

        return false;
    }
}
