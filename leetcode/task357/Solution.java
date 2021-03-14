package leetcode.task357;

/**
 * @see <a href="https://leetcode-cn.com/problems/count-numbers-with-unique-digits/">link</a>
 */
class Solution {
    public int countNumbersWithUniqueDigits(int n) {
        if (n == 0) {
            return 1;
        }

        int[] dp = new int[n + 1];
        if (n > 0) {
            dp[1] = 10;
        }
        if (n > 1) {
            dp[2] = 81;
        }
        for (int i = 3; i <= n; i++) {
            dp[i] = dp[i - 1] * (10 - (i - 1));
        }

        int count = 0;
        for (var x : dp) {
            count += x;
        }

        return count;
    }
}