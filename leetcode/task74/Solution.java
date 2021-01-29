package leetcode.task74;

/**
 * @see <a href="https://leetcode-cn.com/problems/search-a-2d-matrix/">link</a>
 */
public class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int m = matrix.length;
        int n = matrix[0].length;
        int low = 0, high = m * n - 1;
        int mid, i, j;

        while (low <= high) {
            mid = low + (high - low) / 2;
            i = mid / n;
            j = mid % n;
            int element = matrix[i][j];

            if (target == element) {
                return true;
            }
            else if (target < element) {
                high = mid - 1;
            }
            else {
                low = mid + 1;
            }
        }

        return false;
    }
}
