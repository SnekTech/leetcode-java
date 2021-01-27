package leetcode.task54;

import java.util.ArrayList;
import java.util.List;

/**
 * @see <a href="https://leetcode-cn.com/problems/spiral-matrix/">link</a>
 */
public class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> result = new ArrayList<>();

        if (matrix == null || matrix.length == 0) {
            return  result;
        }

        int m = matrix.length;
        int n = matrix[0].length;

        int startI = 0, startJ = 0;
        boolean verticalUnfinished = true, horizontalUnfinished = true;
        while (verticalUnfinished && horizontalUnfinished) {
            int i = startI, j = startJ;
            while (j < n - startJ) {
                result.add(matrix[i][j]);
                j++;
            }
            j--;

            i++;
            if (i >= m - startI) {
                break;
            }

            while (i < m - startI) {
                result.add(matrix[i][j]);
                i++;
            }
            i--;

            j--;
            if (j < startJ) {
                break;
            }

            while (j >= startJ) {
                result.add(matrix[i][j]);
                j--;
            }
            j++;

            i--;
            if (i <= startI) {
                break;
            }

            while (i > startI) {
                result.add(matrix[i][j]);
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
