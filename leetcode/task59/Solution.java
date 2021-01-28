package leetcode.task59;

/**
 * @see <a href="https://leetcode-cn.com/problems/spiral-matrix-ii/">link</a>
 */
public class Solution {
    public int[][] generateMatrix(int n) {
        int[][] matrix = new int[n][n];

        int elem = 1, startI = 0, i, j;
        boolean unfinished = true;

        while (unfinished) {
            i = startI;
            j = startI;

            while (j < n - startI) {
                matrix[i][j] = elem++;
                j++;
            }
            j--;

            i++;
            if (i >= n - startI) {
                break;
            }

            while (i < n - startI) {
                matrix[i][j] = elem++;
                i++;
            }
            i--;

            j--;

            while (j >= startI) {
                matrix[i][j] = elem++;
                j--;
            }
            j++;

            i--;

            while (i > startI) {
                matrix[i][j] = elem++;
                i--;
            }

            startI++;
            unfinished = n % 2 == 0 ? startI < n / 2 : startI <= n / 2;
        }

        return matrix;
    }
}
