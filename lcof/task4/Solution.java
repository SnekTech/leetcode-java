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

        int low = 0, high = m - 1;
        while (low < high) {
            int mid = low + (high - low) / 2;
            if (target == matrix[mid][0]) {
                return true;
            }
            else if (target > matrix[mid][0]) {
                low =  mid + 1;
            }
            else {
                high = Math.max(low, mid - 1);
            }
        }

        assert low == high;
        int maxM = low + 1;
        for (int i = 0; i < maxM; i++) {
            low = 0;
            high = n - 1;
            while (low <= high) {
                int mid = low + (high - low) / 2;
                if (target == matrix[i][mid]) {
                    return true;
                }
                else if (target > matrix[i][mid]) {
                    low = mid + 1;
                }
                else {
                    high = mid -1;
                }
            }
        }

        return false;
    }
}
