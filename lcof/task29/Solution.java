package lcof.task29;

/**
 * @see <a href="https://leetcode-cn.com/problems/shun-shi-zhen-da-yin-ju-zhen-lcof/">link</a>
 */
@SuppressWarnings("DuplicatedCode")
class Solution {
    public int[] spiralOrder(int[][] matrix) {

        if (matrix == null || matrix.length == 0 || matrix[0].length == 0) {
            return new int[] {};
        }


        int m = matrix.length;
        int n = matrix[0].length;

        int[] result = new int[m * n];
        int insertPos = 0;

        int startI = 0, startJ = 0;
        boolean verticalUnfinished = true, horizontalUnfinished = true;
        while (verticalUnfinished && horizontalUnfinished) {
            int i = startI, j = startJ;
            while (j < n - startJ) {
                result[insertPos++] = matrix[i][j];
                j++;
            }
            j--;

            i++;
            if (i >= m - startI) {
                break;
            }

            while (i < m - startI) {
                result[insertPos++] = matrix[i][j];
                i++;
            }
            i--;

            j--;
            if (j < startJ) {
                break;
            }

            while (j >= startJ) {
                result[insertPos++] = matrix[i][j];
                j--;
            }
            j++;

            i--;
            if (i <= startI) {
                break;
            }

            while (i > startI) {
                result[insertPos++] = matrix[i][j];
                i--;
            }

            startI++;
            startJ++;
            verticalUnfinished = m % 2 == 0 ? startI < m / 2 : startI <= m / 2;
            horizontalUnfinished = n % 2 == 0 ? startJ < n / 2 : startJ <= n / 2;
        }

        return result;
    }
}