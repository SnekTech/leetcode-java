package lcof.task60;

import java.util.Arrays;

/**
 * @see <a href="https://leetcode-cn.com/problems/nge-tou-zi-de-dian-shu-lcof/">link</a>
 */
class Solution {
    public double[] dicesProbability(int n) {
        double[] dp = new double[6];
        Arrays.fill(dp, 1 / 6.0);

        for (int i = 2; i <= n; i++) {
            double[] nextDP = new double[i * 5 + 1];
            for (int j = 0; j < dp.length; j++) {
                for (int k = 0; k < 6; k++) {
                    nextDP[j + k] += dp[j] / 6.0;
                }
            }
            dp = nextDP;
        }

        return dp;
    }
}