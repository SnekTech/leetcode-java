package leetcode.task1337;

/**
 * @see https://leetcode-cn.com/problems/the-k-weakest-rows-in-a-matrix/
 */
public class Solution {
    public int[] kWeakestRows(int[][] mat, int k) {
        int[] result = new int[k];

        int m = mat.length;
        int n = mat[0].length;
        int[] power = new int[mat.length];
        
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (mat[i][j] == 1) power[i]++;
            }
        }

        int count = 0;
        int min = Integer.MAX_VALUE;
        int min_index = 0;
        while (count < k) {
            for (int i = 0; i < power.length; i++) {
                if (power[i] < min) {
                    min = power[i];
                    min_index = i;
                }
            }
            result[count] = min_index;
            power[min_index] = Integer.MAX_VALUE;
            count++;
            min = Integer.MAX_VALUE;
            min_index = 0;
        }

        return result;
    }
}
