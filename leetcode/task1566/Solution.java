package leetcode.task1566;

/**
 * @see https://leetcode-cn.com/problems/detect-pattern-of-length-m-repeated-k-or-more-times/
 */
public class Solution {
    public boolean containsPattern(int[] arr, int m, int k) {
        int[] pattern = new int[m];
        int count = 0;
        int maxCount = 0;

        for (int i = 0; i + m - 1 < arr.length; i++) {

            // store pattern
            for (int j = i; j - i < m; j++) {
                pattern[j - i] = arr[j];
            }

            // count pattern
            count = 0;
            boolean same = true;
            for (int j = i; j + m - 1 < arr.length && same; j += m) {
                for (int l = j; l - j < m; l++) {
                    if (arr[l] != pattern[l - j]) {
                        same = false;
                    }
                }

                if (same) {
                    count++;
                }
            }

            // store count
            maxCount = Math.max(count, maxCount);
        }

        return maxCount >= k;
    }
}
