package lcof.task14_1;

/**
 * @see <a href="https://leetcode-cn.com/problems/jian-sheng-zi-lcof/">link</a>
 */
class Solution {
    public int cuttingRope(int n) {
        int[] dp = new int[n + 1];
        for (int i = 2; i <= n; i++) {
            for (int j = 1; j < i; j++) {
                dp[i] = Math.max(dp[i], Math.max(j * (i - j), j * dp[i - j]));
            }
        }

        return dp[n];
    }
}